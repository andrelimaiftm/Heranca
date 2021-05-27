package br.edu.iftm.heranca.classesfilhas;

import br.edu.iftm.heranca.superclasse.Pessoa;

public class Aluno extends Pessoa{

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo,
         String matricula, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void cancelarMatricula(){
        this.matricula = null;
        this.curso = null;
        this.nome = null;
        this.idade = 0;
        this.sexo = ' ';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + "]";
    }
    
    
}
