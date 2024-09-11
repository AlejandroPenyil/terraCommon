package Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class FacturaDTO {
    private Integer id;

    private ZonedDateTime fecha;

    private Integer idCliente;

    private String ubicacion;
}
