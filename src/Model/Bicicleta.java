package Model;
import java.util.Scanner;
public class Bicicleta {
    public String marca;
    public int aro;
    public int qntMarchas ;
    public int marchaAtual;
    public String cor;    
    
    Scanner entrada = new Scanner (System.in);
    
    public void passarMarcha(Bicicleta monark){
        /*if (monark.marchaAtual < qntMarchas){
            monark.marchaAtual += 1;
        }*/
        int dado = entrada.nextInt();
        if (dado > qntMarchas){
            dado = qntMarchas - 1;
            System.out.println("A QUANTIDADE MÁXIMA DE MARCHAS É " + qntMarchas);
        }
        //System.out.println("O VALOR INFORMADO FOI: " + dado);
        monark.marchaAtual += dado;
    }
    public void voltarMarcha(Bicicleta monark){
        if (monark.marchaAtual > 1){
            monark.marchaAtual -= 1;
        }
    }
    
    @Override
    public String toString() {
        return "MARCHA ATUAL:" + marchaAtual;
    }
}
