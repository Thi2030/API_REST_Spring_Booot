package Java_SpringBoot.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;


public class RegistroAluno {

@Entity(name = "tb_RegistroAluno")
public class Account {

    /*
     * numero, instituicao, escola, bloco
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    @Column(unique = true)
    private int numero;

    @Column(name = "instituicao")
    private String instituicao;

    @Column(name = "escola")
    private String escola;

    @Column(name = "bloco")
    private String bloco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

}
    
}