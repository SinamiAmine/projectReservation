package com.pluriel.pms.configuration.services;

import java.util.List;

import com.pluriel.pms.data.entities.Establishment;

public interface EstablishmentService {

	List<Establishment> get();

	Establishment add(Establishment establishment);
	
	void purge();
}
