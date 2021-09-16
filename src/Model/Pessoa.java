package Model;

public class Pessoa {
    public String nome;
    public int idade;
    public float peso;
    public float altura;
    
    public void Envelhecer(Pessoa evanderson){
        if (evanderson.idade > 21){
            evanderson.altura += 0.5;
        }
        evanderson.idade += 1;
    }
    public void Engordar(){
        
    }
    public void Emagrecer(){
        
    }
    public void Crescer(){
        
    }
    
    public void andar(){
        System.out.println("ANDANDO");
    }
    public void correr(){
        System.out.println("CORRENDO");
    }
    public void parar(){
        System.out.println("PARADO");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + '}';
    }
}