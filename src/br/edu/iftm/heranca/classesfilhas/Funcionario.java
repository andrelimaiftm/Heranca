package br.edu.iftm.heranca.classesfilhas;

import br.edu.iftm.heranca.superclasse.Pessoa;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor) {
        super(nome, idade, sexo);
        this.trabalhando = false;
        this.setor = setor;
    }

    public void mudarTrabalho(){
        if(this.trabalhando){
            this.trabalhando = false;
        }else{
            this.trabalhando = true;
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario ["+ super.toString() +"setor=" + setor + ", trabalhando=" + trabalhando + "]";
    }

    
    
}
