package org.mycompany.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="      Not Found\r\n" + 
		"\r\n" + 
		"      Unable to locate tracking data. The following 404 error messages can be\r\n" + 
		"      returned.\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E1142\r\n" + 
		"\r\n" + 
		"      errorDescription | Barcode reference [trackingNumber] is not valid \r\n" + 
		"\r\n" + 
		"      errorCause ------| A mail item with that barcode cannot be located\r\n" + 
		"\r\n" + 
		"      errorResolution -| Check barcode and resubmit\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E1143\r\n" + 
		"\r\n" + 
		"      errorDescription | Tracking data are not available for barcode reference\r\n" + 
		"      [trackingNumber] \r\n" + 
		"\r\n" + 
		"      errorCause ------| It is not possible to provide information about events\r\n" + 
		"      that occurred more than [x] days ago\r\n" + 
		"\r\n" + 
		"      errorResolution -| Please use the Royal Mail Track and Trace website to\r\n" + 
		"      obtain data of this age.\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------         \r\n" + 
		"               \r\n" + 
		"      errorCode -------| E1281\r\n" + 
		"\r\n" + 
		"      errorDescription | Format of barcode reference [trackingNumber] is not\r\n" + 
		"      recognised\r\n" + 
		"\r\n" + 
		"      errorCause ------| -\r\n" + 
		"\r\n" + 
		"      errorResolution -| -\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E1283\r\n" + 
		"\r\n" + 
		"      errorDescription | Tracking information is not available for this service \r\n" + 
		"\r\n" + 
		"      errorCause ------| The service used doesn't support tracking\r\n" + 
		"\r\n" + 
		"      errorResolution -| The service used doesn't support tracking\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E1284\r\n" + 
		"\r\n" + 
		"      errorDescription | An update will only be provided when we attempt to\r\n" + 
		"      deliver your item  \r\n" + 
		"\r\n" + 
		"      errorCause ------| This service only provides delivery confirmation. An\r\n" + 
		"      attempt to deliver parcel didn't happen yet. \r\n" + 
		"\r\n" + 
		"      errorResolution -| Please try again later\r\n" + 
		"\r\n" + 
		"      --------------------------------------------------------------------\r\n" + 
		"\r\n" + 
		"      errorCode -------| E1308\r\n" + 
		"\r\n" + 
		"      errorDescription |  The service used to send this item only provides an\r\n" + 
		"      update once we have received the item in our network. Please allow up to 3\r\n" + 
		"      working days for delivery, depending on the service used\r\n" + 
		"\r\n" + 
		"      errorCause ------| An externally visible scan/event has not occurred on\r\n" + 
		"      the mail item\r\n" + 
		"\r\n" + 
		"      errorResolution -| Please try again later")
public class Code404NotFoundResponse 
{
	@ApiModelProperty(value="mailpieceId", example="090367574000000FE1E1B")
	@JsonProperty	
	private String mailPieceId;
	
	@ApiModelProperty("integrationFooter")
	@JsonProperty(value="integrationFooter")
	private Code404FooterError integrationFooter;
}
