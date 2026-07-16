package com.sridhar.springboot.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"qa","uat"})
@Slf4j
public class QaDataSourceConfig {

    public QaDataSourceConfig() {
        log.info("QA/UAT DataSource Loaded - Test Database");
    }
}