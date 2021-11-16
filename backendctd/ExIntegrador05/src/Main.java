import dao.config.CreateTable;
import dao.impl.DAOEndereco;
import dao.impl.DAOPaciente;

public class Main {
    public static void main(String[] args) {
        CreateTable.createTable();
        DAOPaciente paciente = new DAOPaciente();
        DAOEndereco endereco = new DAOEndereco();

        paciente.insert("Luiza","Dragonetti", "5555555","01/11/2021");
        endereco.setEnderecoByIdPaciente(1,"Comendador Alfaia","590","Santos","SP","apto 80");

        paciente.insert("Kaio","Abreu", "45454545","08/10/2021");
        endereco.setEnderecoByIdPaciente(2,"Viveiros de Castro","20","Santos","SP","N/A");

        paciente.getById(1);
        paciente.getById(2);

        paciente.selectAll();
    }
}
