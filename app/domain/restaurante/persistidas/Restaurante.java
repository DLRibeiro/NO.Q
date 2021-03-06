package domain.restaurante.persistidas;

import domain.restaurante.CNPJ;
import domain.restaurante.Email;
import domain.restaurante.Endereco;
import domain.restaurante.Horario;
import io.ebean.Model;

import java.util.HashSet;
import java.util.Set;

public class Restaurante extends Model{
    private CNPJ cnpj;
    private Email email;
    private Endereco endereco;
    private Horario horario;
    private String nome, senha;

    public Restaurante(){}
    public Restaurante(String nome, CNPJ cnpj, Email email, String senha) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
       // this.endereco = endereco; //MODIFICAR O FORMATO DO ENDEREÇO E DO HORARIO
      //  this.horario = horario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
