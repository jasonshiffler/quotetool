package com.jshiffler.quotetool.quotetool.repository;

import com.jshiffler.quotetool.quotetool.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteRepository extends JpaRepository<com.jshiffler.quotetool.quotetool.model.Quote, Long> {

    List<Quote> findByDescriptionContains(String description);

    List<Quote> findByOwner(String owner);

    Quote findByIdIs(Long id);

    Long deleteByIdIs(Long id);
}


