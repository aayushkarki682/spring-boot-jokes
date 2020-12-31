package ayush.springframework.springbootjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping("/")
    public String viewJokes(){
        return "";
    }
}
