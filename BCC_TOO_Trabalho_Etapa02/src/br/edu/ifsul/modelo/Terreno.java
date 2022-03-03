package br.edu.ifsul.modelo;

import java.io.Serializable;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Terreno implements Serializable {
    private Integer codigo;
    private Double metrosQuadrados;
    private Double largura;
    private Double comprimento;
    private Proprietario proprietario;
    
    public Terreno() {
        codigo = 0;
        metrosQuadrados = 0.0;
        largura = 0.0;
        comprimento = 0.0;
        proprietario = new Proprietario();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(Double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
