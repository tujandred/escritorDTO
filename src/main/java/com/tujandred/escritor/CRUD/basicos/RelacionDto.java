package com.github.tujandred.paperbackDTO.CRUD.basicos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "RelacionDto", description = "DTO que representa una relación entre dos elementos dentro de un universo. Incluye identificadores, tipo de relación y etiquetas asociadas.")
public class RelacionDto extends GenerableDto{
    @Schema(description = "Identificador del universo al que pertenece la relación", example = "1")
    Long universoId;
    @Schema(description = "Identificador del primer elemento de la relación", example = "10")
    Long elemento1Id;
    @Schema(description = "Identificador del segundo elemento de la relación", example = "20")
    Long elemento2Id;
    @Schema(description = "Tipo de relación entre los elementos", example = "amistad")
    String tipoRelacion;
    @Schema(description = "Etiqueta asociada al primer elemento", example = "protagonista")
    String etiqueta1;
    @Schema(description = "Etiqueta asociada al segundo elemento", example = "antagonista")
    String etiqueta2;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Schema(description = "Etiqueta para la relación saliente", example = "conoce a")
    String etiquetaSaliente;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Schema(description = "Etiqueta para la relación entrante", example = "es conocido por")
    String etiquetaEntrante;
    @Schema(description = "Prioridad del primer elemento en la relación. 1 es la máxima prioridad.", example = "5")
    private Integer prioridad1 = 5;
    @Schema(description = "Prioridad del segundo elemento en la relación. 1 es la máxima prioridad.", example = "3")
    private Integer prioridad2;
}