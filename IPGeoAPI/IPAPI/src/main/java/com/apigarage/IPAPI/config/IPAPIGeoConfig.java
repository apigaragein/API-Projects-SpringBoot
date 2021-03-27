package com.apigarage.IPAPI.config;

import com.maxmind.geoip2.DatabaseReader;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.io.File;
import java.io.IOException;

public class IPAPIGeoConfig extends WebMvcConfigurerAdapter {
    public static DatabaseReader getCityDBReader() throws IOException {
        File database = new File("D:\\Data\\geoipdata\\GeoLite2-City.mmdb");
        return new DatabaseReader.Builder(database).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("IPGeo API")
                .description("IPGeo API reference for developers")
                .termsOfServiceUrl("http://apigaragein.github.io")
                .contact(new Contact("apigarage.in@gmail.com"," ", " ")).license("GNU Public License")
                .licenseUrl("apigarage.in@gmail.com").version("1.0").build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
