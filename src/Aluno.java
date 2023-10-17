public class Aluno<T> {
    int matricula;
    String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public Aluno(int matricula) {
        this.matricula = matricula;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
