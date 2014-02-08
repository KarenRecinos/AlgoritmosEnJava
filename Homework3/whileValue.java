/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual;
                

     valorActual=Integer.parseInt(args[0].toString());
     
    for(int i=0;i<valorActual;i++){

  System.out.println("El valor actual es: "+i);
  }
 }
}