package academy.devdojo.maratonajava.javacore.associacao.exercicio.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudante[] alunos;

    public void imprime(){
        System.out.println("--------Seminário--------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if(alunos == null) return;
        System.out.println("Alunos inscritos: ");
        for (Estudante aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Estudante[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Estudante[] alunos) {
        this.alunos = alunos;
    }
}
