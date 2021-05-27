package br.edu.iftm.heranca.testes;

//import br.edu.iftm.heranca.classesfilhas.Aluno;
import br.edu.iftm.heranca.classesfilhas.*;
import br.edu.iftm.heranca.superclasse.Pessoa;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("João", 35, 'm');
        Aluno a1 = new Aluno("Maria", 21, 'F', "12345", "Ciência da Computação");
        Funcionario f1 = new Funcionario("Pedro", 40, 'M', "Setor de Almoxerifado");
        Professor prof = new Professor("Andre", 35, 'M', "Professor de Informatica", 3000d);
        p1.fazerAniv();
        a1.fazerAniv();
        a1.cancelarMatricula();
        System.out.println(a1);
        f1.mudarTrabalho();
        System.out.println(f1);
        System.out.println(prof);
        prof.receberAum(500f);
        System.out.println(prof);
    }
    
}
