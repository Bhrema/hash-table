import java.util.LinkedList;

public class HashComColisao extends HashSemColisao {

    public HashComColisao(int maxPosicoes) {
        super(maxPosicoes);
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
        int matriculaOriginal = aluno.getMatricula();
        int novaMatricula = matriculaOriginal;

        int pos = funcaoHash(aluno);

        if (tabela[pos] == null) {
            tabela[pos] = new LinkedList<>();
        }

    LinkedList<Aluno> listaAlunos = tabela[pos];

    for (Aluno c : listaAlunos) {
        if (c.getMatricula() == matriculaOriginal && !c.equals(aluno)) {
            // Se a matrícula for igual, mas os alunos são diferentes, gere uma nova matrícula
            novaMatricula = gerarNovaMatricula(matriculaOriginal);
            aluno.setMatricula(novaMatricula);
            pos = funcaoHash(aluno);
            if (tabela[pos] == null) {
                tabela[pos] = new LinkedList<>();
            }
            listaAlunos = tabela[pos]; // Atualize a lista com base na nova matrícula
            break;
        }
    }

    listaAlunos.add(aluno);
    quantidadeItens++;
    System.out.println("Aluno inserido com sucesso!");
    }

    @Override
    public void deleta(Aluno aluno) {
    int matriculaOriginal = aluno.getMatricula();
    int pos = funcaoHash(aluno);

    if (tabela[pos] != null) {
        LinkedList<Aluno> listaAlunos = tabela[pos];

        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno c = listaAlunos.get(i);
            if (c.getMatricula() == matriculaOriginal) {
                listaAlunos.remove(i);
                quantidadeItens--;
                System.out.println("Aluno deletado com sucesso!");

                // Verifica se a lista de alunos está vazia e a define como null se estiver
                if (listaAlunos.isEmpty()) {
                    tabela[pos] = null;
                }
                
                return;
            }
        }

        System.out.println("Aluno não encontrado para exclusão.");
    } else {
        System.out.println("Aluno não encontrado para exclusão.");
    }
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