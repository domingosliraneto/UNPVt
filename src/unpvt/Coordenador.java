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
public class Coordenador extends Funcionario{

    public Coordenador(String nome, String dataNascimento, String cpf, String rg, String endereco, String matricula) {
        super(nome, dataNascimento, cpf, rg, endereco, matricula);
        
        salario = 3 * salarioMinimo();
    }

    @Override
    public double bonus() {
        return 600;
    }
    
    
}
