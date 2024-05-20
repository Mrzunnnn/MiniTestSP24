package vn.techmaster.demo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Products {
    int id;
    String name;
    String description;
    String thumbnail;
    int price;
    double rating;
    int priceDiscount;
}
