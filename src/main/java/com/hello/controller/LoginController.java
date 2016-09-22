/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author quangle
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

//    @RequestMapping(path = "/do-login", method = RequestMethod.POST)
//    public String doLogin(
//            @RequestParam(value = "uname", required = true) String userName,
//            @RequestParam(value = "psw", required = true) String password,
//            Model model) {
//        if(userName.equals("mot") && password.equals("123")) {
//            return "redirect:/greeting";
//        } else {
//            return "login-fail";
//        }
//    }
    
    @RequestMapping(path = "/do-login")
    public String doLogin(
            @RequestParam(value = "uname", required = true) String userName,
            @RequestParam(value = "psw", required = true) String password,
            Model model) {
        if(userName.equals("mot") && password.equals("123")) {
            return "redirect:/greeting?name=" + userName;
        } else {
            return "login-fail";
        }
    }
}
