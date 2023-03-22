package com.arun.biswas.currency.conversion.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {
    //    @Bean
//    @Primary
//    ServiceInstanceListSupplier serviceInstanceListSupplier() {
//        return new LoadServiceInstanceListSuppler();
//    }
    @Bean
    public ServiceInstanceListSupplier
    discoveryClientServiceInstanceListSupplier(
            ConfigurableApplicationContext context) {
        return ServiceInstanceListSupplier.builder()
                .withCaching()
                .withBlockingDiscoveryClient()
                .withSameInstancePreference()
                .build(context);
    }
}
