package com.tujandred.escritor.generacion.ingesta;

import com.tujandred.escritor.generacion.ingesta.items.RegistroEntradaItem;
import com.tujandred.escritor.generacion.ingesta.jerarquia.RegistroEntradaJerarquia;
import com.tujandred.escritor.generacion.ingesta.relaciones.RegistroEntradaItemRelacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntrada {
    private String nombre = "";
    private String descripcion = "";
    private String descripcionLarga = "";
    private Map<String, Object> propiedades = new HashMap<>();
    private RegistroEntradaJerarquia jerarquia;
    private List<RegistroEntradaItem> clasificacion = new ArrayList<>();
    private List<RegistroEntradaItemRelacion> relaciones = new ArrayList<>();
    private String contenido = "";

}
