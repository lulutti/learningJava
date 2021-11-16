package dao.config;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.chainsaw.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CreateTable {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void createTable() {
        PropertyConfigurator.configure("log4j.properties");

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement createPacientes = connection.prepareStatement("CREATE TABLE IF NOT EXISTS pacientes (id INT NOT NULL AUTO_INCREMENT, nome VARCHAR NOT NULL, sobrenome VARCHAR NOT NULL, RG VARCHAR NOT NULL,dataCadastro VARCHAR NOT NULL,PRIMARY KEY (id));");
            PreparedStatement createEnderecos = connection.prepareStatement("CREATE TABLE IF NOT EXISTS enderecos (id INT NOT NULL AUTO_INCREMENT,rua VARCHAR NOT NULL, numero VARCHAR NOT NULL, cidade VARCHAR NOT NULL,estado VARCHAR NOT NULL,complemento VARCHAR NOT NULL,fk_paciente_endereco INT NOT NULL,PRIMARY KEY (id),CONSTRAINT fk_paciente_endereco FOREIGN KEY (fk_paciente_endereco)REFERENCES pacientes(id));");

            createPacientes.executeUpdate();
            createEnderecos.executeUpdate();


        } catch (Exception e) {
            logger.error("Erro ao criar tabela");
            e.printStackTrace();
        }


    }
}
