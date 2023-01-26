package com.benjaminleephoto.aws.cloudfunctionsdemo;

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloudFunctionsDemoApplicationTest {
    /**
     * Method under test: {@link CloudFunctionsDemoApplication#reverseString()}
     */
    @Test
    void testReverseString() {
        APIGatewayV2HTTPResponse actualApplyResult = (new CloudFunctionsDemoApplication()).reverseString().apply("foo");
        assertEquals("oof", actualApplyResult.getBody());
        assertEquals(200, actualApplyResult.getStatusCode());
        assertNull(actualApplyResult.getMultiValueHeaders());
        assertFalse(actualApplyResult.getIsBase64Encoded());
        assertNull(actualApplyResult.getHeaders());
        assertNull(actualApplyResult.getCookies());
    }
}

