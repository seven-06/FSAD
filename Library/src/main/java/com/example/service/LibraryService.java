package com.example.service;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private BookRepository repository;

    public void addBook(Book book) {
        repository.save(book);   // ✅ Saves to MySQL
    }

    public List<Book> getAllBooks() {
        return repository.findAll();  // ✅ Fetch from MySQL
    }
}
