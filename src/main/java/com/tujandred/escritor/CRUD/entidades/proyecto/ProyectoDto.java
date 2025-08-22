package com.tujandred.escritor.CRUD.entidades.proyecto;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.proyecto.Proyecto}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ProyectoDto", description = "DTO que representa un proyecto narrativo. Hereda de ElementoDto. Incluye información sobre el universo al que pertenece.")
public class ProyectoDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece el proyecto", example = "1")
    Long universoId;
    @Override
    public String toString() {
        return super.toString();
    }
}