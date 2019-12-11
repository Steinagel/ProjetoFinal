/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Willian Steinagel Barros
 */
public class Cliente implements Comparable<Cliente>{
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private int status;
    private double limite;
    private ArrayList<Pedido> pedidos;

    static int i = 0;

    public Cliente(String nome,
                   String endereco,
                   String telefone,
                   double limite) {
        this.codigo = i++;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.status = 1;
        this.limite = limite;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Pedido> getPedido() {
        return pedidos;
    }

    public void setPedido(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void removeCliente(){
        this.setStatus(2);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public int compareTo(Cliente c){
        if(c.getCodigo()<this.codigo)
            return 1;
        else if(c.getCodigo()>this.codigo)
            return -1;
        return 0;
    }
    
    @Override
    public String toString() {
        String st;
        if(this.status==1)
            st = "Aberto";
        else
            st = "Pendente";
        return "\t[" + this.codigo + "] - " +
               " " + this.nome +
               ": \n\tEndereco: " + this.endereco +
               "; Telefone: " + this.telefone +
               "; Status: " + st +
               "; Limite: R$" + this.limite +
               ".";
    }
    
    public String shortToString() {
        return "["+codigo+"] - " +
               "Cliente " + nome +
               ".";
    }
    
    public void aterarCliente(String nome, 
                              String endereco,
                              String telefone,
                              double limite) {
        if(nome!=null)
            this.setNome(nome);
        if(endereco!=null)
            this.setEndereco(endereco);
        if(telefone!=null)
            this.setTelefone(telefone);
        if(limite!=-1)
            this.setLimite(limite);
    }
}
