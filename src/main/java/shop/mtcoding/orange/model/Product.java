package shop.mtcoding.orange.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product { // entity 라고 함
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private Timestamp createdAt;
}
