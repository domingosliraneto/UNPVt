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
public class FolhaSalarial {
    
    Funcionario[] funcionarios;
    int ind;

    public FolhaSalarial() {
        funcionarios = new Funcionario[10];
        ind = 0;
    }
    
    public void registrarFuncionario(Funcionario funcionario){
        funcionarios[ind++] = funcionario;
    }
    
    public double calcularFolha(){
        double total = 0;
        
        
        for(int i=0; i<ind; i++)
            total += funcionarios[i].salario()+funcionarios[i].bonus();
        
        
        return total;
    }
    
}
