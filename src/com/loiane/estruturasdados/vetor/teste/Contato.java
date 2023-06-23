package com.loiane.estruturasdados.vetor.teste;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contato contato = (Contato) o;

        if (!getNome().equals(contato.getNome())) return false;
        if (!getTelefone().equals(contato.getTelefone())) return false;
        return getEmail().equals(contato.getEmail());
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getTelefone().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
