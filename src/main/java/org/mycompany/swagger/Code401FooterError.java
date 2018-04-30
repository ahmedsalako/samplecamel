package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="errors", discriminator="errors")
@JsonClassDescription("integrationFooter")
public class Code401FooterError 
{
	@ApiModelProperty(value="Integration error code", example="E0007")
	@JsonProperty
	private String errorCode;
	
	@ApiModelProperty(example="Authorisation failure")
	@JsonProperty	
	private String errorDescription;
		
	@ApiModelProperty(example="invalid or missing security credentials provided in API request")
	@JsonProperty	
	private String errorCause;
	
	@ApiModelProperty(example="Please re-submit your API request with the correct security credentials")
	@JsonProperty	
	private String errorResolution;
}
