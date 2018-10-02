package com.jshiffler.quotetool.quotetool.Controllers;

import com.jshiffler.quotetool.quotetool.model.Quote;
import com.jshiffler.quotetool.quotetool.model.QuoteLine;
import com.jshiffler.quotetool.quotetool.repository.QuoteLineRepository;
import com.jshiffler.quotetool.quotetool.repository.QuoteRepository;
import com.jshiffler.quotetool.quotetool.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ApiV1 {


    @Autowired
    private QuoteLineRepository quoteLineRepository;

    @Autowired
    private QuoteService quoteService;


    @RequestMapping(value = "quotes", method = RequestMethod.GET)
    public List<Quote> list() {

        return quoteService.getAllQuotes();
    }

    @RequestMapping(value = "quotes/owner/{owner}", method = RequestMethod.GET)
    public List<Quote> getOwner(@PathVariable("owner") String owner) {

        return quoteService.getQuoteByOwner(owner);
    }


    @RequestMapping(value = "quotes", method = RequestMethod.POST)
    public void create(@RequestBody Quote quote) {

        quoteService.createQuote(quote);
    }

/*

    @RequestMapping(value = "quoteline/quoteid/{id}", method = RequestMethod.GET)
    public List<QuoteLine> getQuoteLines(@PathVariable("id") Long id) {

        return quoteLineRepository.findByIdIs(id);
    }
*/


}
