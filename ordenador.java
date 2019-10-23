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
public class ordenador {
    
  private rato rato = new rato();
  private pantalla pantalla = new pantalla();
  private cpu cpu = new cpu();
    

public ordenador(){
}
public ordenador(rato rato,pantalla pantalla,cpu cpu){

    this.rato = rato;
    this.pantalla = pantalla;
    this.cpu = cpu;    
}

public void setRato(rato rato){
    this.rato = rato;
}
public rato getRato(){

    return rato;
}
public void setPantalla(pantalla pantalla){

    this.pantalla = pantalla;
}
public pantalla getPantalla(){

        return this.pantalla;
}

public cpu getCpu(){
    return this.cpu;
}
public void setCpu(cpu cpu){

    this.cpu=cpu;
}

public void amosar(){

System.out.print("Tipo raton "+rato.getTipo()+"\nTipo pantalla "+pantalla.getMarca()+"\nPulgadas "+pantalla.getPulgadas()+"\nMemoria"+
        cpu.getMemoria()+"\nVelocidad "+cpu.getVelocidade());
}

public String amosar1(){

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
        
        return "Tipo raton:"+tipo+"\n,TipoPantalla:"+tipoPantalla+"\n,Pulgasdas:"+pulgadasPantalla+"\n,Velocidad :"+velocidadCpu+
                "\n,Memoria:"+memoriaCpu+",";

}

}