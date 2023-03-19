package com.arun.biswas.limit.server.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitConfiguration {
    private Integer minimum;
    private Integer maximum;

    public LimitConfiguration(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
