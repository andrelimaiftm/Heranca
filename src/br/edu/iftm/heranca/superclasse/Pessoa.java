package br.edu.iftm.heranca.superclasse;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;
    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
   
    public void fazerAniv(){
        if(this.sexo == 'M' || this.sexo == 'm'){
            System.out.format("Parabéns %s, Muitas Felicidades, Abraço\n", this.nome);
        }else if(this.sexo == 'F' || this.sexo == 'f'){
            System.out.format("Parabéns %s, Muitas Felicidades, Beijo\n", this.nome);
        }else{
            System.out.format("Parabéns %s, tudo de bom!!!\n", this.nome);
        }
        System.out.format("Pelos seus %d anos de vida\n", this.idade);
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return char return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }    

}
