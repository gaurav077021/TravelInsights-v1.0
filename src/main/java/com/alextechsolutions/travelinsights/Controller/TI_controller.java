package com.alextechsolutions.travelinsights.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


@RestController
public class TI_controller {
    @GetMapping("/contact")
    public RedirectView getContactPage() {
        return new RedirectView("contact.html");
    }

    @GetMapping("/home")
    public RedirectView getHomePage(){
        return new RedirectView("homePage.html");
    }
}
