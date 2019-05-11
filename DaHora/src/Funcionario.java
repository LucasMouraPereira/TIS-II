import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Funcionario {

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + "]";
	}

	static Funcionario get(String nome) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	private String nome;
	private static String cpf;

	public Funcionario(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	}

	public static void CadastroFuncionario(File fileFunc, Funcionario funcionario) throws FileNotFoundException {

		FileOutputStream saida = null;
		OutputStreamWriter gravador = null;
		BufferedWriter buffer_saida = null;

		BufferedReader buffRead = new BufferedReader(new FileReader(fileFunc));

		buffRead.lines().count();

		try {
			saida = new FileOutputStream(fileFunc, true);
			gravador = new OutputStreamWriter(saida);
			buffer_saida = new BufferedWriter(gravador);
			buffRead.lines().count();

			buffer_saida.write(funcionario.nome + " - ");
			buffer_saida.write(funcionario.cpf);

			buffer_saida.newLine();

			buffer_saida.flush();
			buffRead.close();
		} catch (IOException e) {
		}
	}

	public static String ConsultaFuncionario(File fileFunc, String nomeFunc) throws FileNotFoundException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileFunc));
		String linha = "";
		
		try {
			
			while ((linha = bufferedReader.readLine())!= null && !linha.contains(nomeFunc)) {
				
				if(linha.contains(nomeFunc)) {
					System.out.println(linha);
				} else 
					System.out.println("Funcionário não encontrado");
			}
		}
			catch (IOException e) {
				System.err.println("Erro na abertura do arquivo " + fileFunc);  
		        return linha;  
		}
		return linha;
	}

	public static void excluirFuncionario(File fileFunc, String nomeFunc) throws FileNotFoundException{
		
		try {
			FileReader fileReader = new FileReader(fileFunc);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String linha = bufferedReader.readLine();
			ArrayList<String> salvar = new ArrayList();
			
			while(linha != null) {
				if(!linha.contains(nomeFunc)) {
					salvar.add(linha);
				}
				linha = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			fileReader.close();
			FileWriter fileWriter2 = new FileWriter(fileFunc, true);
			fileWriter2.close();
			
			FileWriter fileWriter = new FileWriter(fileFunc);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for(int i = 0; i<salvar.size(); i++) {
				bufferedWriter.write(salvar.get(i));
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			fileWriter.close();
			
		}catch(IOException ex) {
			
		}
	}

public static String alterarFuncionario(File fileFunc, String nomeFunc, String cpfFunc) throws FileNotFoundException{
	
	String linhaReescrita = null;
	
	try {
		FileReader fileReader = new FileReader(fileFunc);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String linha = bufferedReader.readLine();
		ArrayList<String> salvar = new ArrayList();
		
		while(linha != null) {
			if(linha.contains(nomeFunc)) {
				salvar.add(linha);
				linhaReescrita = linha.replaceAll(linha, cpfFunc);;
			}
			linha = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		fileReader.close();
		FileWriter fileWriter2 = new FileWriter(fileFunc, true);
		fileWriter2.close();
		
		FileWriter fileWriter = new FileWriter(fileFunc);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		for(int i = 0; i<salvar.size(); i++) {
			bufferedWriter.write(salvar.get(i));
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		fileWriter.close();
		
		
	}catch(IOException ex) {
		
	}
	return linhaReescrita;
}
}		