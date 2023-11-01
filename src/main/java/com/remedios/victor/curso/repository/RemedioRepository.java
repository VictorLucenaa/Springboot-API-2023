package com.remedios.victor.curso.repository;

import com.remedios.victor.curso.dto.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Long> { // recebe o tipo de entidade, que é remédio e o tipo de atributo que identifica a entidade que é o "Long" do ID.

}
