package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="      All server errors EXCEPT for 503. An unexpected error has occurred.")
public class Code5xxServerErrorResponse 
{
	@ApiModelProperty(value="mailpieceId", example="090367574000000FE1E1B")
	@JsonProperty	
	private String mailPieceId;
	
	@ApiModelProperty("")
	@JsonProperty
	private Code404FooterError integrationFooter;
}
