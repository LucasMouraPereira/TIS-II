

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication1 {


    
   public static void main (String arg []){
<<<<<<< HEAD
	   
	   
	//  menu principal
=======
         // menu principal
>>>>>>> 0a3fdfbf22b6c5454e0d76352c722f88fd2fe967
		int opcao = 0;
		Scanner lerOption = new Scanner(System.in);
		do {
<<<<<<< HEAD
			System.out.println("\n\n### DaHora - Banco de Horas ###");
=======
			
                        System.out.println("              \n\n#### DaHora - Banco de Horas  ####");
>>>>>>> 0a3fdfbf22b6c5454e0d76352c722f88fd2fe967
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
			opcao = lerOption.nextInt();
			
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
<<<<<<< HEAD
		
		System.out.println("Programa encerrado.");
		
   }

   private static void CadastroFuncionario() {
       
       Scanner ler = new Scanner(System.in);
       // Conteudo

		System.out.printf("Informe seu nome:\n");
		String nome = ler.nextLine();
		System.out.printf("Informe seu CPF:\n");
		String cpf = ler.nextLine();
		
		   
		
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
               bw.write(nome + "\n");
               bw.write(cpf + "\n");
               
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
=======
	}
   	
    private static void FazerCheckOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void FazerCheckIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ConsultaEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CadastroEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CadastroFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ConsultaFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
		Scanner ler = new Scanner(System.in);
                // Conteudo
		System.out.printf("Informe Seu nome:\n");
		String content = ler.nextLine();
		        try {

            // Cria arquivo
            File file = new File("teste.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            // Prepara para escrever no arquivo
            FileWriter fw;
        try {
            fw = new FileWriter(file.getAbsoluteFile());
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
            // Escreve e fecha arquivo
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                try {
                    // Escreve e fecha arquivo
                    bw.write(content);
                } catch (IOException ex) {
                    Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
           Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
       }
            
            // Le o arquivo
            FileReader ler1 = null;
        try {
            ler1 = new FileReader("teste.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
            BufferedReader reader = new BufferedReader(ler1);  
            String linha;
       try {
           while( (linha = reader.readLine()) != null ){
               System.out.println(linha);
           }
       } catch (IOException ex) {
           Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
       }

            // Imprime confirmacao
            System.out.println("Feito =D");

        } catch (IOException e) {
        }
    }
                    

    
    
>>>>>>> 0a3fdfbf22b6c5454e0d76352c722f88fd2fe967
