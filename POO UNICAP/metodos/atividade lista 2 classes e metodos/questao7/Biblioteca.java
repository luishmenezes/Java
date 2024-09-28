package br.unicap.poo.atividade.questao7;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private int numeroLivros;
    private String horarioFuncionamentos;
    private int capacidadeUsuarios;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(){

    }

    public Biblioteca (String nome, String endereco, int numeroLivros, String horarioFuncionamentos, int capacidadeUsuarios){
        this.nome = nome;
        this.endereco = endereco;
        this.numeroLivros = numeroLivros;
        this.horarioFuncionamentos = horarioFuncionamentos;
        this.capacidadeUsuarios = capacidadeUsuarios;
        this.usuarios = new ArrayList<>();
    }

    
    public int getCapacidadeUsuarios() {
        return capacidadeUsuarios;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getHorarioFuncionamentos() {
        return horarioFuncionamentos;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroLivros() {
        return numeroLivros;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setCapacidadeUsuarios(int capacidadeUsuarios) {
        this.capacidadeUsuarios = capacidadeUsuarios;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setHorarioFuncionamentos(String horarioFuncionamentos) {
        this.horarioFuncionamentos = horarioFuncionamentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroLivros(int numeroLivros) {
        this.numeroLivros = numeroLivros;
    }
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNome() + " adicionado!");
    }
    
    public void removerUsuario(String matricula){
        Usuario usuarioARemover = null;
    
    
    for (Usuario usuario : usuarios) {
        if (usuario.getMatricula().equals(matricula)) {
            usuarioARemover = usuario;
            break;
        }
    }

     if (usuarioARemover != null) {
        usuarios.remove(usuarioARemover);
        System.out.println("Usuario com matricula " + matricula + " removido!");
    } else {
        System.out.println("Usuario com matricula " + matricula + " não encontrado!");
    }
        
    }
        
    

    public void listarUsuarios(){
        System.out.println("Lista de usuarios da biblioteca " + this.nome);
        for(Usuario usuario : usuarios){
            System.out.println(usuario.getNome());
        }
    }
}
