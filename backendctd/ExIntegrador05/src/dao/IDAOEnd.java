package dao;

public interface IDAOEnd<T>{
    void setEnderecoByIdPaciente(Integer idPaciente ,String rua, String numero, String cidade, String estado, String complemento);
    void getEnderecoByIdPaciente(Integer idPaciente);
    void updateRuaByIdPaciente(Integer idPaciente, String rua);
    void updateNumeroByIdPaciente(Integer idPaciente, String rua);
    void updateCidadeByIdPaciente(Integer idPaciente, String rua);
    void updateEstadoByIdPaciente(Integer idPaciente, String rua);
}
