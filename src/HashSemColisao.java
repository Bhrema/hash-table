import java.io.IOException;
import java.util.LinkedList;

public class HashSemColisao implements HashSemColisaoInterface {
    public int maxItens, maxPosicoes, quantidadeItens;
    public LinkedList<Aluno>[] tabela;

    public HashSemColisao(int maxPosicoes) {
        this.maxPosicoes = maxPosicoes;
        this.tabela = new LinkedList[maxPosicoes];
        this.quantidadeItens = 0;
    }

    @Override
    public int funcaoHash(Aluno aluno) {
        return aluno.getMatricula() % maxPosicoes;
    }

    @Override
    public void insere(Aluno aluno) {
        int idCliente = aluno.getMatricula();
        int pos = funcaoHash(aluno);

        if (tabela[pos] == null) {
            tabela[pos] = new LinkedList<>();
        }

        LinkedList<Aluno> listaAlunos = tabela[pos];

        for (Aluno c : listaAlunos) {
            if (c.getMatricula() == idCliente) {
                System.out.println("Cliente já existe na tabela.");
                return;
            }
        }

        listaAlunos.add(aluno);
        System.out.println("Cliente inserido com sucesso!");
    }

    @Override
    public void busca(Aluno aluno) {

    }

    @Override
    public void deleta(Aluno aluno) {
        int local = funcaoHash(aluno);
    }

    public int getTamanho(){
        return quantidadeItens;
    }

    public void printHash() throws IOException {
        try{
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        }
        for (int i = 0; i < maxPosicoes; i++) {
            LinkedList<Aluno> listaAlunos = tabela[i];
            if (listaAlunos != null) {
                System.out.println("Posição " + i + ":");
                for (Aluno aluno : listaAlunos) {
                    System.out.println(aluno.getMatricula() + " - " + aluno.getNome());
                }
            }
        }
    }
}
