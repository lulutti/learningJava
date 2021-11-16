package dao.impl;

import dao.IDAOEnd;
import dao.config.ConnectionDB;
import model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOEndereco implements IDAOEnd<Endereco> {
    
    @Override
    public void setEnderecoByIdPaciente(Integer idPaciente , String rua, String numero, String cidade, String estado, String complemento){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement insert = connection.prepareStatement("INSERT INTO enderecos (rua, numero, cidade, estado, complemento, fk_paciente_endereco) VALUES (?, ?, ?, ?, ?, ?)");

            insert.setString(1, rua);
            insert.setString(2, numero);
            insert.setString(3, cidade);
            insert.setString(4, estado);
            insert.setString(5, complemento);
            insert.setInt(6, idPaciente);

            Integer rowsAffect = insert.executeUpdate();
            System.out.println("Endereço adicionado" + " | Paciente ID: " + idPaciente + " | Rua: " + rua + " | Numero: " + numero + " | Cidade: " + cidade + " | Estado: " + estado + " | Complemento: " + complemento + " | Linhas afetadas: " + rowsAffect);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void getEnderecoByIdPaciente(Integer idPaciente){

        Endereco endereco;
        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement getById = connection.prepareStatement("SELECT * FROM enderecos WHERE fk_paciente_endereco = ?");

            getById.setInt(1, idPaciente);
            ResultSet resultSet = getById.executeQuery();
            if (resultSet.next()){
                endereco = new Endereco(resultSet.getInt("id_endereco"),resultSet.getString("rua"), resultSet.getString("numero"), resultSet.getString("cidade"), resultSet.getString("estado"), resultSet.getString("complemento"));
                System.out.println("Endereço" + " | Rua: " + endereco.getRua() + " | Número: " + endereco.getNumero() + " | Cidade: " + endereco.getCidade() + " | Estado: " + endereco.getEstado() + " |" + " | Complemento: " + endereco.getComplemento() + " |");
            } else {
                System.out.println("Endereço não existe");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateRuaByIdPaciente(Integer idPaciente, String rua){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE enderecos SET rua=? WHERE fk_paciente_endereco=? ");

            update.setString(1, rua);
            update.setInt(2, idPaciente);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Rua atualizada" + " | ID Paciente: " + idPaciente + " | Rua: " + rua + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateNumeroByIdPaciente(Integer idPaciente, String rua){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE enderecos SET numero=? WHERE fk_paciente_endereco=? ");

            update.setString(1, rua);
            update.setInt(2, idPaciente);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Numero atualizado" + " | ID Paciente: " + idPaciente + " | Numero: " + rua + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateCidadeByIdPaciente(Integer idPaciente, String rua){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE enderecos SET cidade=? WHERE fk_paciente_endereco=? ");

            update.setString(1, rua);
            update.setInt(2, idPaciente);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Cidade atualizada" + " | ID Paciente: " + idPaciente + " | Cidade: " + rua + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEstadoByIdPaciente(Integer idPaciente, String rua){

        try {
            Connection connection = ConnectionDB.getConnection();
            PreparedStatement update = connection.prepareStatement("UPDATE enderecos SET estado=? WHERE fk_paciente_endereco=? ");

            update.setString(1, rua);
            update.setInt(2, idPaciente);

            Integer rowsAffect = update.executeUpdate();
            if (rowsAffect.equals(0)){
                System.out.println("Paciente não Existe");
            }else {
                System.out.println("Estado atualizado" + " | ID Paciente: " + idPaciente + " | Cidade: " + rua + " | Linhas Afetadas: " + rowsAffect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
