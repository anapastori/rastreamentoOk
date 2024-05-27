package src.main.java.com.example.demo.config;

import java.beans.JavaBean;


public class ConfigSeguranca extends WebSecurityConfigurerAdapter {


    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/api/").authenticated()
                .and()
            .httpBasic();
}

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
