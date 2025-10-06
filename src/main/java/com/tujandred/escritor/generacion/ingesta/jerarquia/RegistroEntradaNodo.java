package com.tujandred.escritor.generacion.ingesta.jerarquia;

import com.tujandred.escritor.generacion.ingesta.items.RegistroEntradaItemGenerable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntradaNodo {
    private String nombre = "";
    private boolean esCarpeta = false;
    private List<RegistroEntradaNodo> hijos = new ArrayList<>();
    private RegistroEntradaItemGenerable itemGenerable = null;
    private int numOrden = 0;
}
