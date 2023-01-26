package com.benjaminleephoto.aws.cloudfunctionsdemo;

//import org.springframework.cloud.function.adapter.aws.FunctionInvoker;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class Handler extends SpringBootRequestHandler<String, APIGatewayV2HTTPResponse>  {
}
