package com.remedios.victor.curso.repositories;


import com.remedios.victor.curso.services.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RemedioRepository extends JpaRepository<Remedio, Long> { // recebe o tipo de entidade, que é remédio e o tipo de atributo que identifica a entidade que é o "Long" do ID.
    List<Remedio> findAllByAtivoTrue();

}
