package Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class ActivosDto {
    private Integer id;
    private Integer quantity;
    private String name;
}
