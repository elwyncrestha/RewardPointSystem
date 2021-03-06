/*
 * The MIT License
 *
 * Copyright 2018 elwyn.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.softwarica.controller;

import com.softwarica.service.EventService;
import com.softwarica.service.UserService;
import com.softwarica.service.UserTypeService;
import com.softwarica.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author elwyn
 */
@Controller
public class AdminController {
    
    @Autowired
    UserTypeService userTypeService;
    
    @Autowired
    UserService userService;
    
    @Autowired
    WorkshopService workshopService;
    
    @Autowired
    EventService eventService;
    
    @RequestMapping(value = "/admin/display/home", method = RequestMethod.GET)
    public String displayAdminHome(Model count) {
        count.addAttribute("CountStudents",userService.countStudents());
        count.addAttribute("CountWorkshops",workshopService.countWorkshops());
        count.addAttribute("CountEvents",eventService.countEvents());
        count.addAttribute("CountMales",userService.countStudents("male"));
        count.addAttribute("CountFemales",userService.countStudents("female"));
        return "adminHome";
    }
    
}
