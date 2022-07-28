package ko.alliex.energy.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {

        RequestParameter authorizationHeader = new RequestParameterBuilder()
                .name(HttpHeaders.AUTHORIZATION)
                .in(ParameterType.HEADER)
                .required(true)
                .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
                .build();

        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(authorizationHeader);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .tags(new Tag("AssetsController", "List of apis related to the Assets"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("ko.alliex.energy.api"))
                .paths(PathSelectors.any())
                .build().globalRequestParameters(parameters);
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Asset's Alliex service", "API Documentations for the Rest API", "0.0.1-SNAPSHOT",
                "urn:tos", new Contact("Alliex", "http://www.alli-ex.com/", "Not Available"), "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
    }
}
