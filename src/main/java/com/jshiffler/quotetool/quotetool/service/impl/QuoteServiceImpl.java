package com.jshiffler.quotetool.quotetool.service.impl;

import com.jshiffler.quotetool.quotetool.model.Quote;
import com.jshiffler.quotetool.quotetool.repository.QuoteRepository;
import com.jshiffler.quotetool.quotetool.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    QuoteRepository quoteRepository;


    public List<Quote> getAllQuotes() {

        return quoteRepository.findAll();
    }

    public List<Quote> getQuoteByOwner(String Owner){

        return quoteRepository.findByOwner(Owner);
    }


    public void createQuote(Quote quote) {

        quoteRepository.saveAndFlush(quote);
    }

    public void updateQuote(Quote quote) {

        quoteRepository.saveAndFlush(quote);
    }


    @Override
    public Quote getQuoteById(Long id) {
        return quoteRepository.findByIdIs(id);
    }

    @Override
    public void deleteQuote(Long id) {

        quoteRepository.deleteByIdIs(id);
    }
}
