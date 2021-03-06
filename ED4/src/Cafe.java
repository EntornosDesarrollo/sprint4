/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * @author Jose Luis
 * @version 1.0
 */
/*
La clase Nespresso, hereda de Cafetera y sirve Capsulas de Cafe
*/
public class Cafe extends NewClass{
    private double cafePorCapsula;

    //getters y setters
    public double getCafePorCapsula() {
        return cafePorCapsula;
    }

    public void setCafePorCapsula(double cafePorCapsula) {
        this.cafePorCapsula = cafePorCapsula;
    }
    
    //constructor, que recibe la capacidad Maxima y la cantidad de Cafe de capsula
    public Cafe(int capacidadMaxima, int cafePorCapsula) {
      
 
    }
    
    /**
     * Metodo para llenar la taza de cafe
     * @param cantidadActual
     * @return
     * @throws IllegalArgumentException 
     */
    
      public double servirCafe(int cantidadActual) throws IllegalArgumentException {
          
         if (getCafePorCapsula() > cantidadActual){
             System.err.println("No se puede servir una cantidad de cafe por capsula superior al cafe actual");
         }else
         cantidadActual -= getCafePorCapsula();
         //la cantidad actual menos la capsula servida, sera el resultado de cantidadActual
         return cantidadActual;
    }    
    }
    

