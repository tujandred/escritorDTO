package com.tujandred.escritor.generacion.contexto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(name = "ContextoGeneracionDTO",
        description = "Datos de contexto para la generación para un generable")
public class ContextoGeneracionDTO {
    @Schema(description = "Elemento principal del contexto (el que estamos generando)", implementation = ItemContextoDTO.class)
    private ItemContextoDTO principal;
    @Schema(description = "Elementos auxiliares del contexto (otros elementos relacionados que pueden ayudar en la generación)", implementation = ItemContextoDTO.class, type = "array")
    private List<ItemContextoDTO> auxiliares;
}
