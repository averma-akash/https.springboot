package configuration.https.springboot;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class SecuredServerController{
     
    @GetMapping("/index")
    public String index(final Model model) {
    	System.out.println("Inside Get Mapping()");
        model.addAttribute("title", "Spring Boot + SSL (HTTPS)");
        model.addAttribute("msg", "Welcome to the SSL!");
        model.addAttribute("value", "Hello user !!! : " + new Date());
        return "index";
    }
}