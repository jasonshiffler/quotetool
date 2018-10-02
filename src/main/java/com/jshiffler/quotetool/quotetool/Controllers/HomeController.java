package com.jshiffler.quotetool.quotetool.Controllers;


import com.jshiffler.quotetool.quotetool.model.Quote;
import com.jshiffler.quotetool.quotetool.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {


    @Autowired
    private QuoteService quoteService;


    @RequestMapping
    public String landingPage() {

        return "landing-page";
    }


    @RequestMapping(value = "/quotes",method = RequestMethod.GET )
    public String quotesPage() {

        return "addquote";
    }

    @RequestMapping(value = "/quotes/add", method = RequestMethod.GET)
    public String quoteForm(Model model) {
        model.addAttribute("quote", new Quote());
        return "addquote";
    }

    @RequestMapping(value = "/quotes/add", method = RequestMethod.POST)
    public String quoteSubmit(@ModelAttribute("quote") Quote quote) {

        quoteService.createQuote(quote);
        return "landing-page";

    }


}
