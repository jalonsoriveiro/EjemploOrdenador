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
public class pantalla {
    private String marca;
    private float pulgadas;
    
    
public pantalla(){


}
public pantalla(String marca,float pulgadas){

    this.marca = marca;
    this.pulgadas = pulgadas;
    
}

public String getMarca(){

    return this.marca;

    
}
public void setMarca(String marca){

    this.marca = marca;
}
public Float getPulgadas(){
    return this.pulgadas;

}
public void setPulgadas(float pulgadas){

    this.pulgadas = pulgadas;
}
}
