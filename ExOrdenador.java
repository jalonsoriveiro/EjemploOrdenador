/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class ExOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Que tipo de raton es ");
        Scanner sc = new Scanner(System.in);        
        String tipo = sc.next();
        
        System.out.print("Que marca es la pantalla ");
       //Scanner sc = new Scanner(System.in);        
        String tipoPantalla = sc.next();
        
        System.out.print("Pulgadas");
       //Scanner sc = new Scanner(System.in);        
        float pulgadasPantalla = sc.nextFloat();
        
        System.out.print("cpu velocidad");
       //Scanner sc = new Scanner(System.in);        
        int velocidadCpu= sc.nextInt();
        
         System.out.print("cpu memoria");
       //Scanner sc = new Scanner(System.in);        
        int memoriaCpu= sc.nextInt();
        
        
        /**/
        //rato rato1 = new rato("inal");
        rato rato1 = new rato(tipo);
        pantalla pantalla1 = new pantalla(tipoPantalla,pulgadasPantalla);
        cpu cpu1 = new cpu(velocidadCpu,memoriaCpu);
        
        ordenador ord1 = new ordenador(rato1,pantalla1,cpu1);
        ord1.amosar();                              
        /**/
    }
    
}
