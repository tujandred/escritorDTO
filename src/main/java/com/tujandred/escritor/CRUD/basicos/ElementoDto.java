package com.tujandred.escritor.CRUD.basicos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Schema(name = "ElementoDto", description = "DTO que representa un elemento generable con tipo y orden. Hereda de GenerableDto.")
public class ElementoDto extends GenerableDto{
    @Schema(description = "Tipo de generable al que pertenece el elemento", example = "Capítulo")
    private String tipoGenerable;
    @Schema(description = "Orden del elemento dentro de su jerarquía. Si el valor es igual o menor a 0, indica que no hay orden", example = "1")
    private Integer orden;
}
