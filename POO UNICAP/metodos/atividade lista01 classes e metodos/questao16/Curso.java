package br.unicap.poo.atividade.questao16;

public class Curso {
    private String nome;
    private String categoria;
    private int cargaHoraria;
    private int numeroDeAlunosInscritos;

    public Curso(){

    }

    public Curso(String nome,String categoria,int cargaHoraria, int numeroDeAlunosInscritos){
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroDeAlunosInscritos() {
        return numeroDeAlunosInscritos;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setNumeroDeAlunosInscritos(int numeroDeAlunosInscritos) {
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public void inscreverAluno(){
        this.numeroDeAlunosInscritos = this.numeroDeAlunosInscritos + 1;
        System.out.println("Aluno inscrito com sucesso!");
    }

    public void cancelarInscricao(){
        if(this.numeroDeAlunosInscritos < 1){
            System.out.println("Não a inscrições para cancelar!");
        } else {
            this.numeroDeAlunosInscritos = this.numeroDeAlunosInscritos - 1;
            System.out.println("Inscrição cancelada com sucesso!");
        }
    }

    public void atualizarCargaHoraria(int novaCargaHoraria){
        this.cargaHoraria = novaCargaHoraria;
        System.out.println("Carga horária atualizada com sucesso!");
        System.out.println("Nova carga horária: " + this.cargaHoraria);
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Carga horária: " + this.cargaHoraria);
        System.out.println("Alunos inscritos: " + this.numeroDeAlunosInscritos);
    }

}
