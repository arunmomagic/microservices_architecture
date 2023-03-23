package com.arun.biswas.gateway.server.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {
    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
//                .route("paymentId", r->r.path("/payment/**").uri("http://localhost:9009")) //static routing
                .route("EXCHANGE-SERVICE", r->r.path("/currency-service/**").uri("lb://EXCHANGE-SERVICE")) //dynamic routing
                .route("CURRENCY-CONVERSION", r->r.path("/currency-conversion/**").uri("lb://CURRENCY-CONVERSION"))
                .build();
    }
}
