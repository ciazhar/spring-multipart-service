package com.ciazhar.springwebfluxmultipart.config

import org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.ViewResolverRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerConfigurer

/**
 * Created by ciazhar on 11/7/17.
 *
 * [ Documentation Here ]
 */

@Configuration
class FreemarkerConfig : WebFluxConfigurer{
    @Bean
    fun freeMarkerConfigurer(applicationContext: ReactiveWebApplicationContext): FreeMarkerConfigurer {
        val configurer = FreeMarkerConfigurer()
        configurer.setTemplateLoaderPath("classpath:/templates/")
        configurer.setResourceLoader(applicationContext)
        return configurer
    }

    override fun configureViewResolvers(registry: ViewResolverRegistry) {
        registry.freeMarker()
    }
}

