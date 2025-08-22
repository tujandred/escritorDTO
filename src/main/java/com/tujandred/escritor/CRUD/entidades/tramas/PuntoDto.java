package com.tujandred.escritor.CRUD.entidades.tramas;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.tramas.Punto}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "PuntoDto", description = "DTO que representa un punto dentro de un acto narrativo. Hereda de ElementoDto. Incluye información sobre el acto al que pertenece.")
public class PuntoDto extends ElementoDto {
    @Schema(description = "Identificador del acto al que pertenece el punto", example = "5")
    Long actoId;
    @Override
    public String toString() {
        return super.toString();
    }
}