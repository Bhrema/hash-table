public interface HashSemColisaoInterface {
    int funcaoHash(Aluno aluno);
    void insere(Aluno aluno);
    Aluno busca(int matricula);
    boolean deleta(int matricula);
}
