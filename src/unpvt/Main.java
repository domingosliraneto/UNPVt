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
public class Main {
    
    public static void main(String[] args) {
        
        FolhaSalarial folha = new FolhaSalarial();
        
        Docente andre = new Docente("André Quitiliano Bezerra", "01/01/1998", "000.000.000-00","000.000", "Engeheiro Roberto Freire", "1234" );
        Coordenador gilson = new Coordenador("Gilson", "01/01/1968", "000.000.000-00","000.000", "Engeheiro Roberto Freire", "1234" );
        Colaborador tiririca = new Colaborador("Tiririca", "01/01/1868", "000.000.000-00","000.000", "Ceará", "1234" );
        
        folha.registrarFuncionario(tiririca);
        folha.registrarFuncionario(andre);
        folha.registrarFuncionario(gilson);
        
        
        System.out.println("Valor total da folha: " + folha.calcularFolha());
        
        
    }
}
