package Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class CostCategoryDto {
    private Integer id;
    private String name;
}
