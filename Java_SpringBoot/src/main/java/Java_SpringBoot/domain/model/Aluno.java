package Java_SpringBoot.domain.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private RegistroAluno registroAluno;

    @OneToOne(cascade = CascadeType.ALL)
    private Curso curso;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionalidade> funcionalidade;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Noticia> noticia;

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

    public RegistroAluno getRegistroAluno() {
        return registroAluno;
    }

    public void setrRegistroAluno(RegistroAluno registroAluno) {
        this.registroAluno = registroAluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Funcionalidade> getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(List<Funcionalidade> funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public List<Noticia> getNoticia() {
        return noticia;
    }

    public void setNoticia(List<Noticia> news) {
        this.noticia = noticia;
    }

    
}