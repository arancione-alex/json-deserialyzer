package com.company;

import java.util.Arrays;

public class Books {
    private Book[] books;

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
