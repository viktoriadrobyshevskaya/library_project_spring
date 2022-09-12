package com.drobyshevskaya.library.project.controller;

import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class MyAuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public String showAllAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors";
    }

    @GetMapping("/authors/{id}")
    public String getAuthorById(Model model, @PathVariable int id) {
        model.addAttribute("author", authorService.getAuthorById(id));
        return "authors";
    }

    @PostMapping("/authors/")
    public String addNewAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
        return "authors";
    }

    @PutMapping("/authors/")
    public String updateAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
        return "authors";
    }

    @DeleteMapping("/authors/{id}")
    public String deleteAuthor(@PathVariable int id) {
        authorService.removeAuthor(id);
        return "authors";
    }
}
