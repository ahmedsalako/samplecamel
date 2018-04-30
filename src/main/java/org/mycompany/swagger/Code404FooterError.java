package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public class Code404FooterError 
{
	@ApiModelProperty(value="Integration error code", example="E1144")
	@JsonProperty
	private String errorCode;
	
	@ApiModelProperty(example="Proof of delivery is not available for barcode reference 090367574000000FE1E1B")
	@JsonProperty	
	private String errorDescription;
		
	@ApiModelProperty(example="Proof of delivery information is not yet available")
	@JsonProperty	
	private String errorCause;
	
	@ApiModelProperty(example="Please try again later. It can take up to 72 hours after delivery for the Proof of Delivery information to become available")
	@JsonProperty	
	private String errorResolution;
}
