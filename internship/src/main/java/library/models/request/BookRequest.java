package library.models.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {
    private String name;
    private String author_name;
    private String transcript;
    private Integer prize;
    private Integer age_access;
    private String type;
}
