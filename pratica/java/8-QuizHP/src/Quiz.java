import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pontos = 0;
		
		String[] questions = new String[10];
		
		questions[0] = "Em que ano Harry Potter nasceu?";
		questions[1] = "Qual o formato da cicatriz que Harry tinha na testa?";
		questions[2] = "A qual casa de Hogwarts Hermione pertencia?";
		questions[3] = "Quem é o melhor amigo do Harry?";
		questions[4] = "Quantas escadas existem em Hogwarts?";
		questions[5] = "O que é 'The Quibbler?'";
		questions[6] = "Qual o esporte mais importante de Hogwarts?";
		questions[7] = "Professor Snape é o diretor de qual casa de Hogwarts?";
		questions[8] = "Qual instrumento mágico os bruxos usam para canalizar seu poder e fazer magias?";
		questions[9] = "Quem é o verdadeiro vilão de Harry Potter?";
		
		String[] answers = new String[10];
		
		answers[0] = "1980";
		answers[1] = "RAIO";
		answers[2] = "GRIFINORIA";
		answers[3] = "RONY";
		answers[4] = "142";
		answers[5] = "JORNAL";
		answers[6] = "QUADRIBOL";
		answers[7] = "SONSERINA";
		answers[8] = "VARINHA";//
		answers[9] = "VOLDEMORT";
		
		System.out.println("Seja bem vindo ao fandom quiz sobre Harry Potter");	
		System.out.println("(Obs: Digite sua resposta sem acento gráfico)");	
		System.out.println();
		System.out.println("Nome do jogador: ");
		String nome = scanner.nextLine();

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			System.out.println("Digite sua resposta: ");
			String answer = scanner.nextLine().toUpperCase();

			if (answer.equals(answers[i])) {
				pontos++;
			}
		}
		
		System.out.println("Jogador: " + nome);
		System.out.println("Acertos: " + pontos);
		System.out.println("Erros: " + (10 - pontos));
		
		scanner.close();		
	}
}