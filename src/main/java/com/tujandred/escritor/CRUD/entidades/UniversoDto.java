package com.tujandred.escritor.CRUD.entidades;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.Universo}
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(name = "UniversoDto", description = "DTO que representa un universo narrativo. Hereda de ElementoDto. ")
public class UniversoDto extends ElementoDto {
}
