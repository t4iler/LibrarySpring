package library.mapper.implementations;

import library.entity.Book;
import library.mapper.BookMapper;
import library.models.response.BookResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapperImplementation implements BookMapper {
    @Override
    public List<BookResponse> toDtoS(List<Book> all) {
        List<BookResponse> bookResponses = new ArrayList<>();
        for (Book book : all) {
            bookResponses.add(toDto(book));
        }
        return bookResponses;
    }

    @Override
    public BookResponse toDto(Book book) {
        BookResponse bookResponse = new BookResponse();
        bookResponse.setId(book.getId());
        bookResponse.setName(book.getName());
        bookResponse.setExist(book.getExist());
        bookResponse.setTranscript(book.getTranscript());
        bookResponse.setAge_access(book.getAgeAccess());
        bookResponse.setPrize(book.getPrize());
        bookResponse.setCreated_date(book.getCreated_date());
        bookResponse.setAuthor_name(book.getAuthor_name());
        bookResponse.setType(book.getType().getName());
        return bookResponse;
    }
}