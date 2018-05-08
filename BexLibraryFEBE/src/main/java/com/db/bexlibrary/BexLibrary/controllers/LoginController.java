package com.db.bexlibrary.BexLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class LoginController{

//    @Autowired
//    UserRepo userRepo;
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResponseEntity<String> getLogin(@RequestBody UserPOJO userPOJO) {
//
//        User user = userRepo.findUserByEmail(userPOJO.getUserEmail());
////        boolean ok=new BCryptPasswordEncoder().matches(userPOJO.getPassword(),user.getPassword());
//        boolean ok= userPOJO.getPassword().equals(user.getPassword());
//        if (ok) {
//            GlobalVariables.getInstance().setEmail(userPOJO.getUserEmail());
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//
//        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
}
