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
public class cpu {
    
    private int velocidade;
    private int memoria;

public cpu(){

}    
public cpu(int velocidade,int memoria){
    this.velocidade= velocidade;
    this.memoria = memoria;
}
public int getVelocidade(){
    return this.velocidade;
}
public void setVelocidade(int velocidade){
    this.velocidade = velocidade;
}
public int getMemoria(){
    return memoria;
}
public void setMemoria(int memoria){
    this.memoria = memoria;
}

}
