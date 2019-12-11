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
public class Categoria {
    private String Categoria;
    private int id;
    static int i = 0;

    public Categoria(String Categoria) {
        this.Categoria = Categoria;
        this.id = i++;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
