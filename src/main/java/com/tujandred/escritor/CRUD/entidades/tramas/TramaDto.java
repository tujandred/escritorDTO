package com.github.tujandred.paperbackDTO.CRUD.entidades.tramas;

import com.github.tujandred.paperbackDTO.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.tramas.Trama}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "TramaDto", description = "DTO que representa una trama narrativa. Hereda de ElementoDto. Incluye información sobre el universo al que pertenece.")
public class TramaDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece la trama", example = "1")
    Long universoId;
}