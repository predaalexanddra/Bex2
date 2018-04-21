package com.db.bexlibrary.BexLibrary.controllers;

import jdk.net.SocketFlow;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController extends DefaultController {

    @RequestMapping(value = "login.html", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getLogin() {
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(Model model) {
        model.addAttribute("isLoggedIn", isLoggedIn());
        return "index";
    }

}
