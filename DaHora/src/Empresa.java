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

public class Empresa {

	@Override
	public String toString() {
		return "Empresa [razaosocial=" + razaosocial + ", CNPJ=" + cnpj + "]";
	}

	public static Empresa pesquisar(String razaosocial) {
		return Empresa.get(razaosocial);
	}

	public static Empresa get(String razaosocial) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	private String razaosocial;
	private String cnpj;

	public Empresa(String razaosocial, String cnpj) {

		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
	}

	public static void CadastroEmpresa(File fileEmpre, Empresa Empresa) throws FileNotFoundException {

		FileOutputStream saida = null;
		OutputStreamWriter gravador = null;
		BufferedWriter buffer_saida = null;

		BufferedReader buffRead = new BufferedReader(new FileReader(fileEmpre));

		buffRead.lines().count();

		try {

			saida = new FileOutputStream(fileEmpre, true);
			gravador = new OutputStreamWriter(saida);
			buffer_saida = new BufferedWriter(gravador);
			buffRead.lines().count();

			buffer_saida.write(Empresa.razaosocial + " ");
			buffer_saida.write(Empresa.cnpj);
			buffer_saida.newLine();

			buffer_saida.flush();
			buffRead.close();
		} catch (Exception e) {
		}
	}

	public static String ConsultaEmpresa(File fileEmpre, String razaoSocialEmpre) throws FileNotFoundException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(razaoSocialEmpre));
		String linha = "";
		
		try {
			
			while ((linha = bufferedReader.readLine())!= null && !linha.contains(razaoSocialEmpre)) {
				
				if(linha.contains(razaoSocialEmpre)) {
					System.out.println(linha);
				} else 
					System.out.println("Empresa não encontrado");
			}
		}
			catch (IOException e) {
				System.err.println("Erro na abertura do arquivo " + fileEmpre);  
		        return linha;  
		}
		return linha;
	}
	public static void excluirEmpresa(File fileEmpre, String razaoSocialEmpre) throws FileNotFoundException{
		
		try {
			FileReader fileReader = new FileReader(fileEmpre);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String linha = bufferedReader.readLine();
			ArrayList<String> salvar = new ArrayList();
			
			while(linha != null) {
				if(!linha.contains(razaoSocialEmpre)) {
					salvar.add(linha);
				}
				linha = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			fileReader.close();
			FileWriter fileWriter2 = new FileWriter(fileEmpre, true);
			fileWriter2.close();
			
			FileWriter fileWriter = new FileWriter(fileEmpre);
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
}