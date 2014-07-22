package co.poynt.api.model;

public enum Code {

	// @formatter:off
	// duplicated exceptions
	STORE_DEVICE_ALREADY_REGISTERED(400, "Terminal already registered with a different store."),
	BUSINESS_ALREADY_EXISTS    (400, "The business already registered in our system."),
	CREDENTIAL_ALREADY_EXISTS  (400, "The credential already exists."),
	CARD_ALREADY_EXISTS        (400, "The card already exists."),
	TENDER_ALREADY_CAPTURED    (400, "The tender has already been captured."),
	TENDER_ALREADY_REFUNDED    (400, "The tender has already been refunded."),
	TENDER_ALREADY_VOIDED      (400, "The tender has already been voided."),
	DEVICE_ALREADY_PRESENT     (400, "The device is already present."),
	ORDER_UUID_ALREADY_EXISTS  (400, "The Order UUID already exists and is too old."),
	REQUEST_ID_DUPLICATE       (400, "The Poynt-Request-Id has already been processed."),
	REQUEST_IN_PROGRESS        (503, "The Poynt-Request-Id is currently being processed."),
	ORDER_ALREADY_COMPLETED    (400, "The Order has already been marked as completed."),
	TENDER_DUPLICATE           (400, "We have detected a tender that might be duplicate."),
	
	// server error
	DATABASE_ERROR             (503, "System error."),
	INTERNAL_ERROR             (500, "System error."),
	ATLEAST_ONE_TENDER_FAILED  (400, "Order cancelled as at least one of the tenders failed."),

	// processor declines
	
	// this one is only being thrown in case of SignOn failure
	PROCESSOR_DECLINED         (422, "Processor declined."),
	
	// none of the processor declines below are being thrown, can delete them
	//PROCESSOR_DECLINED_AUTHORIZATION (422, "Processor declined authorization."),
	//PROCESSOR_DECLINED_CAPTURE (422, "Processor declined capture."),
	//PROCESSOR_DECLINED_REFUND  (422, "Processor declined refund."),
	//PROCESSOR_DUPLICATE        (422, "Processor declined with duplicate transaction error."),

	// missing information exceptions
	MISSING_PARAMETER          (400, "Required parameter is missing."),
	STORE_DEVICE_NOT_FOUND     (404, "Store device not found in our records."),
	BUSINESS_NOT_FOUND         (404, "Business not found in our records."),
	BUSINESS_NOT_SETUP         (400, "Business is not fully setup."),
	CARD_NOT_FOUND             (404, "Card not found in our records."),
	ORDER_NOT_FOUND            (404, "Order not found"),
	CUSTOMER_NOT_FOUND         (404, "Customer not found in our records."),
	MULTIPLE_CARDS_MATCHING_PAN(400, "Multiple card found matching PAN."),
	TENDER_NEVER_PROCESSED     (400, "Tender processing was started but never completed"),
	APPLICATION_NOT_FOUND      (404, "Application not found in our records."),
	TRANSACTION_NOT_FOUND      (404, "Transaction not found"),

	// invalid information exceptions
	INVALID_PARAMETER          (400, "Parameter provided is invalid."),
	CANCEL_UNSUPPORTED_ON_MODIFIED_ORDER(400, "Order cancel currently not supported on orders that have been modified"),
	INVALID_URL_PATTERN        (404, "Url pattern is invalid."),
	LOGIN_FAILED               (401, "Login failed."),
	UNSUPPORTED_TENDER_TYPE    (422, "Tender type is unsupported."),
	UNSUPPORTED_TENDER_ACTION  (422, "Tender action is unsupported."),
	INVALID_ACCESS_TOKEN       (401, "Access token is missing or invalid."),
	INVALID_REFRESH_TOKEN      (401, "Refresh token is missing or invalid."),
	INVALID_REQUEST            (400, "Bad request."),
	UNAUTHORIZED_ACCESS        (401, "Access not authorized for the requested resource."),
	INVALID_RESOURCE_ID        (404, "The requested resource does not exist.");
	// @formatter:on

	private final int httpStatus;
	private final String message;

	private Code(int httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getHttpStatus() {
		return httpStatus;
	}
}
