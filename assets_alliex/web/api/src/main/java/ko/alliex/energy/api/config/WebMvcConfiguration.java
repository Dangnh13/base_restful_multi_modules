package ko.alliex.energy.api.config;

import ko.alliex.energy.api.interceptor.AuthorizationInterceptor;
import ko.alliex.energy.framework.component.MessageService;
import ko.alliex.energy.framework.constant.CommonConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Locale;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

    // =========================================================================
    //                                                                Constant
    //                                                                ==========

    // =========================================================================
    //                                                                DI
    //                                                                ==========

    private final AuthorizationInterceptor authorizationInterceptor;

    @Bean
    public MessageService messageService(final MessageSource messageSource) {
        return new MessageService(messageSource, Locale.JAPANESE);
    }

    // =========================================================================
    //                                                                Public method
    //                                                                ==========

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(36000000); // in milliseconds (10 hours)
        super.configureAsyncSupport(configurer);
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor)
                .addPathPatterns(CommonConstant.PATH_PATTERNS.ALL)
                .excludePathPatterns(CommonConstant.PATH_PATTERNS.SWAGGER)
                .excludePathPatterns("/hello", CommonConstant.PATH_PATTERNS.AUTH, CommonConstant.PATH_PATTERNS.HEALTH);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.
                addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
                .resourceChain(false);
    }

}
