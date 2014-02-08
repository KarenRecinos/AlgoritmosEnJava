/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

                int numero1, numero2,numero3;

		
		
            numero1=Integer.parseInt(args[0].toString());
	
            numero2=Integer.parseInt(args[1].toString());

	System.out.println("limites: "+args[0]+" "+args[1]);
	

	for(int i=numero1;i<=numero2;i++){
       numero3=i+1;
		
        if (i!=numero2&&i!=numero1){ 
    System.out.println(i);
     
        }

      }
   }

}