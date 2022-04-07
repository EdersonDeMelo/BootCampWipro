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
		aluno1.setDisciplina(disciplina1);
		aluno1.getDisciplina().setNotaPrimeiraProva(8.8);
		aluno1.getDisciplina().setNotaSegundaProva(1.9);
		aluno1.getDisciplina().setNotaTrabalho(7);

		double media = 0;
		media = notaPonderada(aluno1.getDisciplina().getNotaPrimeiraProva(), 
				aluno1.getDisciplina().getNotaSegundaProva(), 
				aluno1.getDisciplina().getNotaTrabalho());
		
	System.out.println((media>=7)? "Aprovado" : "Recupera��o");
		
	}


	public static double notaPonderada(double nota1, double nota2, double trabalho) {
		double media;
		media = ((nota1*1.5) +(nota2*1.5)+(trabalho*2)) /5;
		return media;
		
	}

}
