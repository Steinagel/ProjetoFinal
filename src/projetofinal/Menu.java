/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Scanner;
/**
 *
 * @author Willian Steinagel Barros
 */
public class Menu {
    public int mainMenu(Scanner CONSOLE){
        int opcao;
        
        System.out.println("\n\n### Geral ###");
        System.out.println("\n                  =========================");
        System.out.println("                  |     1 - Gerenciar Cliente  |");
        System.out.println("                  |     2 - Gerenciar Produto  |");
        System.out.println("                  |     3 - Gerenciar Pedidos  |");
        System.out.println("                  |     4 - Sair               |");
        System.out.println("                  =========================\n");
        
        do{
            System.out.print("Opcao: ");
            opcao = CONSOLE.nextInt();
            if(opcao>4 || opcao<1)
                System.out.println("Opcao Invalida! Digite novamente");
        }while(opcao>4 || opcao<1);
        
        return opcao;
    }
    
    public int cruslMenu(Scanner CONSOLE, String obj_name){
        int opcao;
        
        System.out.println("\n\n### "+obj_name+" ###");
        System.out.println("\n                  ================================");
        System.out.println("                  |     1 - Criar "+obj_name+"     |");
        System.out.println("                  |     2 - Remover "+obj_name+"   |");
        System.out.println("                  |     3 - Alterar "+obj_name+"   |");
        System.out.println("                  |     4 - Pesquisar "+obj_name+" |");
        System.out.println("                  |     5 - Listar "+obj_name+"    |");
        System.out.println("                  |     6 - Cancelar               |");
        System.out.println("                  ================================\n");
        
        do{
            System.out.print("Opcao: ");
            opcao = CONSOLE.nextInt();
            if(opcao>6 || opcao<1)
                System.out.println("Opcao Invalida! Digite novamente");
        }while(opcao>6 || opcao<1);
        
        return opcao;
    }
    
    public boolean confirma(Scanner CONSOLE){
        String confirmation = Input.validInput("\nConfirmar? (S/N): ", 
                                               new String[] {"S", "N"}).toUpperCase();
            
        return (confirmation.equals("S"));
    }
}
