package com.benjaminleephoto.aws.cloudfunctionsdemo;

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloudFunctionsDemoApplicationTest {


    /**
     * Method under test: {@link CloudFunctionsDemoApplication#reverseString()}
     */
    @Test
    void testReverseString() {
        APIGatewayV2HTTPResponse actualReverseStringResult = (new CloudFunctionsDemoApplication()).reverseString().apply(APIGatewayV2HTTPEvent.builder().withBody("ABC").build());
        assertEquals("CBA", actualReverseStringResult.getBody());
        assertEquals(200, actualReverseStringResult.getStatusCode());
        assertNull(actualReverseStringResult.getMultiValueHeaders());
        assertFalse(actualReverseStringResult.getIsBase64Encoded());
        assertEquals(1, actualReverseStringResult.getHeaders().size());
        assertNull(actualReverseStringResult.getCookies());
    }

}

