package br.edu.iftm.heranca.classesfilhas;

import br.edu.iftm.heranca.superclasse.Pessoa;

public class Professor extends Pessoa{

    private String epecialista;
    private double salario;

    public Professor(String nome, int idade, char sexo, String especialista, 
        double salario) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.epecialista = especialista;
    }

    public void receberAum(double aumento){
        this.salario += aumento;
    }

    public String getEpecialista() {
        return epecialista;
    }

    public void setEpecialista(String epecialista) {
        this.epecialista = epecialista;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [epecialista=" + epecialista + ", salario=" + salario + "]";
    }    
    
}
