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
         Scanner opcion = new Scanner (System.in);
        System.out.println("1.Problema 1");
        System.out.println("2. Problema 2");            //menu
        System.out.println("3. Problema 3");
        System.out.println("4. Salir");
        int x = opcion.nextInt();
        if(x==1){
              System.out.println("1.Problema 1");
        }
        else if(x==2){
             System.out.println("2. Problema 2");  
        }
        else if(x==3){
             System.out.println("3. Problema 3");
        }
        else if(x==4){
            //nada
        }
    }
    
}
