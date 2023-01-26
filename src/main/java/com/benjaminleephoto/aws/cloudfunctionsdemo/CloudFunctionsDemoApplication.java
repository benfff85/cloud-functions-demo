package com.benjaminleephoto.aws.cloudfunctionsdemo;

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.function.Function;


@SpringBootApplication
public class CloudFunctionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionsDemoApplication.class, args);
    }

    @Bean
    public Function<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> reverseString() {
        return value -> APIGatewayV2HTTPResponse.builder()
                .withStatusCode(200)
                .withBody(new StringBuilder(value.getBody()).reverse().toString())
                .withHeaders(Map.of("test-header", "test-header-value"))
                .build();
    }

}
