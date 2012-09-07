/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogit;

import br.com.unifeob.dao.ClienteDao;
import br.com.unifeob.modelo.Cliente;



/**
 *
 * @author osvaldo
 */
public class DesafioGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cliente cliente = new Cliente();
        cliente.setCodigo(12345l);
        cliente.setNome("Aluno UniFEOB");
        cliente.setEndereco("Av Octavio Bastos");
        
        ClienteDao dao = new ClienteDao();
        
        dao.salva(cliente);
        
        dao.altera(cliente);
        
        dao.remove(cliente);
        
    }
}
