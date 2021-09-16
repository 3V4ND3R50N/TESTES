package Model;

public class Carro {
    // ATRIBUTOS, CARACTERISTICAS DO CARRO
    public String modelo;
    public String marca;
    public String cor;
    public String placa;
    // METODOS, AÇÕES QUE A CLASSE OU OBJETO FAZ
    public void ligar(){
        System.out.println("O CARRO LIGOU");
    }
    public String desligar(){
        String mensagem = "O CARRO DESLIGOU";
        return mensagem;

    }
}
