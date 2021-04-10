package guru.springframework.domain;

import lombok.Data;

/**
 * Created by jt on 1/26/16.
 */

@Data
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;

    public Integer getId() {
        return id;
    }
}
