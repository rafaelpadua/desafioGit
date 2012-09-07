package br.com.unifeob.dao;

import br.com.unifeob.modelo.Cliente;

/**
 *
 * @author osvaldo
 */
public class ClienteDao {

    public ClienteDao() {
        System.out.println("Construtor");
    }

    
    public void salva(Cliente cliente){
        System.out.println("metodo salva");
        System.out.println("Salvando o cliente " + cliente.getNome());
    }
    
    public void remove(Cliente cliente){
        System.out.println("metodo remove");
        System.out.println("Removendo o cliente " + cliente.getCodigo());
    }
    
    public void altera(Cliente cliente){
        System.out.println("metodo altera");
        System.out.println("Alterando o cliente que mora no endereco " + cliente.getEndereco());
    }
    
    
    
    
}
