package dao.impl;

import dao.IDAO;
import dao.config.ConnectionDB;
import model.Endereco;
import model.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOPaciente implements IDAO<Paciente> {
    @Override
    public void insert(String nome, String sobrenome, String RG, String dataCadastro){

        Paciente paciente = null;
        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement insert = connection.prepareStatement("INSERT INTO pacientes (nome, sobrenome, RG, dataCadastro) VALUES (?, ?, ?, ?)");

            insert.setString(1, nome);
            insert.setString(2, sobrenome);
            insert.setString(3, RG);
            insert.setString(4, dataCadastro);

            Integer rowsAffect = insert.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Erro ao adicionar paciente");
            } else {
                System.out.println("Paciente adicionado" + " | Nome: " + nome + " | Sobrenome: " + sobrenome + " | RG: " + RG + " | Data de Cadastro: " + dataCadastro + " | Linhas afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll(){

        Paciente paciente;
        Endereco endereco;
        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement selectAll = connection.prepareStatement("SELECT * FROM pacientes INNER JOIN enderecos ON pacientes.id = enderecos.fk_paciente_endereco");

            ResultSet resultSet = selectAll.executeQuery();
            while (resultSet.next()){
                paciente = new Paciente(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("sobrenome"), resultSet.getString("RG"), resultSet.getString("dataCadastro"));
                endereco = new Endereco(resultSet.getInt("id"),resultSet.getString("rua"), resultSet.getString("numero"), resultSet.getString("cidade"), resultSet.getString("estado"),resultSet.getString("complemento"));
                System.out.println("Paciente" + " | Nome: " + paciente.getNome() + " | Sobrenome: " + paciente.getSobrenome() + " | RG: " + paciente.getRG() + " | Data de Cadastro: " + paciente.getDataCadastro() + " |");
                System.out.println("Endereço" + " | Rua: " + endereco.getRua() + " | Número: " + endereco.getNumero() + " | Cidade: " + endereco.getCidade() + " | Estado: " + endereco.getEstado() + " |\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getById(int id){

        Paciente paciente;
        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement getById = connection.prepareStatement("SELECT * FROM pacientes WHERE id = ?");

            getById.setInt(1, id);
            ResultSet resultSet = getById.executeQuery();
            if (resultSet.next()){
                paciente = new Paciente(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("sobrenome"), resultSet.getString("RG"), resultSet.getString("dataCadastro"));
                System.out.println("Paciente" + " | Nome: " + paciente.getNome() + " | Sobrenome: " + paciente.getSobrenome() + " | RG: " + paciente.getRG() + " | Data de Cadastro: " + paciente.getDataCadastro()+ " |");
            } else {
                System.out.println("Paciente não existe");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement delete = connection.prepareStatement(" DELETE FROM enderecos WHERE fk_paciente_endereco = ?; DELETE FROM pacientes WHERE id = ?;");

            delete.setInt(1, id);
            delete.setInt(2, id);

            Integer rowsAffect = delete.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não existe");
            }else {
                System.out.println("Paciente deletado" + " | ID: " + id + " | Linhas afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNameById(int id, String nome){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE pacientes SET nome=? WHERE id=? ");

            update.setString(1, nome);
            update.setInt(2, id);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Nome paciente atualizado" + " | ID: " + id + " | Nome: " + nome + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateSobrenomeById(int id, String sobrenome){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE pacientes SET sobrenome=? WHERE id=? ");

            update.setString(1, sobrenome);
            update.setInt(2, id);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Sobrenome paciente atualizado" + " | ID: " + id + " | Sobrenome: " + sobrenome + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateRgById(int id, String rg){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE pacientes SET rg=? WHERE id=? ");

            update.setString(1, rg);
            update.setInt(2, id);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("RG paciente atualizado" + " | ID: " + id + " | RG: " + rg + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateDataCadastroById(int id, String dataCadastro){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE pacientes SET dataCadastro=? WHERE id =? ");

            update.setString(1, dataCadastro);
            update.setInt(2, id);


            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Data de cadastro paciente atualizada" + "ID: " + id + " Data de cadastro: " + dataCadastro + " Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
