package tn.esprit.spring.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("4TWIN6-Swagger")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("4TWIN6")
                .email("esprit2324-4twin6@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
        return contact;
    }

    @Bean
    public GroupedOpenApi blocApi() {
        return GroupedOpenApi.builder()
                .group("bloc")
                .pathsToMatch("/api/blocs/findAllBlocs",
                        "/api/blocs/addBloc",
                        "/api/blocs/addBlocs",
                        "/api/blocs/editBloc/{id}",
                        "/api/blocs/findBlocById/{id}",
                        "/api/blocs/deleteBloc/{id}",
                        "/api/blocs/findByNomBloc/{nomBloc}",
                        "/api/blocs/findByCapaciteBloc/{capaciteBloc}",
                        "/api/blocs/findByCapaciteAndNomBloc/{capaciteBloc}/{nomBloc}",
                        "/api/blocs/findByNomBlocIgnoreCase/{nomBloc}",
                        "/api/blocs/findByCapaciteGreaterThan/{capacite}",
                        "/api/blocs//findByNomBlocContaining/{subString}",
                        "/api/blocs/findByNomBlocOrderByNomBlocAsc/{nomBloc}",
                        "/api/blocs/findByNomBlocOrCapacite/{nomBloc}/{capacite}",
                        "/api/blocs/findBlocByFoyer/{foyer}") //all endpoints for blocs
                .build();
    }

    @Bean
    public GroupedOpenApi chambreApi() {
        return GroupedOpenApi.builder()
                .group("chambre")
                .pathsToMatch("/api/chambres/findAllBlocs",
                        "/api/chambres/add",
                        "/api/chambres/edit/{id}",
                        "/api/chambres/addchambres/{chambres}",
                        "/api/chambres/delete/{id}",
                        "/api/chambres/all",
                        "/api/chambres/{id}",
                        "/api/chambres/findByNumChambre/{numchambre}",
                        "/api/chambres/findByTypeC/{typec}",
                        "/api/chambres/findByBloc/{bloc}",
                        "/api/chambres/findByBlocAndTypeC/{bloc}/{typec}",
                        "/api/chambres/findByNumChambreAndType/{numc}/{typec}") //all endpoints for chambres
                .build();

    }
    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Product Management API")
                .pathsToMatch("/Chamber/**")
                .pathsToExclude("**")
                .build();
    }

}
