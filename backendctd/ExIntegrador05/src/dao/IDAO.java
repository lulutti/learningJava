package dao;

public interface IDAO<T> {
    void insert(String nome, String sobrenome, String RG, String dataCadastro);
    void selectAll();
    void getById(int id);
    void deleteById(int id);
    void updateNameById(int id, String nome);
    void updateSobrenomeById(int id, String sobrenome);
    void updateRgById(int id, String RG);
    void updateDataCadastroById(int id, String dataCadastro);
}
