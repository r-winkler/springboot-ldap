package ch.renewinkler.springbootldap;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    @Secured("ROLE_DEVELOPERS")
    public String index() {
        return "Welocme to the home page";
    }
}
