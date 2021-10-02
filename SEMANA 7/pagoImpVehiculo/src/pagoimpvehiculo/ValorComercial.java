/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoimpvehiculo;

/**
 *
 * @author DELL
 */
public class ValorComercial {
    
   String marca = "";
   String linea = "";
   int modelo = 0;
   
    public  ValorComercial(String marca,String linea,int modelo){
        this.marca=marca;
        this.linea=linea;
        this.modelo=modelo;  
       
    }
    public void caracte(){
        System.out.println("Marca del vehiculo " + marca);
        System.out.println("Linea del vehiculo " + linea);
        System.out.println("modelo del vehiculo " + modelo);
    
    }
}
