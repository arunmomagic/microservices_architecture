package com.arun.biswas.currency.conversion.config;

import lombok.Getter;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
@Getter
public class LoadServiceInstanceListSuppler implements ServiceInstanceListSupplier {

    private  String serviceId;

    public LoadServiceInstanceListSuppler(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Arrays
                .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8001, false),
                        new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8002, false),
                        new DefaultServiceInstance(serviceId + "3", serviceId, "localhost", 8003, false)));
    }
}