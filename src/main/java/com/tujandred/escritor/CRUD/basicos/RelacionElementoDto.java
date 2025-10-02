package com.tujandred.escritor.CRUD.basicos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(name = "RelacionElementoDto", description = "DTO que representa de un elemento con otros. Incluye identificadores, tipo de relación y etiquetas asociadas.")
public class RelacionElementoDto extends GenerableDto {
    @Schema(description = "Identificador del universo al que pertenece la relación", example = "1")
    Long universoId;
    @Schema(description = "Identificador del elemento seleccionado", example = "10")
    Long esteId;
    @Schema(description = "Identificador del otro elemento de la relación", example = "10")
    Long otroId;
    @Schema(description = "Nombre del otro elemento de la relación", example = "Rey Arturo")
    String nombreOtro;
    @Schema(description = "Tipo del otro elemento de la relación", example = "Personaje")
    TipoDatos tipoOtro;
    @Schema(description = "Tipo de relación entre los elementos", example = "amistad")
    String tipoRelacion;
    @Schema(description = "Etiqueta de la relación del elemento seleccionado al destino", example = "protagonista")
    String etiqueta;
    @Schema(description = "Prioridad de la relación para el elemento seleccionado. 1 es la máxima prioridad.", example = "5")
    private Integer prioridad = 5;
}