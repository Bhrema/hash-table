import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Hashtable<Double, ArrayList<String>> dados = new Hashtable<Double, ArrayList<String>>();
    public static void main(String[] args) {
        while (true) {
            int opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Menu\n1-Adicionar aluno\n2-Consultar matricula\n3-Sair"));
            switch (opc) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    String matricula = JOptionPane.showInputDialog("Digite seu RG: ");
                    //TODO adiciona à estrutura
                    break;
                case 2:
                    Double chave = Double.parseDouble(JOptionPane.showInputDialog("Digite matricula para buscar: "));
                    //TODO realiza a busca
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }


    }
}