package com.costa.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.ecommerce.model.Utente;
import com.costa.ecommerce.repository.UtenteRepo;

import lombok.Data;

@Service
@Data
public class UtenteServiceImpl implements IUtenteService{
	
	@Autowired
	UtenteRepo repo;
	
	@Override
	public void salva(Utente utente) {
		repo.save(utente);
	}
	
}
