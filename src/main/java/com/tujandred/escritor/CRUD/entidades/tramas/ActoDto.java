package com.tujandred.escritor.CRUD.entidades.tramas;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.tramas.Acto}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ActoDto", description = "DTO que representa un acto dentro de una trama narrativa. Hereda de ElementoDto. Incluye información sobre la trama a la que pertenece.")
public class ActoDto extends ElementoDto {
    @Schema(description = "Identificador de la trama a la que pertenece el acto", example = "2")
    Long tramaId;
    @Override
    public String toString() {
        return super.toString();
    }

}