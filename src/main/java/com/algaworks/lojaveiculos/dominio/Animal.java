package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "animal")
@EntityListeners(AuditorAnimal.class)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "data_ultima_atualizacao", nullable = false)
    private LocalDateTime dataUltimaAtualizacao;

    @Transient
    private Integer idade;

    @PostLoad
    @PostPersist
    @PostUpdate
    public void calcularIdade() {
        long anos = ChronoUnit.YEARS
                .between(this.dataNascimento, LocalDate.now());

        this.idade = (int) anos;
    }

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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
