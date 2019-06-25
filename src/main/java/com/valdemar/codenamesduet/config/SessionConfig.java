package com.valdemar.codenamesduet.config;

import com.valdemar.codenamesduet.service.session.InMemorySessionManager;
import com.valdemar.codenamesduet.service.session.SessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionConfig {

    @Bean
    public SessionManager sessionManager(){
        return new InMemorySessionManager();
    }
}
