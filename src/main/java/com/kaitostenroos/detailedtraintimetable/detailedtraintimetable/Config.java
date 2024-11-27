package com.kaitostenroos.detailedtraintimetable.detailedtraintimetable;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
 @EnableJpaRepositories("com.kaitostenroos.detailedtraintimetable.*")
 @ComponentScan(basePackages = { "com.kaitostenroos.detailedtraintimetable.*" })
 @EntityScan("com.kaitostenroos.detailedtraintimetable.*")   
public class Config {
    
}
