package com.benjaminleephoto.aws.cloudfunctionsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.junit.jupiter.api.Test;

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

