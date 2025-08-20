package com.github.tujandred.paperbackDTO.CRUD.entidades;

import com.github.tujandred.paperbackDTO.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.Universo}
 */

@Data
@AllArgsConstructor
@Schema(name = "UniversoDto", description = "DTO que representa un universo narrativo. Hereda de ElementoDto. ")
public class UniversoDto extends ElementoDto {
}
