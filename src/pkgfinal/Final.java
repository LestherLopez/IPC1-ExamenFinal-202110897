/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.util.Scanner;

/**
 *
 * @author 50246
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char repetir='m';
         while(repetir=='m'){  
         Scanner opcion = new Scanner (System.in);
         System.out.println("EXAMEN FINAL");
        System.out.println("1. Problema 1");
        System.out.println("2. Problema 2");            //menu
        System.out.println("3. Problema 3");
        System.out.println("4. Salir");
        int x = opcion.nextInt();
        if(x==1){
              Scanner numero1 = new Scanner (System.in);
              System.out.println("Ingrese el primer número");
              int a = numero1.nextInt();
              Scanner numero2 = new Scanner (System.in);
              System.out.println("Ingrese el segundo número");
              int b = numero2.nextInt();
              if(a>b){
                  System.out.println(a + " es mayor a " + b);
              }
              else if(b>a){
                  System.out.println(b + " es mayor a " + a);
              }
              
        }
        else if(x==2){
            Scanner n = new Scanner (System.in);
            System.out.println("Ingrese un número impar");
            int numero_impar  = n.nextInt();
                if(numero_impar%2==0){
                 System.out.println("Error: El numero que ingreso es par");
                }
                else{
                    System.out.println();
                    System.out.println();
                    for(int i = 1; i<=(numero_impar/2)+1; i++){
                        //Espacios en blanco
                        for(int j = 1; j<=numero_impar-i; j++){
                            System.out.print(" ");
                        }

                        //Asteriscos
                        for(int k=1; k<=(i*2)-1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }                 
                }
        }
        else if(x==3){
             Scanner entrada = new Scanner (System.in);
             System.out.println("Ingrese el número de vacas");
             int nvacas = entrada.nextInt();
             Scanner entrada2 = new Scanner (System.in);
             System.out.println("Ingrese el peso limite del camión en kilogramos");
             int pesomaximo = entrada2.nextInt();
             int peso_vacas []={223,243,100,200,200,155,300,150};
             int leche []={30,34,28,45,31,50,29,1};
             
             
        }
        else if(x==4){
            System.exit(0);
        }
    }
         
         System.out.println();
    }
}
