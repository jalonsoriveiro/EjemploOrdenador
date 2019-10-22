/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 *
 * @author jalonsoriveiro
 */
public class ordenador {
    
  rato rato = new rato();
  pantalla pantalla = new pantalla();
  cpu cpu = new cpu();
    

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


}