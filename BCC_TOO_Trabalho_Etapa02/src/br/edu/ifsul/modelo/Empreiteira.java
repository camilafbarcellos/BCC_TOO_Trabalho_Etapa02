package br.edu.ifsul.modelo;

import java.io.Serializable;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Empreiteira implements Serializable {
    private Integer codigo;
    private String nome;
    
    public Empreiteira() {
        codigo = 0;
        nome = "Indefinido";
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
}
