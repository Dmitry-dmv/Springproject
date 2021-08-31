package dto;

import entity.Lombok;
import lombok.Data;

@Data
public class OrderDto {
    private String name;
    private String lastname;
    private Long id;
    private String address;

}
