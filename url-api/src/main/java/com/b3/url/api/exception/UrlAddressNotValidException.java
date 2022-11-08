package com.b3.url.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE, reason = "Url address is not valid")
public class UrlAddressNotValidException extends RuntimeException {

}
