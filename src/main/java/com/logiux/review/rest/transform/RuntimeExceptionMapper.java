package com.logiux.review.rest.transform;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.OTAReviewsRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Provider to provide the following to Jersey framework:</p>
 * <ul>
 * <li>Provision of general runtime exception to response mapping</li>
 * </ul>
 */
@Provider
public class RuntimeExceptionMapper implements ExceptionMapper<RuntimeException> {

    private final static Logger LOGGER = LoggerFactory.getLogger(RuntimeExceptionMapper.class);

    @Override
    public Response toResponse(RuntimeException runtime) {
        // Build default response
        Response defaultResponse = buildError("500", "ServerError", runtime.getMessage());        // Check for any specific handling
        if (runtime instanceof WebApplicationException) {
            return handleWebApplicationException(runtime, defaultResponse);
        }
        // Use the default
        LOGGER.error(runtime.getMessage());
        return defaultResponse;
    }

    private Response handleWebApplicationException(RuntimeException exception, Response defaultResponse) {
        WebApplicationException webAppException = (WebApplicationException) exception;

        // No logging
        if (webAppException.getResponse().getStatus() == 401) {
            return buildError("401", "Unauthorized", webAppException.getMessage());
        }
        if (webAppException.getResponse().getStatus() == 404) {
            return buildError("404", "NotFound", webAppException.getMessage());
        }
        // Debug logging
        // Warn logging
        // Error logging
        LOGGER.error(exception.getMessage());
        return defaultResponse;
    }

    public Response buildError(String code, String errType, String message) {
        OTAReviewsRS otaResponse = new OTAReviewsRS();
        otaResponse.setCorrelationID("0123456789");
        ErrorsType ota_error_list = new ErrorsType();
        ErrorType ota_error = new ErrorType();
        ota_error.setCode(code);
        ota_error.setShortText(message);
        ota_error.setType(errType);
        ota_error_list.getError().add(ota_error);
        otaResponse.setErrors(ota_error_list);
        Response resp = Response.ok().entity(otaResponse).build();
        return resp;
    }

}
