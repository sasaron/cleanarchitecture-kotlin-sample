package com.example.demo.infrastructure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.function.Predicate

@EnableSwagger2
@Configuration
class SwaggerConfiguration {
    @Bean
    fun swaggerDemoApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .select()
            .paths(Predicate.not(PathSelectors.regex("^/error.*")))
            .build()
            .apiInfo(apiInfo())
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Demo Sample API")
            .description("Kotlin Sample API. DDD and CleanArch")
            .version("0.0.1")
            .build()
    }

}
