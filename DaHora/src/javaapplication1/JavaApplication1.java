package javaapplication1;

import java.io.*;
import java.util.Scanner;

public class JavaApplication1 {


    
    public static void main(String[] args) {
        try {
            // Conteudo
            //String content = "Rajha";

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
                char[] content = null;
                // Escreve e fecha arquivo
                bw.write(content);
            }
            
            // Le o arquivo
            FileReader ler = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            // Imprime confirmacao
            System.out.println("Feito =D");

        } catch (IOException e) {
        }
    }
}