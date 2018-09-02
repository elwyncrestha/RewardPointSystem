package com.softwarica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author elwyn
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = "/index", method=RequestMethod.GET)
    public String displayHome()
    {
        return "redirect:/login";
    }
    
    @GetMapping(value = "/login")
    public String displayLogin(){
        return "adminLogin";
    }
    
    @GetMapping(value = "/logout")
    public String logout(){
        return "adminLogin";
    }
}
