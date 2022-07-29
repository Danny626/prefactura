package com.albo.soa.impl.alt;

import com.albo.soa.entities.Inventario;
import com.albo.soa.repositories.alt.IInventarioAltRepository;
import com.albo.soa.services.alt.IInventarioAltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class InventarioAltServiceImpl implements IInventarioAltService {

	@Autowired
	private IInventarioAltRepository inventarioAltRepo;

	@Override
	public List<Inventario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventario> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Inventario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Inventario> findById(String s) {
		return Optional.empty();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Inventario> buscar(String gestion, String recinto, String nroReg, String docEmbarque) {
		return inventarioAltRepo.buscar(gestion, recinto, nroReg, docEmbarque);
	}

}
