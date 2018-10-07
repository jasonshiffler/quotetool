package com.jshiffler.quotetool.quotetool.Controllers;


import com.jshiffler.quotetool.quotetool.model.Quote;
import com.jshiffler.quotetool.quotetool.service.QuoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private QuoteService quoteService;


    @RequestMapping
    public String landingPage() {

        return "landing-page";
    }


    @GetMapping("/quotes/list")
    public String quotesPage(Model model) {

        model.addAttribute("quotes", quoteService.getAllQuotes());
        return "listquotes";
    }


    @GetMapping("/quotes/add")
    public String quoteForm(Model model) {

        model.addAttribute("quote", new Quote());
        return "addquote";
    }

    @PostMapping("/quotes/add")
    public String quoteSubmit(@ModelAttribute("quote") Quote quote) {

        quoteService.createQuote(quote);
        return "redirect:/quotes/list";
    }

    @GetMapping("/quotes/edit/{id}")
    public String quoteForm(@PathVariable("id") Long id, Model model) {

        model.addAttribute("quote", quoteService.getQuoteById(id));
        return "editquote";
    }


    @PostMapping("/quotes/edit")
    public String quoteUpdate(@ModelAttribute("quote") Quote quote) {

        logger.info("id is " + quote.getId());
        logger.info("Description is " + quote.getDescription());
        quoteService.updateQuote(quote);
        return "redirect:/quotes/list";

    }

    @GetMapping("/quotes/delete/{id}")
    public String quoteDelete(@PathVariable("id") Long id, Model model) {

        model.addAttribute("quote", quoteService.getQuoteById(id));
        quoteService.deleteQuote(id);
        return "redirect:/quotes/list";
    }




}
