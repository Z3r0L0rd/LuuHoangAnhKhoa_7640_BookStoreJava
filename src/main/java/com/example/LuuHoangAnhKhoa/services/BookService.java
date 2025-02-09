package com.example.LuuHoangAnhKhoa.services;

import com.example.LuuHoangAnhKhoa.entity.Book;
import com.example.LuuHoangAnhKhoa.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book) {
        bookRepository.save(book);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
