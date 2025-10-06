package com.tujandred.escritor.generacion.ingesta.relaciones;

import com.tujandred.escritor.generacion.ingesta.items.RegistroEntradaItemGenerable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntradaItemRelacion {
    private String nombre = "";
    private String descripcion = "";
    private Map<String, Object> propiedades = new HashMap<>();
    private String tipoRelacion = "";
    private RegistroEntradaItemGenerable destino = null;
}
