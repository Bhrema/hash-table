public interface HashSemColisaoInterface {
    int funcaoHash(Aluno aluno);
    void insere(Aluno aluno);
    void busca(Aluno aluno);
    boolean deleta(int matricula);
}
