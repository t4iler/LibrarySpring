package library.service;

import library.models.request.BookRequest;
import library.models.response.BookResponse;

import java.util.List;

public interface BookService {
    void addBook(BookRequest request, String token);

    List<BookResponse> getAll(String s);

    void buy(Long bookId, String token);

    List<BookResponse> getMyBooks(String string);
}