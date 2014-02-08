/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		
		int resultado = 1;
		int valnull = 0;

		valnull=Integer.parseInt(args[0].toString());
   		System.out.println(args[0]);
   
        
        for(int x=1; x<=valnull;x++)
        {
           
            resultado*=x;
             
           
        }

   		System.out.println("el producto es: "+resultado);
      
   }

}