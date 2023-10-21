import java.util.LinkedList;

public class HashComColisao implements HashComColisaoInterface {
    public int maxItens, maxPosicoes, quantidadeItens;
    public LinkedList<Aluno>[] tabela;

    public HashComColisao(int maxPosicoes) {
        this.maxPosicoes = maxPosicoes;
        this.tabela = new LinkedList[maxPosicoes];
        this.quantidadeItens = 0;
    }

    @Override
    public int funcaoHash(Aluno aluno) {
        int hash = aluno.getMatricula() % maxPosicoes;

        while (tabela[hash] != null) {
            hash = (hash + 1) % maxPosicoes;
        }

        return hash;
    }

    @Override
    public void busca(Aluno aluno) {
        int pos = funcaoHash(aluno);

        LinkedList<Aluno> listaAlunos = tabela[pos];

        if (listaAlunos != null) {
            for (Aluno c : listaAlunos) {
                if (c.getMatricula() == aluno.getMatricula()) {
                    System.out.println("Aluno encontrado: " + c.getNome());
                    return;
                }
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    @Override
    public void insere(Aluno aluno) {
        int pos = funcaoHash(aluno);

        if (tabela[pos] == null) {
            tabela[pos] = new LinkedList<>();
        }

        LinkedList<Aluno> listaAlunos = tabela[pos];

        for (Aluno c : listaAlunos) {
            if (c.getMatricula() == aluno.getMatricula()) {
                System.out.println("Matrícula já existe: " + c.getNome());
                return;
            }
        }

        listaAlunos.add(aluno);
        quantidadeItens++;
        System.out.println("Aluno inserido com sucesso!");
    }

    @Override
    public void deleta(Aluno aluno) {
        int pos = funcaoHash(aluno);

        if (tabela[pos] != null) {
            LinkedList<Aluno> listaAlunos = tabela[pos];

            for (int i = 0; i < listaAlunos.size(); i++) {
                Aluno c = listaAlunos.get(i);
                if (c.getMatricula() == aluno.getMatricula()) {
                    listaAlunos.remove(i);
                    quantidadeItens--;

                    if (listaAlunos.isEmpty()) {
                        tabela[pos] = null;
                    }

                    System.out.println("Aluno deletado com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Aluno não encontrado para exclusão.");
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
