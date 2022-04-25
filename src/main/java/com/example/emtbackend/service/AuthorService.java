package com.example.emtbackend.service;

import com.example.emtbackend.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> findById(Long id);

    Optional<Author> create(Author author);
    List<Author> findAll();}
