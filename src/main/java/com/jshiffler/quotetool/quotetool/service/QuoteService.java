package com.jshiffler.quotetool.quotetool.service;

import com.jshiffler.quotetool.quotetool.model.Quote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteService {

List<Quote> getQuoteByOwner(String Owner);

List<Quote> getAllQuotes();

void createQuote(Quote quote);

}
