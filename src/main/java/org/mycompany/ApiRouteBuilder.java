package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ApiRouteBuilder extends RouteBuilder
{

	@Override
	public void configure() throws Exception {
//        restConfiguration()
//        .contextPath("/camel-rest-jpa").apiContextPath("/api-doc")
//            .apiProperty("api.title", "Camel REST API")
//            .apiProperty("api.version", "1.0")
//            .apiProperty("cors", "true")
//            .apiContextRouteId("doc-api")
//        .component("servlet")
//        .bindingMode(RestBindingMode.json);
//        
//        rest("/say/hello")
//        	.get().route().transform().constant("Hello World");        

//    rest("/books").description("Books REST service")
//        .get("/").description("The list of all the books")
//            .route().routeId("books-api")
//            .bean(Database.class, "findBooks")
//            .endRest()
//        .get("order/{id}").description("Details of an order by id")
//            .route().routeId("order-api")
//            .bean(Database.class, "findOrder(${header.id})");		
	}
}
