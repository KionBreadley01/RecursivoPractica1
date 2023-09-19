/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorialalternativo4a.practica1recursivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ROBERTO
 */
public class Practica1Recursivo {

    public static void main(String[] args)  throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Hola Calcular las potencias ");
        
        System.out.println("Ingresa el valo de y:");
        int y = Integer.parseInt(reader.readLine());
        
        System.out.println("Ingresa el valor de z:");
        int z = Integer.parseInt(reader.readLine());
        
        System.out.println("El valor de" + y + "Elevado ala potencia de " + z + "es:" +R(y,z));        
      
    }

    public static int R(int y, int z) {
        if (z == 0) {
            return 1;
        } else {
            return y * R(y, z - 1);
        }
    
    }
}
