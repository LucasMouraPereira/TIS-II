

import java.io.*;
import java.util.Scanner;

public class JavaApplication1 {


    
   public static void main (String arg []){
		Scanner ler = new Scanner(System.in);
        // Conteudo

		System.out.printf("Informe Seu nome:\n");
		String content = ler.nextLine();
		        try {

            // Cria arquivo
            File file = new File("teste.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            // Escreve e fecha arquivo
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                // Escreve e fecha arquivo
                bw.write(content);
            }
            
            // Le o arquivo
            FileReader ler1 = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(ler1);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            // Imprime confirmacao
            System.out.println("Feito =D");

        } catch (IOException e) {
        }
    }
                     menu();
		System.out.println("Programa encerrado.");
	//  menu principal
	private static void menu() { // menu principal
		int opcao = 0;
		do {
			System.out
					.println("\n\n### DaHora - Banco de Horas ###");
			System.out.println("\n                  ================================");
			System.out.println("                  |     1 - Cadastro Funcionário   |");
			System.out.println("                  |     2 - Cadastro Empresa       |");
			System.out.println("                  |     3 - Consulta Funcionário   |");
			System.out.println("                  |     4 - Consulta Empresa       |");
			System.out.println("                  |     5 - Fazer Check in         |");
			System.out.println("                  |     6 - Fazer Check out        |");
			System.out.println("                  |     0 - Sair                   |");
			System.out.println("                  =================================\n");
			System.out.println                    ("Opção -> ");
			System.out.print("\n");
			switch (opcao) {
			case 1: CadastroFuncionario();
				break;
			case 2:
				CadastroEmpresa ();
				break;
                        case 3:
				ConsultaFuncionario ();
				break;
                        case 4:
				ConsultaEmpresa ();
				break;
                        case 5:
				FazerCheckIn();
				break;
                        case 6:
				FazerCheckOut();
				break;        
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}

    private static void CadastroFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CadastroEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ConsultaFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ConsultaEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void FazerCheckIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void FazerCheckOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
}