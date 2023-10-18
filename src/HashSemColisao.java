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
                System.out.println("Aluno já existe na tabela.");
                return;
            }
        }

        listaAlunos.add(aluno);
        System.out.println("Aluno inserido com sucesso!");
    }

    @Override
    public Aluno busca(int matricula) {
        int pos = funcaoHash(new Aluno(matricula, ""));
        int iteracao = 0;

        if (tabela[pos] != null) {
            LinkedList<Aluno> listaAlunos = tabela[pos];
            for (Aluno aluno : listaAlunos) {
                iteracao++;
                if (aluno.getMatricula() == matricula) {
                    return aluno;
                }
            }
        }
        return null;
    }



    @Override
    public boolean deleta(int matricula) {
        int pos = funcaoHash(new Aluno(matricula, "" ));
        if (tabela[pos] != null) {
            LinkedList<Aluno> listaAlunos = tabela[pos];
            for (Aluno aluno : listaAlunos) {
                if (aluno.getMatricula() == matricula) {
                    listaAlunos.remove(aluno);
                    return true;
                }
            }
        }
        return false;
    }



    public int getTamanho(){
        return quantidadeItens;
    }

    public void printHash() {
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
