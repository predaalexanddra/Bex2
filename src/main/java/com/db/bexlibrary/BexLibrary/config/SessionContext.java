package com.db.bexlibrary.BexLibrary.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class SessionContext {

    public Boolean isLoggedIn() {
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            return SecurityContextHolder.getContext()
                    .getAuthentication()
                    .getAuthorities()
                    .stream()
                    .filter(r -> !r.equals(new SimpleGrantedAuthority("ROLE_ANONYMOUS")))
                    .findAny()
                    .isPresent();
        }

        return false;
    }

    public SecurityUserDetails getCurrentUser() {
        Authentication token = SecurityContextHolder.getContext().getAuthentication();
        if (token != null && token.getPrincipal() != null && token.getPrincipal() instanceof SecurityUserDetails) {
            return (SecurityUserDetails) token.getPrincipal();
        }
        throw new SessionAuthenticationException("Session expired, please relog");
    }
}
