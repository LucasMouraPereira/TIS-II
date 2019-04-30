/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajha
 */

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajha
 */
public class Empresa {

    private static final Map<String, Funcionario> Cadastro = new HashMap<>();


    public static Funcionario pesquisar(String login) {
        return Funcionario.get(login);
    }

    private static Funcionario get(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String nome;
    private final String cpf;
    

    public Funcionario(String nome, String cpf) {
        
        this.nome = nome;
        this.cpf = cpf;
    }
}