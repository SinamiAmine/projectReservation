package com.pluriel.pms.configuration.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluriel.pms.configuration.services.EstablishmentService;
import com.pluriel.pms.data.entities.Establishment;
import com.pluriel.pms.data.repositories.EstablishmentRepository;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {
	@Autowired
	EstablishmentRepository establishmentRepository;

	@Override
	public List<Establishment> get() {
		return establishmentRepository.findAll();
	}

	@Override
	public Establishment add(Establishment establishment) {
		return establishmentRepository.save(establishment);
	}

	@Override
	public void purge() {
		establishmentRepository.deleteAll();
	}

}
