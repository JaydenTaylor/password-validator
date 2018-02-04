package com.example.jaydentaylor.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorUnitTest {
    @Test
    public void validateTooShort() throws Exception {
        assertEquals(false, Validator.validate("short1"));
    }

    @Test
    public void validatePasswordFail() throws Exception {
        assertEquals(false, Validator.validate("password"));
    }

    @Test
    public void validatePasswordFailWithCaps() throws Exception {
        assertEquals(false, Validator.validate("PassWoRD"));
    }

    @Test
    public void validateNoCaps() throws Exception {
        assertEquals(false, Validator.validate("nocapspassword1!"));
    }

    @Test
    public void validateNoDigit() throws Exception {
        assertEquals(false, Validator.validate("NoDigitsPassword!"));
    }

    @Test
    public void validateAllCaps() throws Exception {
        assertEquals(false, Validator.validate("ALLCAPSPASS223"));
    }

    @Test
    public void validatePass() throws Exception {
        assertEquals(true, Validator.validate("Testpass12!"));
    }

}