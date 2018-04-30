package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Unauthorized Missing RMG Client Id")
public class Code401UnauthorizedResponse
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
