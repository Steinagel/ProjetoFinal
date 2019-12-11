/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Willian Steinagel Barros
 */

public class Produto{
    private int codigo;
    private String nome;
    private Categoria categoria;
    private double preco;
    private String moeda;
    private double imposto;
    static int i = 0;
    private ProdutoExportacao destino;
    

    public Produto(String nome, Categoria categoria, double preco, String moeda, double imposto) {
        this.codigo = i++;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.moeda = moeda;
        this.imposto = imposto;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public void RemoveProduto(){
        this.setCategoria(null);
        this.setPreco(0);
        this.setNome(null);
        this.setImposto(0);
        this.setMoeda(null);        
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", moeda=" + moeda + ", imposto=" + imposto + '}';
    }

    
    
}
