package com.codingshadows.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManagementSystem {

    private Map<String, List<String>> genreBooks;

    public LibraryManagementSystem() {
        this.genreBooks = new HashMap<>();
    }

    public void addGenre(String genre, List<String> books) {
        genreBooks.put(genre, new ArrayList<>(books));
    }

    public void addBook(String genre, String book) {
        // TODO add the book to the genre
    }

    public void removeBook(String genre, String book) {
        // TODO remove the book from the genre
    }

    public List<String> getBooks(String genre) {
        return this.genreBooks.getOrDefault(genre, List.of());
    }

    public Map<String, List<String>> getGenreBooks() {
        return new HashMap<>(this.genreBooks);
    }
}
