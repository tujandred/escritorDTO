package com.tujandred.escritor.generacion.dialogo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "SolicitudGeneracionEstructurada", description = "DTO para solicitar la generación estructurada de contenido con IA.")
public class SolicitudGeneracionEstructurada {
    @Schema(
            description = "ID del elemento para el cual se generarán las propiedades",
            example = "123"
    )
    private Long id;
    @Schema(
            description = "Conjunto de propiedades a generar. si se deja vacío, se generarán todas las propiedades posibles",
            type = "array",
            example = "['propiedad1', 'propiedad2', 'propiedad3']"
    )
    private Set<String> propiedadesAgenerar;
    @Schema(
            description = "Diálogo completo que incluye instrucciones, mensajes y parámetros. Se utilizará como contexto para la generación.",
            implementation = DialogoDTO.class
    )
    private DialogoDTO dialogo;
}
