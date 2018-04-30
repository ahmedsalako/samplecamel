package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestDefinition;
import org.apache.camel.model.rest.RestOperationParamDefinition;
import org.apache.camel.model.rest.RestParamType;
import org.mycompany.events.EventResponse;
import org.mycompany.events.SummaryResponse;
import org.mycompany.swagger.Code401UnauthorizedResponse;
import org.mycompany.swagger.Code404NotFoundResponse;
import org.mycompany.swagger.Code503ServiceUnavailableResponse;
import org.mycompany.swagger.Code5xxServerErrorResponse;
import org.springframework.stereotype.Component;

@Component
public class TrackingApiRouteBuilder extends RouteBuilder
{
	
	final String defaultLanguage = "en";
	
	
	private void setLanguageParameterDefinition(RestDefinition restDefinition) 
	{
		String[] values = {"en", "cy", "en_GB", "cy_CY"};
		
		restDefinition.param().name("X-RMG-Language")
					.type(RestParamType.header)
						.description("Language code to receive tracking data in specified language. For markup\r\n" + 
				"      language responses, use 'en_GB' (English) or 'cy_CY' (Welsh). Otherwise,\r\n" + 
				"      use 'en' or 'cy' for non-markup responses.")
						
				.dataType("string").allowableValues(values).defaultValue(defaultLanguage).required(true)
				
				
		.endParam();		
	}
	
	private void setClientIdParameterDefinition(RestDefinition restDefinition)
	{
		restDefinition.param().name("X-RMG-Client-Id")
					.type(RestParamType.header)
						.description("Identifier given to the service consumer to access this API.")
							.dataType("string")
							.required(true)
							
		.endParam();
	}
	
	private void setMailPieceIdParameterDefinition(RestDefinition restDefinition) 
	{
		restDefinition.param().name("mailPieceId")
		.type(RestParamType.path)
			.description("1D or 2D barcode tracking number of the mail item being queried.")
				.dataType("string")
				.required(true)
				//need to find a way to specify regex pattern
				
		.endParam();		
	}

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
			.contextPath("/mailpieces/v2/")
			.apiContextPath("/api/swagger")			
			.apiProperty("api.title", "Tracking API REST")
			.apiProperty("api.version", "2.0")
			.apiProperty("cors", "true")
			.apiProperty("host", "") //by default 0.0.0.0
			.apiProperty("schemes", "http") //by default http
			.dataFormatProperty("prettyPrint", "true")
			
		.apiContextRouteId("doc-api").component("servlet").bindingMode(RestBindingMode.json);
		
		rest().description("GET mailpieces/v2/{mailPieceId}/events")		
						.produces("application/json")
						.consumes("application/json")
					.skipBindingOnErrorCode(false) //Enable json marshalling for body in case of errors

		.get("{mailPieceId}/events")	
			  .description("The behaviour of the events operation is to provide a history of tracks")
			  .description("for a single mail item. This operation returns the summary, signature")
			  .description("metadata, estimated delivery window and events for a supplied tracking number.")
			  
			.responseMessage().code(200).responseModel(EventResponse.class).endResponseMessage()
			.responseMessage().code(401).responseModel(Code401UnauthorizedResponse.class).endResponseMessage()
			.responseMessage().code(404).responseModel(Code404NotFoundResponse.class).endResponseMessage()
			.responseMessage().code(500).responseModel(Code5xxServerErrorResponse.class).endResponseMessage()
			.responseMessage().code(503).responseModel(Code503ServiceUnavailableResponse.class).endResponseMessage()
			  .route().routeId("events-process")
			    .log("Get user: ${header.id}")
			  .endRest()
	  	
//		setClientIdParameterDefinition(eventsDefinition);
//		setLanguageParameterDefinition(eventsDefinition);	
//		setMailPieceIdParameterDefinition(eventsDefinition);	
		
			
		.get("summary/").id("summary")
				.description("        The behaviour of the summary operation is to allow customers to obtain\r\n" + 
						"        the latest tracking data for a mail item. This operation returns the\r\n" + 
						"        summary of one or more tracking numbers provided in the request. This\r\n" + 
						"        operation allows tracking numbers to be provided in the mailPieceId\r\n" + 
						"        query parameter via a comma separated list.")
				
		.responseMessage().code(401).responseModel(SummaryResponse.class).endResponseMessage()
		.responseMessage().code(500).responseModel(Code5xxServerErrorResponse.class).endResponseMessage()
		.responseMessage().code(503).responseModel(Code503ServiceUnavailableResponse.class).endResponseMessage()				
		  .route().routeId("summary-process")
		    .log("Get user: ${header.id}")
		  .endRest();				
		
	}	
}
