package academy.devdojo.maratonajava.javacore.Serialization.test;

import academy.devdojo.maratonajava.javacore.Serialization.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Luiza","123456");
/*        serialize(aluno);*/
        deserialize();

    }

    private static void serialize(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
