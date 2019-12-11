/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author Willian Steiangel Barros
 */
public class Workflow {
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    private Menu menu = new Menu();
    
    TreeSet<Cliente> clientes = new TreeSet<Cliente>();
    
    /**
     * Method to #orginize system #workflow
     */
    public Workflow(){
        
        int op;
        String opcao= "";
        do {
            //Calling first menu
            op = menu.mainMenu(CONSOLE);
            switch (op){
                //Client management
                case 1:
                        manageClient();
                        break;
                //Product management
                case 2:
                        break;
                //Order management
                case 3:
                        break;
                default:
                        break;
            }
            if(op!=4)
                opcao = Input.validInput("\tDeseja Continuar?? (S/N): ", 
                                     new String[] {"S", "N"});
	} while(opcao.equals("S") && op != 4);
    }
    
    /**
     * @method for manage clients
     * @for Create, Remove, Alter, Search, List
     */
    private void manageClient(){
        int op = menu.cruslMenu(CONSOLE, "Cliente");
        switch (op){
            //Create
            case 1:
                createClient();
                break;
            //Remove
            case 2:
                if(!removeClient())
                    System.out.println("Opecacao Cancelada!");
                else
                    System.out.println("Operacao Finalizada!");
                break;
            //Alter
            case 3:
                if(!alterClient())
                    System.out.println("Opecacao Cancelada!");
                else
                    System.out.println("Operacao Finalizada!");
                break;
            //Search
            case 4:
                searchClient();
                break;
            //List
            case 5:
                listClient(false);
                break;
            default:
                break;
        }
    }
    
    /**
     * @method for create clients
     */
    private void createClient(){
        System.out.println("\n\t================================");
        String nome = Input.getInput("\tNome: ");
        
        String endereco = Input.getInput("\tEndereco: ");
        
        String telefone = Input.getInput("\tTelefone: ");
        
        System.out.print("\tLimite: ");
        double limite = CONSOLE.nextDouble();
        
        Cliente client = new Cliente(nome, endereco, telefone, limite);
        clientes.add(client);
        
        System.out.println("\tCliente Cadastrado com Sucesso!!\n");
        System.out.println("\t================================\n");
        
    }
    
    private boolean removeClient(){
        if(enouthClients()){
            System.out.println("### Remocao de Clientes ###");
            listClient(true);
            
            Cliente search = searchClientById();
            if(search==null){
                System.out.println("Erro! ID invalido");
                return false;
            }
            return removeClient(search);
        }
        return false;
    }
    
    private boolean removeClient(Cliente client){
        this.clientes.remove(client);
        return true;
    }
    
    private boolean alterClient(){
        if(enouthClients()){
            System.out.println("### Remocao de Cliente ###");
            listClient(true);

            Cliente search = searchClientById();
            if(search==null){
                System.out.println("Erro! ID invalido");
                return false;
            }
            return inputAlterClient(search);
        }
        return false;
    }
    
    public boolean inputAlterClient(Cliente cliente){
        String nome, endereco, telefone;
        double limite;
        
        
        nome = Input.getInput("Nome: ");
        
        endereco = Input.getInput("Endereco: ");
        
        telefone = Input.getInput("Telefone: ");
        
        System.out.print("Limite: ");
        limite = CONSOLE.nextDouble();
        
        if(!menu.confirma(CONSOLE))
            return false;
        
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setLimite(limite);
        
        return true;
    }
    
    private void searchClient(){
        int opcao;
        
        System.out.println("\n\n### Buscar por: ###");
        System.out.println("\n                  ================================");
        System.out.println("                  |     1 - Codigo    |");
        System.out.println("                  |     2 - Nome      |");
        System.out.println("                  ================================\n");
        
        do{
            System.out.print("Opcao: ");
            opcao = CONSOLE.nextInt();
            if(opcao>5 || opcao<1)
                System.out.println("Opcao Invalida! Digite novamente");
        }while(opcao>2 || opcao<1);
        
        Cliente search;
        
        if(opcao==1){
            search = searchClientById();
        }
        else{
            search = searchClientByName();
        }
        System.out.println(search);
    }
    
    private Cliente searchClientById(){
        System.out.println("Codigo: ");
        int cod = CONSOLE.nextInt();
        for(Cliente client:clientes){
            if(client.getCodigo()==cod){
                return client;
            }
        }
        return null;
    }
    
    private Cliente searchClientByName(){
        String search_name = Input.getInput("Name: ");
        for(Cliente client:clientes){
            if(client.getNome().toLowerCase().equals(search_name)){
                return client;
            }
        }
        return null;
    }
    
    private void listClient(boolean shorted){
        if(enouthClients()){
            System.out.println("\t======================");
            for(Cliente cliente:clientes){
                if(shorted)
                    System.out.println("\t\t"+cliente.shortToString());
                else
                    System.out.println(cliente);
            }
            System.out.println("\t======================");
        }
    }
    
    public boolean enouthClients(){
        if(clientes.isEmpty())
            System.out.println("Nao ha clientes cadastrados.");
        return !this.clientes.isEmpty();
    }
}
