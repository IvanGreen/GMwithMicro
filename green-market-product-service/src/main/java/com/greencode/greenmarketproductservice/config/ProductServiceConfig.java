package com.greencode.greenmarketproductservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("com.greencode.*")
@Configuration
public class ProductServiceConfig implements WebMvcConfigurer {
}
