package com.tujandred.escritor.generacion.dialogo.SolicitudesGeneracion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "InstruccionPropiedad", description = "Instrucciones para la generación de una propiedad específica.")
public class InstruccionPropiedad {
    @Schema(
            description = "Nombre de la propiedad o campo a generar",
            example = "titulo"
    )
    private String nombreCampo;
    @Schema(
            description = "Significado o contexto de la propiedad para guiar la generación",
            example = "El título debe ser llamativo y relevante para el contenido."
    )
    private String significado;
    @Schema(
            description = "Longitud aproximada del resultado",
            example = "100"
    )
    private int longitud = 100;

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(nombreCampo)
                .append(": ")
                .append(significado)
                .append(". Longitud: ")
                .append(longitud)
                .append(" palabras.");
        return sb.toString();
    }
}
