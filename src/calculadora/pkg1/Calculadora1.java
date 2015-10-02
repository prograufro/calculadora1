/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.pkg1;
import java.util.*;
/**
 *
 * @author Felipe Jara
 */
public class Calculadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int operacion, operacionb;//operacionb = operacion basica
        double numero1, numero2, resultado;
        Scanner leer = new Scanner(System.in);
        do{
        System.out.println("ingrese la operacion que desea realizar, 1=operaciones basicas, 2=mayor de dos numeros, 3=menor de dos numeros, 4=potencia de un numero, 5=porcentaje de un numero.");
         operacion = leer.nextInt();
        }while(operacion<1 || operacion>5);
         if(operacion == 1){
        
             System.out.println("ingrese: 1=suma, 2=resta, 3=multiplicacion, 4=division");
             operacionb = leer.nextInt();
             
           if(operacionb == 1){  
            System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 + numero2;
             
             System.out.println("el resultado es: "+ resultado);

         }else{
               if(operacionb == 2){
                   System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 - numero2;
             
             System.out.println("el resultado es: "+ resultado);

               }else{
                   if(operacionb == 3){
                       System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 * numero2;
             
             System.out.println("el resultado es: "+ resultado);

                   }else{
                       if(operacionb == 4){
                           
                           System.out.println("ingrese el primer numero");
                             numero1 = leer.nextDouble();
             
                             System.out.println("ingrese el segundo numero");
                              numero2 = leer.nextDouble();
             
                               resultado = numero1 / numero2;
              
                               System.out.println("el resultado es: "+ resultado);

                           
                       }
                   }
               }
           }
           
         
         
         
    }else{
             if(operacion == 2){
                 System.out.println("ingrese el primer numero");
                  numero1 = leer.nextDouble();
             
                 System.out.println("ingrese el segundo numero");
                  numero2 = leer.nextDouble();
                  if(numero1 > numero2){
                      System.out.println();
                  }
                 
             }
         }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
