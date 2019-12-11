/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Willian Steinagel Barros
 */
public class Pedido {
    private long numero;
    private Date data;
    private ArrayList<ItemPedido> itens = new ArrayList();
    private Cliente cliente;
    
    static int i = 0;

    public Pedido(Cliente cliente) {
        this.numero = i++;
        this.cliente = cliente;
        
       java.util.Date d = new Date();
       this.data = d;
    }
    
    
     
    public double totalPedido(Pedido p){
        
        double total = 0;
        
        for(ItemPedido ip: itens)
        {
            //total = ip.getQuantidade()*ip.getProduto().getPreco())
        }
            
        return 0;   
    }
    
    
    public double totalImpostos(){
        
        return 0;
    }
}
