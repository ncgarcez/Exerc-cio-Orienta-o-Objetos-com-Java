package Exercicio;

public class Carro {

    private String marca;

    private String modelo;

    private Integer ano;

    private String variante;

    private Integer capacidade;

    private Integer pessoas;

//construtores
    public Carro(String marca, String modelo, Integer ano, String variante, Integer capacidade, Integer pessoas){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.variante=variante;
        this.capacidade=capacidade;
        this.pessoas=pessoas;

    }

    //métodos get
    public String getMarca() {return marca;}

    public String getModelo() {return modelo;}

    public String getVariante() {return variante;}

    public Integer getAno() {return ano;}

    public Integer getCapacidade() {return capacidade;}

    public Integer getPessoas() {return pessoas;}

    //métodos set
    public void setMarca(String marca){this.marca=marca;}

    public void setModelo(String modelo){this.modelo=modelo;}

    public void setAno(Integer ano){this.ano=ano;}

    public void setVariante(String variante){this.variante=variante;}

    public void setCapacidade(Integer capacidade){this.capacidade=capacidade;}

    public void setPessoas(Integer pessoas){this.pessoas=pessoas;}

}
