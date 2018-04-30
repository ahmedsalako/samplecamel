package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="      Service Unavailable. \r\n" + 
		"\r\n" + 
		"      The API service is currently unavailable. The following 503 error messages\r\n" + 
		"      can be returned.\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E0001\r\n" + 
		"\r\n" + 
		"      errorDescription | Internal exception occurred\r\n" + 
		"\r\n" + 
		"      errorCause ------| An internal error was identified while attempting to\r\n" + 
		"      process your API request\r\n" + 
		"\r\n" + 
		"      errorResolution -| Please try again later\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E0001\r\n" + 
		"\r\n" + 
		"      errorDescription | Service unavailable\r\n" + 
		"\r\n" + 
		"      errorCause ------| An internal error was identified while attempting to\r\n" + 
		"      process your API request\r\n" + 
		"\r\n" + 
		"      errorResolution -| Please try again later")
public class Code503ServiceUnavailableResponse 
{
	@ApiModelProperty(value="mailpieceId", example="090367574000000FE1E1B")
	@JsonProperty	
	private String mailPieceId;
	
	public String getMailPieceId() {
		return mailPieceId;
	}

	public void setMailPieceId(String mailPieceId) {
		this.mailPieceId = mailPieceId;
	}

	@ApiModelProperty
	@JsonProperty	
	private int code;
	
	@ApiModelProperty
	@JsonProperty("integrationFooterError")	
	private Code401FooterError footerError;
}
