import java.util.Scanner;

public class CalcularBonus {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	 
		System.out.println("CADASTRO DE FUNCIONÁRIOS");
		
		System.out.print("Quantidade de funcionários: ");
		int valid = scanner.nextInt();
		
		Funcionarios[] funcionario = new Funcionarios[valid];
		
		for(int i = 0; i < valid; i++) {
			scanner.nextLine();
			
			funcionario[i] = new Funcionarios();
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			funcionario[i].setNome(nome);
			
			System.out.print("Salario: ");
			double salario = scanner.nextInt();
			funcionario[i].setSalario(salario);
		}

		System.out.println();
		System.out.println("Resultado do cálculo do bônus: ");
		
		for (int i = 0; i < funcionario.length; i++) {
			
			System.out.println("Funcionário: " + funcionario[i].getNome());
			System.out.println("Salário: " + String.format("%.2f", funcionario[i].getSalario()));
			funcionario[i].bonificacao();
			System.out.println();
		
		}
	
	}
}
