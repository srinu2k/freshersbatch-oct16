package question6;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("classpath:/spring/core/question6/data.properties")
public class Dataconfig {
	
	@Value("${data.name}")
    String name;
    
	@Value("${data.url}")
    String url;
    
	@Value("${data.username}")
    String username;
    
	@Value("${data.password}")
    String password;
    
	@Bean
    public Basicdatasource dataSource() {
        Basicdatasource ds = new Basicdatasource();
        ds.setDriverClassName(name);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
}