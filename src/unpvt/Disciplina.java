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
public class Disciplina {
    String nome;
    double cargaHoraria;
    double creditos;
    int horaInicial;
    int minutoInicial;
    int horaFinal;
    int minutoFinal;
    String anoLetivo;

    public Disciplina(String nome, double cargaHoraria, double creditos, int horaInicial, int minutoInicial, int horaFinal, int minutoFinal, String anoLetivo) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
        this.horaInicial = horaInicial;
        this.minutoInicial = minutoInicial;
        this.horaFinal = horaFinal;
        this.minutoFinal = minutoFinal;
        this.anoLetivo = anoLetivo;
    }
    
    
    
}
