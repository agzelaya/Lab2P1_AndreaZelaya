
package lab2p1_andreazelaya;
import java.util.Scanner;

public class Lab2P1_AndreaZelaya {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("__MENU__");
        System.out.println("1. MCD");
        System.out.println("2. Sumatoria");
        System.out.println("3. Supermercado");
        System.out.println(" ");
        System.out.print("Ingrese la opcion que desea utilizar: ");
        int opcion = in.nextInt();
        System.out.println(" ");
        
        do{
        if (opcion == 1){
            System.out.println("MCD en proceso.");
            System.out.print("Ingrese el valor del primer numero: ");
            int valorA = in.nextInt();
            System.out.print("Ingrese el valor del segundo numero: ");
            int valorB = in.nextInt();
            int B = valorB, A = valorA; 
            
            if (valorA <= 0 || valorB <= 0){
                System.out.println("Error. Los numeros ingresados deben ser positivos.");
            }
            
            else{
                while (A != B){
                    if (A < B){
                       B = B - A;
                    }
                    if (B < A){
                        A = A - B;
                    }
                 }//fin del main while
            }//fin else
            
            if (A == B)
                System.out.println("EL MCD de " + valorA + " y " + valorB + " es: " + A);
        }//fin opcion 1
        
        else if (opcion == 2){
            System.out.println("Sumatoria en proceso");
            System.out.print("Ingrese un numero: ");
            int K = in.nextInt();
            double result = 0, acum = 0;
                    
            if (K < 0){
                System.out.println("Error. Debe ingresar un valor positivo.");
            }//fin if de validacion
            
            else{
                double n = 1; 
                double calc1;
                
                while (n <= K){
                    calc1 = n/(n+1);
                    result = Math.pow(calc1, n);
                    n++;
                    acum = acum + result;
                }// fin while
            }//fin else
            System.out.println("Output: " + acum);
        }//fin opcion2
        
        if (opcion == 3){
            System.out.println("Programa para supermercado en progreso");
            System.out.print("Ingrese tipo de cliente: ");
            int cliente = in.nextInt();
            System.out.print("Ingrese el precio de la unidad del producto: ");
            double precio_unid = in.nextDouble();
            System.out.print("Ingrese la cantidad de unidades del producto: ");
            int cantidad = in.nextInt();
            double total;
            
            if (cliente == 0 ){
                if (cantidad >= 10  && cantidad <= 19){
                    cantidad = cantidad - 2;
                }// fin if cliente 0.1
                else if (cantidad > 20){
                    cantidad = cantidad - 5;
                }// fin else cliente 0.2
                total = cantidad * precio_unid;
                System.out.println("El total es a pagar es: " + total);
            }//fin cliente 0
            
            else if (cliente == 1 ){
                if (cantidad >= 20  && cantidad <= 29){
                    cantidad = cantidad - 2;
                }// fin if cliente 1.1
                else if (cantidad > 30){
                    cantidad = cantidad - 5;
                }//fin else cliente 1.2
                total = cantidad *( precio_unid - (precio_unid * 0.1));
                System.out.println("El total es a pagar es: " + total);
            }//fin cliente 1
            
            else if (cliente == 2 ){
                if (cantidad >= 30  && cantidad <= 39){
                    cantidad = cantidad - 2;
                }// fin if cliente 1.1
                else if (cantidad > 40){
                    cantidad = cantidad - 5;
                }//fin else cliente 1.2
                total = cantidad *( precio_unid - (precio_unid * 0.3));
                System.out.println("El total es a pagar es: " + total);
            }//fin cliente 1
            
        }//fin opcion 3
        
        System.out.println(" ");
        System.out.println("__MENU__");
        System.out.println("1. MCD");
        System.out.println("2. Sumatoria");
        System.out.println("3. Supermercado");
        System.out.println(" ");
        System.out.print("Ingrese la opcion que desea utilizar (4 para salir): ");
        opcion = in.nextInt();
        System.out.println(" ");
        }while (opcion != 4);
    }// fin main method
    
}// fin class
