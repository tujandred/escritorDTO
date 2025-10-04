package com.tujandred.escritor.generacion.contexto;

import com.tujandred.escritor.CRUD.basicos.TipoDatos;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(name = "ItemContextoDTO",
        description = "Datos de los distintos elementos contexto para la generación para un generable")
public class ItemContextoDTO {
    @Schema(description = "Identificador del generable", example = "1")
    private Long id;

    @Schema(description = "Nombre", example = "Capítulo 1")
    private String nombre;

    @Schema(description = "Término de búsqueda asociado", example = "capitulo1")
    private String searchTerm;

    @Schema(description = "Tipo de datos del registro generable", example = "Texto")
    private TipoDatos tipoDatos;
}
