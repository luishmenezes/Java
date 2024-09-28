package br.unicap.poo.atividade.questao3;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private String codigo;
    private int duracao;
    private String descricao;
    private int cargaHoraria;

    private ArrayList<Aluno> alunos;

    public Curso(){
        
    }

    public Curso(String nome, String codigo,int duracao,String descricao,int cargaHoraria){
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno.getNome());
    }

    public void listarAlunos(){
        System.out.println("Lista de alunos no curso " + this.nome);
        for (Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getDuracao() {
        return duracao;
    }
    public String getNome() {
        return nome;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
