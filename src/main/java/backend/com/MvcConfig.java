package backend.com;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

//@Configuration

//i18n
@Configuration
//@ComponentScan(basePackages = "com.baeldung.internationalization.config")
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("test2");
        registry.addViewController("/test2").setViewName("test2");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/add").setViewName("add");
        registry.addViewController("/edit").setViewName("edit");
        registry.addViewController("/delete").setViewName("delete");
        registry.addViewController("/menu").setViewName("menu");
    }
    
    //for i18n Locale start
    
//    @Bean
//    public LocaleResolver localeResolver(){
//    	MyLocaleResolver my = new MyLocaleResolver();
//        return my;
//    }

  //for i18n Locale end
  //for i18n Locale start

}
