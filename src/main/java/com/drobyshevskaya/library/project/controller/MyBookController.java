package com.drobyshevskaya.library.project.controller;

import com.drobyshevskaya.library.project.entity.Book;
import com.drobyshevskaya.library.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class MyBookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/books")
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.showAllBooks());
        return "books";
    }

    @GetMapping("/books/{id}")
    public String getBookById(Model model, @PathVariable int id) {
        model.addAttribute("book", bookService.getBookById(id));
        return "books";
    }

    @PostMapping("/books/")
    public String addNewBook(@RequestBody Book book) {
       bookService.saveBook(book);
        return "books";
    }

    @PutMapping("/books/")
    public String updateBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return "books";
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
        return "books";
    }
}
