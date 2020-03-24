package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;

public class AuditorAnimal {

    @PreUpdate
    @PrePersist
    public void alterarDataUltimaAtualizacao(Animal animal) {
        animal.setDataUltimaAtualizacao(LocalDateTime.now());
    }
}
