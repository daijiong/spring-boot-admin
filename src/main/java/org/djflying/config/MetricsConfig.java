package org.djflying.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;

/**
 * Description
 *
 * @author daijiong
 * @version : MetricsConfig.java, v 0.1 2021/3/25 12:18 daijiong Exp $$
 */
public class MetricsConfig {
    @Bean
    MeterRegistryCustomizer<MeterRegistry> configurer(@Value("${spring.application.name}") String applicationName) {
        return (registry) -> registry.config().commonTags("application", applicationName);
    }
}
