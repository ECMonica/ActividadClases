/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclases;

/**
 *
 * @author cj_be
 */
public class edificios {
       private char campus;
    private String área;
    private boolean energiaEl;
    private String estado;
    private int capacidad;
    
    public edificios() {
    }

    public edificios(char campus, String área, boolean energiaEl, String estado, int capacidad) {
        this.campus = campus;
        this.área = área;
        this.energiaEl = energiaEl;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public char getCampus() {
        return campus;
    }

    public void setCampus(char campus) {
        this.campus = campus;
    }

    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }

    public boolean isEnergiaEl() {
        return energiaEl;
    }

    public void setEnergiaEl(boolean energiaEl) {
        this.energiaEl = energiaEl;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
 

    @Override
    public String toString() {
        return "edificios{" + "campus=" + campus + ", \u00e1rea=" + área + ", energiaEl=" + energiaEl 
                + '}'+"\n escoge la accion correspondiente\n 1.-estado de uso\n 2.-condiciones\n 3-.capacidad";
    }
    
    public void estadoDeUso(){
        System.out.println("El edificio del area de "+this.área+" y esta "+ this.estado);
    }
    public void condiciones(){
        System.out.println("El edificio del area de "+this.área+" esta en buenas condiciones");
    }
    public void capacidad(){
        System.out.println("El edificio del area de "+this.área+"con una capacidad de "+this.capacidad+"personas");
    }
    
    
}

