/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 ** Clase que representa a un cotizante, incluyendo atributos personalizados,
 * su estado de embargabilidad y un nivel de prioridad.
 * 
 * @author MI PC
 */
public class Cotizante {
    
    public Map<String, Object> attributes;
    private boolean embargable;
    private int prioridad;

    public Cotizante() {
        this.attributes = new HashMap<>();
    }

    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    public boolean isEmbargable() {
        return embargable;
    }

    public void setEmbargable(boolean embargable) {
        this.embargable = embargable;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
}


