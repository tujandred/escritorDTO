package com.tujandred.escritor.generacion.dialogo;

import com.tujandred.escritor.generacion.dialogo.enums.FormatoResultado;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "SolicitudGeneracionDTO", description = "DTO para solicitar la generación de contenido con IA, incluyendo acción, entrada, instrucciones, formato y parámetros.")
public class SolicitudGeneracionDTO {
    @Schema(
        description = "Acción solicitada para la generación",
        example = "generarTexto"
    )
    private String accion = "";

    @Schema(
        description = "Entrada principal para la generación",
        example = "Describe el universo de la historia."
    )
    private String entrada = "";

    @Schema(
        description = "Lista de instrucciones adicionales",
        type = "array",
        example = "['Usa un tono formal', 'Incluye detalles históricos']"
    )
    private List<String> instrucciones = new ArrayList<>();

    @Schema(
        description = "Clase esperada de la respuesta",
        type = "string",
        example = "java.lang.String"
    )
    private Class<? extends Object> claseRespuesta = String.class;

    @Schema(
        description = "Formato del resultado esperado",
        implementation = FormatoResultado.class,
        example = "TEXTO"
    )
    private FormatoResultado formatoResultado = FormatoResultado.TEXTO;

    @Schema(
        description = "Longitud máxima del resultado generado",
        example = "500"
    )
    private int longitudResultado = -1;

    @Schema(
        description = "Parámetros adicionales para la generación",
        type = "object",
        example = "{'idioma':'es','nivel':'avanzado'}"
    )
    private Map<String, String> parametros = new HashMap<>();
}
