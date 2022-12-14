import java.time.LocalTime;
import java.util.Scanner;

public class ValidarLogin {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String usuarioValidado = "fulano"; 
		String senhaValidada = "semsenha123";
			
		System.out.print("Usuário: ");
		String usuario = scanner.nextLine().toLowerCase();
		System.out.print("Senha: ");
		String senha = scanner.nextLine().toLowerCase();
		
		int horario = LocalTime.now().getHour();
		
		if (usuario.equals(usuarioValidado)==false || senha.equals(senhaValidada)==false) {
			System.out.println("Usuário e/ou senha incorretos.");
		} else {
			
			String[] mensagem = new String[4];
			
			mensagem[0] = "Bom dia, você se logou ao nosso sistema.";
			mensagem[1] = "Boa tarde, você se logou ao nosso sistema.";
			mensagem[2] = "Boa noite, você se logou ao nosso sistema.";
			mensagem[3] = "Boa madrugada, você se logou ao nosso sistema.";
			
			if (horario > 6 && horario < 12) {
				System.out.println(mensagem[0]);							
			}
			else if (horario >= 12 && horario < 18) {
				System.out.println(mensagem[1]);							
			}
			else if (horario >= 18 && horario < 24) {
				System.out.println(mensagem[2]);							
			}
			else if (horario >= 0 && horario < 6) {
				System.out.println(mensagem[3]);							
			}
		}
	scanner.close();
	}
}