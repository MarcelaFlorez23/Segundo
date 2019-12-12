/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
import java.util.Scanner;
/**
 *
 * @author Marcela Florez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
    
  String contraseña;
 
  int conta=1;
  while (conta<=3){
      conta = conta+1;
      
       System.out.println("Digite la contraseña");
        contraseña = sc.nextLine();
        
     switch (contraseña){
         case "zapato30":
                 System.out.println("La contraseña es correcta");
                 
                 break;
                 
         case "kolbi78":
             System.out.println("La contraseña es correcta");
             break;
             
         case "arenita7":
             System.out.println("la contraseña es correcta");
             
             break;
             
         default:
                 System.out.println("contraseña incorrecta");
                 break;
      
     } 
    }
        System.out.println("no tinee mas intentos");
}
}


