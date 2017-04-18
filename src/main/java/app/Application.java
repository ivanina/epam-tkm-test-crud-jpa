package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableSocial
//@EnableWebSecurity
@EnableJpaRepositories(basePackages = "app.repository")
@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "app.neo4")
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args); //NOSONAR
    }
}
