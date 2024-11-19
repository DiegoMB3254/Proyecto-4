/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import modelo.Cotizante;

/**
 * Proporciona una gestión básica de cotizantes utilizando una lista en memoria.
 * Esta implementación no persiste los datos y es adecuada para pruebas o
 * almacenamiento temporal.
 *
 * @author MI PC
 */
public class InMemoryCotizanteRepository implements CotizanteRepository {

    private List<Cotizante> cotizantes = new ArrayList<>();

    @Override
    public Cotizante findById(String id) {
        return cotizantes.stream()
                .filter(c -> c.getAttribute("id").equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cotizante> findAll() {
        return new ArrayList<>(cotizantes);
    }

    @Override
    public void save(Cotizante cotizante) {
        cotizantes.add(cotizante);
    }

    @Override
    public void delete(Cotizante cotizante) {
        cotizantes.remove(cotizante);
    }
}
