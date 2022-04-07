package Aulas.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer01 {

    public void adivinha() {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int randomicoGerado = random.nextInt(11);
        boolean acertou = true;
        int cont = 0;

        while(acertou){
            System.out.println("Entre com um valor: ");
            int valorEscolhido = entrada.nextInt();
           if (randomicoGerado == valorEscolhido){
               System.out.println("Acertou ");
               acertou = false;
           }else if(randomicoGerado < valorEscolhido){
               System.out.println("Valor escolhido é maior ");
           }else{
               System.out.println("Valor escolhido é menor");
           }
            cont++;
        }
        System.out.println("Quantidade de Tentativas "+ cont);
    }
}
