/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpvt;

/**
 *
 * @author Flavio
 */
public abstract class Usuario {
    
    String nome;
    String dataNascimento;
    String cpf;
    String rg;
    String endereco;
    String matricula;

    public Usuario(String nome, String dataNascimento, String cpf, String rg, String endereco, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.matricula = matricula;
    }
    
    
    
    
    
}
