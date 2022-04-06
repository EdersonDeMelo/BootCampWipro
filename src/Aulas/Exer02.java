package Aulas;

import java.util.Scanner;

public class Exer02 {

    public void mediaFinal() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno: ");
        String nomeAluno = entrada.nextLine();

        System.out.println("Informe a primeira nota: ");
        double nota1 = entrada.nextInt();

        System.out.println("Informe a segunda nota: ");
        double nota2 = entrada.nextInt();
        double media = (nota1 + nota2) / 2;
        System.out.println((media >= 6) ? "Aluno Aprovado, media: " + media : "Aluno Reprovado, media: " + media);

    }
}
