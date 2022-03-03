package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Obra implements Serializable {
    private Integer codigo;
    private String nome;
    private String descricao;
    private Calendar dataEntrega;
    private Double orcamento;
    private Double custoTotal;
    private Empreiteira empreiteira;
    private List<Terreno> terrenos;
    
    // formatador para exibir a data corretamente
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Obra() {
        codigo = 0;
        nome = "Indefinido";
        descricao = "Indefinida";
        dataEntrega = Calendar.getInstance();
        orcamento = 0.0;
        custoTotal = 0.0;
        empreiteira = new Empreiteira();
        terrenos = new ArrayList<>();
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Calendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public Double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(Double custoTotal) {
        this.custoTotal = custoTotal;
    }

    public Empreiteira getEmpreiteira() {
        return empreiteira;
    }

    public void setEmpreiteira(Empreiteira empreiteira) {
        this.empreiteira = empreiteira;
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(List<Terreno> terrenos) {
        this.terrenos = terrenos;
    }
    
    public Double calcularMetragemTotal() {
        Double metragemTotal = 0.0;
        for(Terreno t : terrenos) {
        metragemTotal += t.getMetrosQuadrados();
    }
        return metragemTotal;
    }
    
    public void exibirDados() {
        System.out.println("-- DADOS DA OBRA --"+
                "\nCódigo: "+this.getCodigo()+
                "\nNome: "+this.getNome()+
                "\nDescrição: "+getDescricao()+
                "\nData de entrega: "+sdf.format(getDataEntrega().getTime())+
                "\nOrçamento: R$ "+getOrcamento()+
                "\nCusto total: R$ "+getCustoTotal()+
                "\n\n-- DADOS DA EMPREITEIRA --"+
                "\nCódigo: "+empreiteira.getCodigo()+
                "\nNome: "+empreiteira.getNome()+
                "\n\n-- DADOS DOS TERRENOS --");
        Integer cont = 0;
        for(Terreno t : terrenos) {
            cont++;
            System.out.println(cont+"º TERRENO"+
                    "\nCódigo: "+t.getCodigo()+
                    "\nMetros quadrados: "+t.getMetrosQuadrados()+"m²"+
                    "\nLargura: "+t.getLargura()+"m"+
                    "\nComprimento: "+t.getComprimento()+"m"+
                    "\nCódigo do proprietário: "+t.getProprietario().getCodigo()+
                    "\nNome do proprietário: "+t.getProprietario().getNome()+
                    "\nCPF do proprietário: "+t.getProprietario().getCpf()+"\n");
        }
    }
}
