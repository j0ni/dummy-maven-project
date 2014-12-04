package com.circleci.dummy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.Cipher;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        return;
    }

    @After
    public void tearDown() throws Exception {
        return;
    }

    @Test
    public void testCube() throws Exception {
        assertNotNull(Cipher.getMaxAllowedKeyLength("AES256"));
    }
}