import java.util.LinkedList;

public class HashComColisao extends HashSemColisao {

    public HashComColisao(int maxPosicoes) {
        super(maxPosicoes);
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
                if (!c.equals(aluno)) {
                    // Se a matrícula for igual, mas os alunos são diferentes, gere uma nova matrícula
                    int novaMatricula = gerarNovaMatricula(aluno.getMatricula());
                    aluno.setMatricula(novaMatricula);
                }
            }
        }

        listaAlunos.add(aluno);
        quantidadeItens++;
        System.out.println("Aluno inserido com sucesso!");
    }

    private int gerarNovaMatricula(int matriculaExistente) {
        // Gere uma nova matrícula com base na matrícula existente (pode ser uma lógica simples)
        return matriculaExistente + 1;
    }
}
