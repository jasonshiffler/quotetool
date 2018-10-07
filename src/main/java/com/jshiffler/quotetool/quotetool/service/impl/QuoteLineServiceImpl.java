package com.jshiffler.quotetool.quotetool.service.impl;

import com.jshiffler.quotetool.quotetool.model.QuoteLine;
import com.jshiffler.quotetool.quotetool.repository.QuoteLineRepository;
import com.jshiffler.quotetool.quotetool.service.QuoteLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuoteLineServiceImpl implements QuoteLineService {

    @Autowired
    QuoteLineRepository quoteLineRepository;


    @Override
    public void addLine(QuoteLine line) {

        quoteLineRepository.saveAndFlush(line);
    }

    @Override
    public void deleteLine(Long id) {

        quoteLineRepository.delete(id);
    }


    @Override
    public List<QuoteLine> getAllQuoteLines() {

        return quoteLineRepository.findAll();
    }




}
