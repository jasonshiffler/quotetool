package com.jshiffler.quotetool.quotetool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String description;
    String owner;
    String creationTime; // When the Quote was created

    public Quote() {

        LocalDateTime now = LocalDateTime.now();
        this.creationTime = DateTimeFormatter.ISO_INSTANT.format(now.toInstant(ZoneOffset.UTC));
    }

    public Quote(Long id, String description, String owner) {

        LocalDateTime now = LocalDateTime.now();

        this.id = id;
        this.description = description;
        this.owner = owner;
        this.creationTime = DateTimeFormatter.ISO_INSTANT.format(now.toInstant(ZoneOffset.UTC));

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreationTime() { return creationTime; }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", creationTime='" + creationTime + '\'' +
                '}';
    }
}
