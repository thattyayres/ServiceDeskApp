package br.usjt.desenvmob.aula03.model;

import java.io.Serializable;

/**
 * Created by Tatiane do Nascimento Ayres 816118367.
 */

class Fila implements Serializable {
    private int id;
    private String nome;

    public Fila(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Fila(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
