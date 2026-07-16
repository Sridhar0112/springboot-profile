package com.sridhar.springboot.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
@Profile("dev")
public class DevDataSourceConfig {

    public DevDataSourceConfig() {
        log.info("Development DataSource Loaded - H2 Database");
    }
}