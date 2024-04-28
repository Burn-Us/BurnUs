package com.burnus.all.config.error;

import lombok.AllArgsConstructor;

//api error message setting
@AllArgsConstructor
public enum ErrorCode {
	
	//400
	BAD_REQUEST(400, "COMMON-ERROR-400", "Bad Request"),
	
	//401
	UNAUTHORIZED(401, "COMMON-ERROR-401", "Your Not Authorized."),
	
	//403
	FORBIDDEN(403, "COMMON-ERROR-403", "You don't have permission about this resource"),
	
	//404
	NOT_FOUND(404, "COMMON-ERROR-404", "Page Not Found"),
	
	//405
	METHOD_NOT_ALLOWED(405, "COMMON-ERROR-405", "This Method can't access to this resource"),
	
	//409
	CONFLICT(409, "COMMON-ERROR-409", "Your request is conflict with current status."),
	
	//415
	UNSUPPORTED_MEDIA_TYPE(415, "COMMON-ERROR-415", "Requested media type is wrong."),
	
	//429
	TOO_MANY_REQUESTS(429, "COMMON-ERROR-429", "Too many Requests"),
	
	//500
	INTER_SERVER_ERROR(500, "COMMON-ERROR-500", "Server Error");
	
	//data type
	private int status;
	private String errorCode;
	private String message;


	// Getter methods if needed
    public int getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
	
    ErrorCode(int i, String string, String string2) {
    	// TODO Auto-generated constructor stub
    }	
	
}
