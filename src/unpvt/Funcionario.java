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
public abstract class Funcionario extends Usuario{

    double salario;
    
    public Funcionario(String nome, String dataNascimento, String cpf, String rg, String endereco, String matricula) {
        super(nome, dataNascimento, cpf, rg, endereco, matricula);
        salario = salarioMinimo(); //caso do funcionario padrão que ganha um salário mímimo.
    }
    
    public abstract double bonus();
    
    public double salarioMinimo(){
        return 788;
    }

    double salario() {
        return salario;
    }
    
    
    
}
