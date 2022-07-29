package com.albo.soa.impl.vir;

import com.albo.soa.entities.Inventario;
import com.albo.soa.repositories.vir.IInventarioVirRepository;
import com.albo.soa.services.vir.IInventarioVirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioVirServiceImpl implements IInventarioVirService {

	@Autowired
	private IInventarioVirRepository inventarioVirRepo;

	@Override
	public List<Inventario> findAll() {
		return null;
	}

	@Override
	public List<Inventario> findAll(Sort sort) {
		return null;
	}

	@Override
	public Page<Inventario> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public Optional<Inventario> findById(String s) {
		return Optional.empty();
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public List<Inventario> buscar(String gestion, String recinto, String nroReg, String docEmbarque) {
		return inventarioVirRepo.buscar(gestion, recinto, nroReg, docEmbarque);
	}
}
