package br.com.unifeob.modelo;

public class Cliente {

    private Long codigo;
    private String nome;
    private String endereco;

    
    public Cliente() {
        System.out.println("Metodo construtor Cliente");
    }

    public Long getCodigo() {
        return codigo;
    }

    // o erro esta aqui - falta ;
    public void setCodigo(Long codigo) {
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
    

    
}
