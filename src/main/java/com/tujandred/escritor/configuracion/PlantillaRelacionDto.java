package com.tujandred.escritor.configuracion;

import com.tujandred.escritor.CRUD.basicos.TipoDatos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.configuracion.plantillasRelacion.PlantillaRelacion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlantillaRelacionDto implements Serializable {
    private Long id;
    private String nombre;
    private String tipoRelacion;
    private String etiqueta1;
    private String etiqueta2;
    private String descripcion;
    private Map<String, Object> atributos;
    private Set<TipoDatos> tiposPermitidos1 = new LinkedHashSet<>();
    private Set<TipoDatos> tiposPermitidos2 = new LinkedHashSet<>();
}