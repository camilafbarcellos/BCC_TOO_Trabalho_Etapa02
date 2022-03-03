package br.edu.ifsul.teste;

import br.edu.ifsul.modelo.Empreiteira;
import br.edu.ifsul.modelo.Obra;
import br.edu.ifsul.modelo.Proprietario;
import br.edu.ifsul.modelo.Terreno;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class TestaObra {

    public static void main(String[] args) {
        // instância da obra
        Obra obra = new Obra();
        // setando atributos da obra
        try {
            obra.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("-- CRIAÇÃO DE OBRA --\n\nInsira o código da obra")));
            obra.setNome(JOptionPane.showInputDialog("Insira o nome da obra"));
            obra.setDescricao(JOptionPane.showInputDialog("Insira a descrição da obra"));
            // uso de string auxiliar para data
            String dataEntrada = JOptionPane.showInputDialog("Insira a data de entrega da obra (dd/mm/aaaa)");
            // definindo formatador de data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            // instância de data em calendar
            Calendar data = Calendar.getInstance();
            // formatando e atribuindo data
            data.setTime(sdf.parse(dataEntrada));
            // setando data obtida na obra
            obra.setDataEntrega(data);
            obra.setOrcamento(Double.parseDouble(JOptionPane.showInputDialog("Insira o orçamento (R$)")));
            obra.setCustoTotal(Double.parseDouble(JOptionPane.showInputDialog("Insira o custo total (R$)")));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }
        
        //instância da empreiteira
        Empreiteira empreiteira = new Empreiteira();
        // setando atributos da empreiteira
        try {
            empreiteira.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("-- ADIÇÃO DE EMPREITEIRA DA OBRA --\n\nInsira o código da empreiteira")));
            empreiteira.setNome(JOptionPane.showInputDialog("Insira o nome da empreiteira"));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }
        // setando empreiteira da obra
        obra.setEmpreiteira(empreiteira);
        
        // instância da lista de terrenos
        List<Terreno> terrenos  = new ArrayList<>();
        // setando 3 terrenos por laço for
        for(int i=0; i<3; i++) {
            try {
                // instância do terreno
                Terreno terreno = new Terreno();
                terreno.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("-- ADIÇÃO DO "+(i+1)+"º TERRENO --\n\nInsira o código do terreno")));
                terreno.setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de metros quadrados (m²)")));
                terreno.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura (m)")));
                terreno.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento (m)")));
                // instância do proprietário
                Proprietario proprietario = new Proprietario();
                // setando atributos do proprietário
                proprietario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do proprietário do terreno")));
                proprietario.setNome(JOptionPane.showInputDialog("Insira o nome do proprietário do terreno"));
                proprietario.setCpf(JOptionPane.showInputDialog("Insira o CPF do proprietário do terreno"));
                // setando proprietário do terreno
                terreno.setProprietario(proprietario);
                // adicionando terreno na lista
                terrenos.add(terreno);
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
                return;
            }
        }
        // setando terrenos na obra
        obra.setTerrenos(terrenos);
        
        // exibindo dados pelo método exibirDados()
        obra.exibirDados();
        // calculando e exibindo metragem total pelo método calcularMetragemTotal()
        System.out.println("\n-- METRAGEM TOTAL DOS TERRENOS DA OBRA --"+
                "\n"+obra.calcularMetragemTotal()+"m²");
    }
    
}
