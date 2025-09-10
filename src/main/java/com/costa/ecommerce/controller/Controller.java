package com.costa.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costa.ecommerce.model.Utente;
import com.costa.ecommerce.service.UtenteServiceImpl;

@RequestMapping ("/gestione_utenti")
@RestController
public class Controller {
	
	@Autowired
	UtenteServiceImpl service;
	
	@PostMapping("/salva_utente")
	public ResponseEntity<Utente> salvaUtente (Utente utente) {
		service.salva(utente);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(utente);
	}
	
}
