
package com.oktfolio.tero.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

/**
 * @author oktfolio oktfolio@gmail.com
 * @date 2020/06/17
 */
@Configuration
public class SessionAuthenticationConfig {

    @Bean
    public SessionAuthenticationStrategy getSessionAuthStrategy(SessionRegistry sessionRegistry) {
        return new RegisterSessionAuthenticationStrategy(sessionRegistry);
    }
}
