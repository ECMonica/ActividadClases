/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclases;
import  java.util.Scanner ;


/**
 *
 * @author cj_be
 */
public class ActividadClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
  Scanner leer = new Scanner(System.in);
        personas actividades = new personas();
        
        actividades.setTipo("Alumno");
        actividades.setNombre("Monica");
        actividades.setEdad(19);
        actividades.setSexo('M');
        actividades.setCurp("EUCM011122MCCHSNA3");
        actividades.setActividad("Actividad de Clases");
            System.out.println(actividades.toString());
        int num1 = leer.nextInt();
        switch(num1) {
            case 1:
                actividades.entrada();
                break;
            case 2:
                actividades.actividad();
                break;
            case 3:
                actividades.reseso();
                break;
            case 4:
                actividades.salida();
        }
        edificios actividades2 = new edificios();
        
        actividades2.setCampus('V');
        actividades2.setÁrea("direccion");
        actividades2.setEnergiaEl(false);
        actividades2.setEstado("Ocupado");
        actividades2.setCapacidad(30);
        
            System.out.println(actividades.toString());
        int num2 = leer.nextInt();
        switch(num2) {
            case 1:
                actividades2.estadoDeUso();
                break;
            case 2:
                actividades2.condiciones();
                break;
            case 3:
                actividades2.capacidad();
                break;
        }
        
    }
    
}