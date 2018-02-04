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
        assertEquals(false, Validator.validate("short"));
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
    public void validatePass() throws Exception {
        assertEquals(true, Validator.validate("testpass"));
    }

}