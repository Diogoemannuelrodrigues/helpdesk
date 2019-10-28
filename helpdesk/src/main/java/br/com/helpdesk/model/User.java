package br.com.helpdesk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @NotEmpty(message = "Por favor adicione um nome")
    private String nome;

    @Column
    @Email(message = "Por favor adicione um e-mail válido")
    private String email;

    @Column
    @NotEmpty(message = "Por favor adicione um ultimo nome")
    private String lastName;

    @Column
    @NotEmpty (message = "Este campo nao pode ser vazio.")
    @Length(min = 6, message = "Sua senha deve conter mais de 6 caracteres.")
    private String password;

    @Column
    private Boolean active;

    public User() {
    }

    public User(String nome,
                String email,
                String lastName,
                String password,
                Boolean active) {
        this.nome = nome;
        this.email = email;
        this.lastName = lastName;
        this.password = password;
        this.active = active;
    }

    public User(Long id,
                String nome,
                String email,
                String lastName,
                String password,
                Boolean active) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.lastName = lastName;
        this.password = password;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
