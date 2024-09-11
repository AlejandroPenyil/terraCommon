package Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class costosDto {
    private Integer id;
    private String costPerUnit;
    private String name;
    private Integer idUnit;
    private Integer idCostCategory;
}
