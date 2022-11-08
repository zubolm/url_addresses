package com.b3.url.api.validator;

import com.b3.url.api.exception.UrlAddressNotValidException;
import com.b3.url.api.util.validator.UrlAddressValidator;
import org.junit.Test;


public class UrlAddressValidatorTest {

    @Test(expected = UrlAddressNotValidException.class)
    public void test()   {
        UrlAddressValidator validator = new UrlAddressValidator();
        validator.isValidURL("http://b3.com/ 123123!#@EED");
    }


}