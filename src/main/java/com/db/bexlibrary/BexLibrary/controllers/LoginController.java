package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.config.SecurityUserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController extends DefaultController {

    @RequestMapping(value = "/login.html", method = RequestMethod.POST)

    public String getLogin(Model model) {
        model.addAttribute("isLoggedIn", isLoggedIn());
        return "index";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(Model model) {
        model.addAttribute("isLoggedIn", isLoggedIn());

        if (isLoggedIn() == true && super.getCurrentUser().getAuthorities().stream().anyMatch(o -> o.getAuthority().equals("ROLE_ADMIN"))) {
            super.setTemplate(model, "dashboard.html");
        } else {
            super.setTemplate(model, "user.html");
        }
        return "index";
    }


}
