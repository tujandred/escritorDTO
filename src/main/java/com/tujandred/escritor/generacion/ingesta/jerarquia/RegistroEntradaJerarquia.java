package com.tujandred.escritor.generacion.ingesta.jerarquia;

import com.tujandred.escritor.generacion.ingesta.RegistroEntrada;
import com.tujandred.escritor.generacion.ingesta.items.RegistroEntradaItemGenerable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntradaJerarquia {
    private RegistroEntradaItemGenerable padre = null;
    private List<RegistroEntradaNodo> hijos = new ArrayList<>();
}
