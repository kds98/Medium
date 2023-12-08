package com.ll.medium.global.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class NotProd {
    @Bean
    public ApplicationRunner initNotProd() {
        return args -> log.debug("NotProd 실행됨");
    }
}
