package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.BexLibraryApplication;
import com.db.bexlibrary.BexLibrary.config.SecurityUserDetails;
import com.db.bexlibrary.BexLibrary.config.SessionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class DefaultController {
    @Autowired
    protected SessionContext securityContext;


    protected Model setTemplate(Model model, String template) {
        return model.addAttribute("template", template);
    }

    public SecurityUserDetails getCurrentUser() {
        Authentication token = SecurityContextHolder.getContext().getAuthentication();
        if (token != null && token.getPrincipal() != null && token.getPrincipal() instanceof SecurityUserDetails) {
            SecurityUserDetails details = (SecurityUserDetails) token.getPrincipal();
            if (details != null) {
                return details;
            }
        }
        throw new SessionAuthenticationException("Session expired, please relog");
    }


    @ModelAttribute(name = "isLoggedIn")
    public Boolean isLoggedIn() {
        return BexLibraryApplication.getBean(SessionContext.class).isLoggedIn();
    }
}
