package dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String name;
    private String lastname;
    private Long id;

    public boolean existsById(Integer idToDelete) {
        return false;
    }
}
