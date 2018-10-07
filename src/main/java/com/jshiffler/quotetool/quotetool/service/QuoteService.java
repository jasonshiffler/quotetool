package com.jshiffler.quotetool.quotetool.service;

import com.jshiffler.quotetool.quotetool.model.Quote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteService {

List<Quote> getQuoteByOwner(String Owner);

List<Quote> getAllQuotes();

Quote getQuoteById(Long id);

void createQuote(Quote quote);

void updateQuote(Quote quote);

void deleteQuote(Long id);


}
