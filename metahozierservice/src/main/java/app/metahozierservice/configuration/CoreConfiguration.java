package app.metahozierservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"app.metahozierservice"})
public class CoreConfiguration {

}
