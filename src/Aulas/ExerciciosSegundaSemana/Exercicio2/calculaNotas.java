package Aulas.ExerciciosSegundaSemana.Exercicio2;

public class calculaNotas {

    public static void main(String[] args) {
        criarAluno();
    }

    public static void criarAluno() {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setId(1);
        disciplina1.setDisciplina("POO");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ederson");
        aluno1.setMatricula(1546);
        aluno1.setDisciplina(disciplina1);
        aluno1.getDisciplina().setNotaPrimeiraProva(8.8);
        aluno1.getDisciplina().setNotaSegundaProva(7.9);
        aluno1.getDisciplina().setNotaTrabalho(7);

        double media = 0;
        media = mediaPonderada(aluno1.getDisciplina().getNotaPrimeiraProva(),
                aluno1.getDisciplina().getNotaSegundaProva(),
                aluno1.getDisciplina().getNotaTrabalho());
        situacao(media);

        System.out.println("Aluno: " + aluno1.getNome() + "\nMatricula: " + aluno1.getMatricula() +
                "\nMateria: " + aluno1.getDisciplina().getDisciplina() + "\nNota da Primeira Prova: "
                + aluno1.getDisciplina().getNotaPrimeiraProva() +
                "\nNota da Segunda Prova: " + +aluno1.getDisciplina().getNotaSegundaProva() + "\n" +
                "Nota do Trabalho: " + aluno1.getDisciplina().getNotaTrabalho() + "\n" +
                "Resultado Final:" + situacao(media));
    }

    public static double mediaPonderada(double nota1, double nota2, double trabalho) {
        double media;
        media = ((nota1 * 1.5) + (nota2 * 1.5) + (trabalho * 2)) / 5;
        return media;
    }

    public static String situacao(double media) {
        return ((media >= 7) ? "Aprovado" : "Recuperação");
    }
}
