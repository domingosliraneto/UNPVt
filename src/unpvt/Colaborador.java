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
public class Colaborador extends Funcionario{

    public Colaborador(String nome, String dataNascimento, String cpf, String rg, String endereco, String matricula) {
        super(nome, dataNascimento, cpf, rg, endereco, matricula);
               
    }

    @Override
    public double bonus() {
        return 400;
    }
    
}
