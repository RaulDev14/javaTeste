package entities;

public class Cliente {

    private Integer idCliente;
    private String nomeCliente;
    private String nomeAnimal;
    private String especie;
    private String raca;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nomeCliente, String nomeAnimal, String especie,  String raca) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.raca = raca;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}