/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema4;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        double f,res;
        c= solicitarC();
              
    }   
    public static int solicitarC(){
        Scanner entrada= new Scanner(System.in);
        int c;
        System.out.println("Introduce Cº a Convertir");
            c= entrada.nextInt();
        double f, res;
        res= ((c * 9/5) + 32);
        System.out.println("El resultado es:" + res + "fº");
        return c;
    }
}
