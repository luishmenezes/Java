package br.unicap.poo.atividade.questao6;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
private String codigo;
private int cargaHoraria;
private String nivel;
private String descricao;
private ArrayList<Professor> professores;

public Disciplina(){

}

public Disciplina(String nome, String codigo, int cargaHoraria, String nivel, String descricao){
    this.nome = nome;
    this.codigo = codigo;
    this.cargaHoraria = cargaHoraria;
    this.nivel = nivel;
    this.descricao = descricao;
    this.professores = new ArrayList<>();
}



public void adicionarProfessor(Professor professor){
professores.add(professor);
System.out.println("Professor " + professor.getNome() + " adicionado");
}

public void obterProfessorComMaiorSalario(){
Professor professorComMaiorSalario = professores.get(0);
        for (Professor professor : professores) {
            if (professor.getSalario() > professorComMaiorSalario.getSalario()) {
                professorComMaiorSalario = professor;
            }
        }

        System.out.println("Professor com maior salário é: " + professorComMaiorSalario.getNome());
        
}

public void listarProfessores(){
System.out.println("Professores da disciplina " + this.nome);
for(Professor professor : professores){
System.out.println(professor.getNome());
}}

public int getCargaHoraria() {
    return cargaHoraria;
}
public String getCodigo() {
    return codigo;
}
public String getDescricao() {
    return descricao;
}
public String getNivel() {
    return nivel;
}
public String getNome() {
    return nome;
}
public ArrayList<Professor> getProfessores() {
    return professores;
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
public void setNivel(String nivel) {
    this.nivel = nivel;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setProfessores(ArrayList<Professor> professores) {
    this.professores = professores;
}
}


