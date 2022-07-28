package ko.alliex.energy.api.controller;

import ko.alliex.energy.framework.security.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetsController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println(passwordEncoder.encode("admin"));
        return "hello";
    }

    @GetMapping(value = "/assets")
    @Secured(value = false)
    public String assets() {
        return "RETURN LIST ASSETS";
    }
}
