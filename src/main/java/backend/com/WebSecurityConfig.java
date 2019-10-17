package backend.com;
public class WebSecurityConfig{
	
}
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http
////            .authorizeRequests()
////                .antMatchers("/", "/home").permitAll()
////                .anyRequest().authenticated()
////                .and()
////            .formLogin()
////                .loginPage("/login")
////                .permitAll()
////                .and()
////            .logout()
////                .permitAll();
//    	http
//        .authorizeRequests()
//            .antMatchers("/", "/home").permitAll()
//            .anyRequest().authenticated()
//            .and()
//        .formLogin()
//            .loginPage("/login").permitAll()
////            .and()
//            .defaultSuccessUrl("/home.html").permitAll()
//            .and()
//        .logout()
//            .permitAll()
//            .and()
//        .logout()
//            .permitAll();
//    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//             User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//    
//    
//    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//            .withUser("66")
//            .password("666")
//            .roles("USER");
//        //在記憶體中建立了一個使用者，該使用者的名稱為user，密碼為password，使用者角色為USER
//    }
//    
//    @Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		// TODO Auto-generated method stub
//		auth //Builder Design Pattern
//			.inMemoryAuthentication() //自訂Runtime時的使用者帳號
//				.withUser("88") //新增user
//				.password("8888") //指定密碼
//				.roles("ADMIN", "USER") //指派權限群組
//				.and() //再新增使用者
//				.withUser("user")
//				.password("user12345")
//				.roles("USER");
//	}
//}