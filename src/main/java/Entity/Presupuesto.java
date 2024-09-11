package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "presupuestos")
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fechal_envio", nullable = false)
    private ZonedDateTime fechalEnvio;

    @Column(name = "fecha_aceptado")
    private ZonedDateTime fechaAceptado;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_jardin", nullable = false)
    private Jardine idJardin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud")
    private Solicitude idSolicitud;

    @OneToOne
    @JoinColumn(name = "id_document", nullable = false)
    private Documentos idDocument;

}