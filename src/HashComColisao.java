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
        int novaMatricula = matriculaExistente;
        int tentativas = 1;
    
        // Enquanto a nova matrícula já existir na tabela, continue gerando uma nova
        while (matriculaJaExiste(novaMatricula)) {
            novaMatricula = matriculaExistente + tentativas;
            tentativas++;
        }
    
        return novaMatricula;
    }
    
    private boolean matriculaJaExiste(int matricula) {
        for (LinkedList<Aluno> listaAlunos : tabela) {
            if (listaAlunos != null) {
                for (Aluno aluno : listaAlunos) {
                    if (aluno.getMatricula() == matricula) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}