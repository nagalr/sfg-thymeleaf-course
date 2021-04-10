package guru.springframework.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/26/16.
 */

@Data
public class Product {

    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> productCategories = new ArrayList<>();
    private String imageUrl;
}
