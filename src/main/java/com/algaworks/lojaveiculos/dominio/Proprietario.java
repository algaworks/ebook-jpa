package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proprietario")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 255)
    private String email;

    @OneToMany(mappedBy = "proprietario")
    private List<Veiculo> veiculos;

    @ElementCollection
    @CollectionTable(name = "proprietario_telefone",
            joinColumns = @JoinColumn(name = "proprietario_codigo"))
    @AttributeOverrides({
            @AttributeOverride(name = "numero",
                    column = @Column(name = "telefone_numero", length = 20, nullable = false))
    })
    private List<Telefone> telefones = new ArrayList<>();

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proprietario that = (Proprietario) o;

        return codigo != null ? codigo.equals(that.codigo) : that.codigo == null;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}
