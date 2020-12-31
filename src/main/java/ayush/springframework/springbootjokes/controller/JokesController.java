package ayush.springframework.springbootjokes.controller;

import ayush.springframework.springbootjokes.services.RandomQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    private RandomQuoteService randomQuoteService;

    @RequestMapping("/")
    public String viewJokes(Model model){

        model.addAttribute("joke", randomQuoteService.getJokeQuote());
        return "chucknorris";
    }
}
