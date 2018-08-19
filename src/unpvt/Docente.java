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
public class Docente extends Funcionario {

    public Docente(String nome, String dataNascimento, String cpf, String rg, String endereco, String matricula) {
        super(nome, dataNascimento, cpf, rg, endereco, matricula);
        
        this.salario = 2 * salarioMinimo();
    }

    @Override
    public double bonus() {
        return 500;
    }
    
    public void fazerChamada(Turma turma, Disciplina disciplina){
        
    }
    
    
    public void enviarMensagem(Turma turma, Disciplina disciplina, String texto){
        
        
    }
    
    public void lancarNotas(Turma turma, Disciplina disciplina, int[] notas){
        
    }
    
    
    public void enviarArquivos(String arquivo){
        
    }
    
    
    
    
}
