import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean usarColisoes = true;  // Variável para controlar se deve usar colisões
        HashSemColisao tabelaHashSemColisao = new HashSemColisao(50);
        HashComColisao tabelaHashComColisao = new HashComColisao(50);

        while (true) {
            int opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Menu\n1-Alternar entre tabela com colisões/sem colisões\n2-Adicionar aluno\n3-Consultar matricula\n4-Deletar um elemento\n5-Imprimir a matriz\n6-Sair"));

            switch (opc) {
                case 1:
                    usarColisoes = !usarColisoes; // Alternar entre usar colisões e não usar colisões
                    System.out.println("Usando tabela com colisões: " + usarColisoes);
                    break;
                case 2:
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
                    Aluno aluno = new Aluno(matricula, nome);
                    if (usarColisoes) {
                        tabelaHashComColisao.insere(aluno);
                    } else {
                        tabelaHashSemColisao.insere(aluno);
                    }
                    break;
                case 3:
                    int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite matricula para buscar: "));
                    Aluno alunoBusca = new Aluno(busca);
                    if (usarColisoes) {
                        tabelaHashComColisao.busca(alunoBusca);
                    } else {
                        tabelaHashSemColisao.busca(alunoBusca);
                    }
                    break;
                case 4:
                    int deleta = Integer.parseInt(JOptionPane.showInputDialog("Digite matricula para deletar: "));
                    Aluno alunoDeleta = new Aluno(deleta);
                    if (usarColisoes) {
                        tabelaHashComColisao.deleta(alunoDeleta);
                    } else {
                        tabelaHashSemColisao.deleta(alunoDeleta);
                    }
                    break;
                case 5:
                    if (usarColisoes) {
                        tabelaHashComColisao.printHash();
                    } else {
                        tabelaHashSemColisao.printHash();
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}
