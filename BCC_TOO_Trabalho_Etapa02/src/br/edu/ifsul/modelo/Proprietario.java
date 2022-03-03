package br.edu.ifsul.modelo;

import java.io.Serializable;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Proprietario implements Serializable {
    private Integer codigo;
    private String nome;
    private String cpf;
    
    public Proprietario() {
        codigo = 0;
        nome = "Indefinido";
        cpf = "Indefinido";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
