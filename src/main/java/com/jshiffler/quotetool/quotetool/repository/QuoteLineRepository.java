package com.jshiffler.quotetool.quotetool.repository;

import com.jshiffler.quotetool.quotetool.model.Quote;
import com.jshiffler.quotetool.quotetool.model.QuoteLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteLineRepository extends JpaRepository<QuoteLine, Long> {

    List<QuoteLine> findByIdIs(Long id);

}

