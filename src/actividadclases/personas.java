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
public class personas {
      private String tipo;
    private String nombre;
    private int edad;
    private char sexo;
    private String curp;
    private String actividad;

    public personas() {
    }

    public personas(String tipo, String nombre, int edad, char sexo, String curp, String actividad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.curp = curp;
        this.actividad = actividad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "personas{" + "tipo=" + tipo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", curp=" + curp + ", actividad=" + actividad + 
                '}'+"\n Seleccione la actividad correspondiente\n 1-.entrada\n 2-.actividad\n 3-.reseso\n 4-.salida";
        
    }
    
    public void entrada(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta entrando a la facultad");
    }
    public void actividad(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta realazando la siguiente actividad:" + this.actividad);
    }
    public void reseso(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta en reseso");
    }
    public void salida(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta saliendo de la facultad");
    }
    
}