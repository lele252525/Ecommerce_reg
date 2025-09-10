package com.costa.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.costa.ecommerce.model.Utente;

public interface UtenteRepo extends JpaRepository <Utente, Long> {
	
}
