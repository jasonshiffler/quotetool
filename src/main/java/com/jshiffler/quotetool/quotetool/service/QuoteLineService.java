package com.jshiffler.quotetool.quotetool.service;

import com.jshiffler.quotetool.quotetool.model.QuoteLine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteLineService {

    void addLine(QuoteLine line);
    void deleteLine(Long id);
    List<QuoteLine> getAllQuoteLines();

}
