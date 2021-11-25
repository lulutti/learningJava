package academy.devdojo.maratonajava.javacore.Serialization.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -3354956196980353864L;
    private Long id;
    private String name;
    private transient String password;
    private Turma turma;

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
