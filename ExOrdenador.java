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
      /*  System.out.print("Que tipo de raton es ");
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
        
        
       
        //rato rato1 = new rato("inal");
        rato rato1 = new rato(tipo);
        pantalla pantalla1 = new pantalla(tipoPantalla,pulgadasPantalla);
        cpu cpu1 = new cpu(velocidadCpu,memoriaCpu);
        
        ordenador ord1 = new ordenador(rato1,pantalla1,cpu1);
        ord1.amosar();                              
        /**/
    
    //prueba
   /* ordenador ord2 = new ordenador();
    String x=ord2.amosar1();
    
    System.out.print(x);
   
    String cutString = x.substring(14, 18);
    System.out.print("\n TipoPantalla "+cutString);
    
     String cutString2 = x.substring(28,32);
    System.out.print("\nPulgasdas "+cutString2);
    
     String cutString3 = x.substring(43,46);
    System.out.print("\nVelocidad "+cutString3);
    
     String cutString4 = x.substring(55,57);
    System.out.print("\nMemoria "+cutString4);*/
    //prueba
    //prueba
    ordenador ord2 = new ordenador();
    String x=ord2.amosar1();
    
    String str = new String(x);
      int index = str.indexOf(':');  
      index+=1;
      int y =str.indexOf(',', index);              
          //    System.out.print(index);
          //  System.out.print("->"+y+"<-");
        
        String cutString = x.substring(index, y);
        System.out.print("Tipo raton "+cutString);
        
        index =y+1;
        int var1 =str.indexOf(':', index);
        int var2 =str.indexOf(',', index);
        String cutString1 = x.substring(var1,var2);
        System.out.print("TipoPantalla "+cutString1);
    
    
        index =var2+1;
       int var3 =str.indexOf(':', index);
       int var4 =str.indexOf(',', index);
       String cutString2 = x.substring(var3,var4);
       System.out.print("Pulgasdas "+cutString2);
    
     index =var4+1;        
     int var6 =str.indexOf(':', index);
     int var7 =str.indexOf(',', index);
    String cutString3 = x.substring(var6,var7);
    System.out.print("Velocidad "+cutString3);
    
    
     index =var7+1;        
    int var8 =str.indexOf(':', index);
    int var9 =str.indexOf(',', index);
    String cutString4 = x.substring(var8,var9);
    System.out.print("Memoria "+cutString4);


    }
    
}
