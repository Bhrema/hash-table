import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        HashSemColisao tabelaHash = new HashSemColisao(50);
        while (true) {
            int opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Menu\n1-Adicionar aluno\n2-Consultar matricula\n3-delete um elemento\n4-Imprima a matriz"));
            switch (opc) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
                    Aluno aluno = new Aluno(matricula, nome);
                    tabelaHash.insere(aluno);
                    break;
                case 2:
                    int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite matricula para buscar: "));
                    //TODO realiza a busca
                    break;
                case 3:
                    int deleta = Integer.parseInt(JOptionPane.showInputDialog("Digite matricula para deletar: "));
                    break;
                case 4:
                    tabelaHash.printHash();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }


    }
}