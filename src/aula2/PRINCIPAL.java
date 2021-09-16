package aula2;
import java.util.Scanner;
import Model.Carro;
import Model.Pessoa;
import Model.Bicicleta;
public class PRINCIPAL {

    public static void main(String[] args) {
       
       Pessoa evanderson = new Pessoa();
       evanderson.altura = (float) 1.75;
       evanderson.idade = 33;
       evanderson.nome = "EVANDERSON";
       evanderson.peso = 58;
       
       Bicicleta monark = new Bicicleta();
       monark.qntMarchas = 27;
       monark.marchaAtual = 1;
       monark.aro = 28;
       monark.cor = "azul";
       
       //Declarando uma variavel (objeto) do tipo Scanner
       Scanner entrada = new Scanner (System.in);
       System.out.print("INFORME O CÓDIGO DO ITEM: ");
       int cod = entrada.nextInt();
       System.out.print("INFORME O VALOR DO ITEM: ");
       float valor = entrada.nextFloat();
       System.out.print("INFORME A QUANTIDADE DE ITENS: ");
       int quantidade = entrada.nextInt();
       
       float valorTotal = valor * quantidade;
       
       System.out.println("O VALOR TOTAL DO PEDIDO CÓD: " + cod + " = " + valorTotal);
       

         //System.out.println("A MARCHA ATUAL É: " + monark.marchaAtual);
         //System.out.print("INFORME QUANTAS MARCHAS DESEJA PASSAR: ");
       //UTILIZANDO A VARIAVEL "entrada", DA CLASSE Scanner, PARA OBTER A
       //INFORMAÇÃO DIGITADA PELO USUARIO. "entrada.nextInt()" IRÁ LER UM
       //VALOR INTEIRO INFORMADO NO CONSOLE.
       //int dado = entrada.nextInt();
       //System.out.println("O VALOR INFORMADO FOI: " + dado);

         //monark.passarMarcha(monark);
         //System.out.println("PASSANDO MARCHA!");
         //System.out.println(monark.toString());

       /*System.out.println("\nVOLTANDO MARCHA!");
       monark.voltarMarcha(monark);
       System.out.println(monark.toString());*/

    }
}