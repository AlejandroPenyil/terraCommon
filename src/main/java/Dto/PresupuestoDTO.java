package Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PresupuestoDTO {
    private Integer id;
    private ZonedDateTime fechalEnvio;
    private ZonedDateTime fechaAceptado;
    private String estado;
    private Integer idJardin;
    private Integer idSolicitud;
    private String ubicacion;
}
