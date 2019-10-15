/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
//George Ortiz
import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public final class Operaciones {
     public int[] arreglo = new int[20];
     public int opcion;
    //costructor
    public Operaciones(){
        this.mostrarMenu();
        
    }
    //mostrar el menú en pantalla
    public void mostrarMenu(){
        System.out.println("Escoja opción\n"
                + "1.Llenar Arrays\n"
                + "2.Escribir Arrays\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5.Tamaño\n"
                + "6.Salir");
        
        Scanner operaciones = new Scanner (System.in);
        opcion = operaciones.nextInt();
        this.cargarOpcion(opcion);
        
    }
    //leer arreglo
    public void leerArreglo(){
        
    }
    //escribe el arreglo
    public void escribirArreglo(){
        
        
    }
    // genera sumatoria
    public void sumatoria(){
        
    }
    //genera productoria
    public void productoria(){
        
    }
    public void cargarOpcion(int op){
        switch(op){
            case 1: this.leerArreglo(); break;
            case 2: this.escribirArreglo(); break;
            case 3: this.sumatoria(); break;
            case 4: this.productoria(); break;
            case 5: System.out.println(this.arreglo.length); break;
            case 6: break;
            default: System.out.println("Error. Opción Incorrecta"); break;
        }
        //System.out.println("La opción escogida es: "+ opcion);
        
    }
}
