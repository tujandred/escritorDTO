package com.tujandred.escritor.CRUD.entidades;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.Universo}
 */

@Data
@AllArgsConstructor
@Schema(name = "UniversoDto", description = "DTO que representa un universo narrativo. Hereda de ElementoDto. ")
public class UniversoDto extends ElementoDto {
    @Override
    public String toString() {
        return super.toString();
    }
}
