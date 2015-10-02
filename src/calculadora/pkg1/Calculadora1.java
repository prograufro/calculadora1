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
        
        int operacion, operacionb, seguir ;//operacionb = operacion basica
        double numero1, numero2, resultado;
        
        Scanner leer = new Scanner(System.in);
        
        try{   
            
     do{    
        
         do{
        System.out.println("ingrese la operacion que desea realizar, 1=operaciones basicas, 2=mayor y menor de dos numeros, 3=potencia de un numero, 4=porcentaje de un numero."); 
        operacion = leer.nextInt();
        }while(operacion<1 || operacion>5);
        
        if(operacion == 1){//si operacion = 1 ingresa a operaciones basicas
         do{
             System.out.println("ingrese: 1=suma, 2=resta, 3=multiplicacion, 4=division");
             operacionb = leer.nextInt();
      
         }while(operacionb<1 || operacionb>4);
         
           if(operacionb == 1){  
            System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 + numero2;
             
             System.err.println("el resultado de la suma es: "+ resultado);

         }else{
               if(operacionb == 2){
                   System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 - numero2;
             
             System.err.println("el resultado de la resta es: "+ resultado);

               }else{
                   if(operacionb == 3){
                       System.out.println("ingrese el primer numero");
             numero1 = leer.nextDouble();
             
             System.out.println("ingrese el segundo numero");
             numero2 = leer.nextDouble();
             
             resultado = numero1 * numero2;
             
             System.err.println("el resultado de la multiplicación es: "+ resultado);

                   }else{
                       if(operacionb == 4){
                           
                           System.out.println("ingrese el primer numero");
                             numero1 = leer.nextDouble();
             do{
                             System.out.println("ingrese el segundo numero");
                              numero2 = leer.nextDouble();
                              if(numero2 == 0){
                                 System.err.println("NO SE PUEDE DIVIDIR POR 0");
                                 System.out.println();
                              }
                              
             }while(numero2 == 0);
                               resultado = numero1 / numero2;
              
                               System.err.println("el resultado de la división es: "+ resultado);

                           
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
                      System.err.println("el numero" +numero1+ "es el mayor");
                       System.out.println();
                        System.err.println("el numero " +numero2+ "es el menor ");
                  }else{
                      System.err.println("el numero " +numero2+ " es mayor");
                       System.out.println();
                        System.err.println("el numero " +numero1+ "es el menor");
                  }
                 
             }else{
                 if(operacion == 3){
                     System.out.println("ingrese el numero base");
                  numero1 = leer.nextDouble();
             
                 System.out.println("ingrese el exponente");
                  numero2 = leer.nextDouble();
                  
                  resultado = (double) Math.pow(numero1,numero2); 
                  
                  System.err.println("el resultado de la potencia es: "+resultado);
                     
                 }else{
                     if(operacion == 4){
                         
                         System.out.println("ingrese el porcentaje");
                             numero1 = leer.nextDouble();
             
                         System.out.println("ingrese el numero a sacar el porcentaje");
                             numero2 = leer.nextDouble();
                         
                             resultado = (numero2 * numero1)/100 ;
                             System.err.println("el "+numero1+"% de "+numero2+" es: "+resultado);
                         
                     }
                 }
             }
         }
        
         do{ 
       System.out.println();
        System.out.println("¿Desea realizar otra operacion? 1=si, 2=no");
        
        seguir = leer.nextInt();
        
        System.out.println();
        
         }while(seguir<1 || seguir>2);
         
    }while(seguir == 1);
    
    
    
        } catch (InputMismatchException in){
            System.err.println("ERROR, PORFAVOR INGRESE UN NUMERO");
            System.out.println();
        }
    
    
    
    
    
    
    
    
    
    }
    
}
