package Aulas;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exer03 {
    public void votacao() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Candidato: ");

        HashMap<Integer, String> candidatos = new HashMap<>();

        for (int i = 1; i < 5; i++) {
            System.out.println("Candidato " + i + " :");
            String candidato = entrada.nextLine();
            candidatos.put(i, candidato);
        }

            System.out.println(candidatos.entrySet());
            int can1=0;
            int can2=0;
            int can3=0;
            int can4=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o numero de um candidato: ");
            int escolha = entrada.nextInt();
            switch (escolha){
                case 1:
                    can1++;
                    break;
                case 2:
                    can2++;
                    break;
                case 3:
                    can3++;
                    break;
                case 4:
                    can4++;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }


    }

     /*   Scanner entrada = new Scanner(System.in);

        System.out.println("Candidato01: ");
        String candidato1 = entrada.nextLine();
        int can1= 0;

        System.out.println("Candidato02: ");
        String candidato2 = entrada.nextLine();
        int can2= 0;

        System.out.println("Candidato03: ");
        String candidato3 = entrada.nextLine();
        int can3= 0;

        System.out.println("Candidato04: ");
        String candidato4 = entrada.nextLine();
        int can4= 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha seu candidato: ");
            String candidatoEscolhido = entrada.nextLine();

            if (candidato1.equalsIgnoreCase(candidatoEscolhido)) {
                can1++;
            }else  if (candidato2.equalsIgnoreCase(candidatoEscolhido)) {
                can2++;
            }else  if (candidato3.equalsIgnoreCase(candidatoEscolhido)) {
                can3++;
            }else{
                can4++;
            }
        }
        if ((can1 > can2) && (can1 > can3) && (can1 > can4)){
            System.out.println("Candidato Vencedor foi: "+candidato1+ " com a quantidade de votos: "+ can1);
            System.out.println("O candidato : "+candidato2+ " fez a quantidade de votos: "+ can2);
            System.out.println("O candidato : "+candidato3+ " fez a quantidade de votos: "+ can3);
            System.out.println("O candidato : "+candidato4+ " fez a quantidade de votos: "+ can4);
        }else if ((can2 > can3) && (can3 > can4)){
            System.out.println("Candidato Vencedor foi: "+candidato2+ " com a quantidade de votos: "+ can2);
            System.out.println("O candidato : "+candidato1+ " fez a quantidade de votos: "+ can1);
            System.out.println("O candidato : "+candidato3+ " fez a quantidade de votos: "+ can3);
            System.out.println("O candidato : "+candidato4+ " fez a quantidade de votos: "+ can4);
        }else if (can3 > can4){
            System.out.println("Candidato Vencedor foi: "+candidato3+ " com a quantidade de votos: "+ can3);
            System.out.println("O candidato : "+candidato1+ " fez a quantidade de votos: "+ can1);
            System.out.println("O candidato : "+candidato2+ " fez a quantidade de votos: "+ can2);
            System.out.println("O candidato : "+candidato4+ " fez a quantidade de votos: "+ can4);
        }else{
            System.out.println("Candidato Vencedor foi: "+candidato4+ " com a quantidade de votos: "+ can4);
            System.out.println("O candidato : "+candidato1+ " fez a quantidade de votos: "+ can1);
            System.out.println("O candidato : "+candidato2+ " fez a quantidade de votos: "+ can2);
            System.out.println("O candidato : "+candidato3+ " fez a quantidade de votos: "+ can3);
        }
    }
*/
}