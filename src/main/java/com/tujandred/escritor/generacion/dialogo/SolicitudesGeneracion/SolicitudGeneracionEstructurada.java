package com.tujandred.escritor.generacion.dialogo.SolicitudesGeneracion;

import com.tujandred.escritor.generacion.dialogo.DialogoDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
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
    @Deprecated
    @Schema(
            description = "Conjunto de propiedades a generar. si se deja vacío, se generarán todas las propiedades posibles",
            type = "array",
            example = "['propiedad1', 'propiedad2', 'propiedad3']"
    )
    private Set<String> propiedadesAgenerar;
    @Schema(
            description = "Instrucciones específicas para cada propiedad a generar. Si se deja vacío, se generarán todas las propiedades posibles",
            type = "array",
            implementation = InstruccionPropiedad.class
    )
    private List<InstruccionPropiedad> instruccionesPropiedades = new ArrayList<>();
    @Schema(
            description = "Diálogo completo que incluye instrucciones, mensajes y parámetros. Se utilizará como contexto para la generación.",
            implementation = DialogoDTO.class
    )
    private DialogoDTO dialogo;
}
