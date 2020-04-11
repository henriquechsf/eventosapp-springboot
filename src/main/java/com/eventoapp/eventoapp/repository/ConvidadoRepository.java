package com.eventoapp.eventoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.eventoapp.models.Convidado;
import com.eventoapp.eventoapp.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, String> {
	
	List<Convidado> findByEvento(Evento evento);
}
