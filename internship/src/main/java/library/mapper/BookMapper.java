package library.mapper;


import library.entity.Book;
import library.models.response.BookResponse;

import java.util.List;

public interface BookMapper {
    List<BookResponse> toDtoS(List<Book> all);

    BookResponse toDto(Book book);
}