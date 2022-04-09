package com.devmind.mvc.controller;

import com.devmind.mvc.model.Page;
import com.devmind.mvc.model.User;
import com.devmind.mvc.service.MVCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class MVCController {

    @Autowired
    private MVCService mvcService;

    @Autowired
    private Page page;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("We are at route: home with locale:" + locale);
        model.addAttribute("serverTime", this.mvcService.getFormattedTime(locale));

        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model) {
        System.out.println("We are at route: user");
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("phone", user.getPhone());
        model.addAttribute("birthday", user.getBirthday());

        return "user";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String user(Model model) {
        System.out.println("We are at route: about");
        model.addAttribute("description", page.getDescription());
        model.addAttribute("owner", page.getContact().getOwner());
        model.addAttribute("address", page.getContact().getAddress());
        return "about";
    }
}
