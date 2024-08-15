package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    public List<Author> getAllAuthors();

    public Optional<Author> getAuthorById(Long id);

    public Author saveAuthor(Author author);

    public void deleteAuthor(Long id);

    public List<Book> getAllBooks();

    public Optional<Book> getBookById(Long id);

    public Book saveBook(Book book);

    public void deleteBook(Long id);
}
