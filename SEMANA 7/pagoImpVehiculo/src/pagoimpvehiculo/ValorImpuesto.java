/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoimpvehiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ValorImpuesto {
    double prontPag ;
    double serviPubli;
    double traslado;
    int valorCome;
    double pronto;
    double servici;
    double trasla;
    double valorImpi=1000000;
    double impues;
    
    public ValorImpuesto(double prontPag,double serviPubli,double traslado,int valorCome) {
       this.prontPag=prontPag;
       this.serviPubli=serviPubli;
       this.traslado=traslado;
       this.valorCome = valorCome;
       
    }
    public  void impuesto() {
        pronto =  prontPag* valorCome;
        servici=serviPubli * valorCome;
        trasla= traslado * valorCome;
        impues=valorImpi-(pronto+servici+trasla);
       
        System.out.println("valor de impuesto a pagar  " + impues);
        System.out.println("Descuento por pronto pago " +pronto);
        System.out.println("Descuento por servicio publico " +servici);
        System.out.println("Descuento por traslado de cuenta  " +trasla);
    }
    
    
    
}
