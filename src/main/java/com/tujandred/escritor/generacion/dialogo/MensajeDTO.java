package com.tujandred.escritor.generacion.dialogo;

import com.tujandred.escritor.generacion.dialogo.enums.TipoMensaje;
import com.tujandred.escritor.generacion.dialogo.enums.TipoResultadoMensaje;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(name = "MensajeDTO",
        description = "Mensaje parte de un diálogo para la generación con IA")
public class MensajeDTO {
    @Schema(
        description = "Identificador único del mensaje",
        example = "123e4567-e89b-12d3-a456-426614174000"
    )
    private UUID uuid = UUID.randomUUID();

    @Schema(
        description = "Tipo de mensaje",
        implementation = TipoMensaje.class
    )
    private TipoMensaje tipo;

    @Schema(
        description = "Texto del mensaje",
        example = "Hola, ¿cómo puedo ayudarte?"
    )
    private String texto;

    @Schema(
        description = "Fecha y hora de creación del mensaje",
        type = "string",
        format = "date-time",
        example = "2025-10-04T12:34:56.789Z"
    )
    private Instant timeStamp = Instant.now();

    @Schema(
        description = "Tipo de resultado del mensaje",
        implementation = TipoResultadoMensaje.class,
        example = "TEXTO"
    )
    private TipoResultadoMensaje tipoResultado = TipoResultadoMensaje.TEXTO;
}
