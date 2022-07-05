package com.server.api.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.server.api.Models.Cites;
import com.server.api.Repository.CiteRepository;
import com.server.api.Service.CiteService;





@Service
public class CiteServiceImpl implements CiteService {
	
	private CiteRepository citeRepository;
	
	public CiteServiceImpl(CiteRepository citeRepository) {
		super();
		this.citeRepository = citeRepository;
	}

	@Override
	public Cites saveCite(Cites cite) {
		// TODO Auto-generated method stub
		return citeRepository.save(cite);
	}

	@Override
	public List<Cites> getAllCite() {
		// TODO Auto-generated method stub
		return citeRepository.findAll();
	}

	@Override
	public Cites getCiteById(UUID idCite) {
		// TODO Auto-generated method stub
		
		Optional<Cites> cite = citeRepository.findById(idCite);
		
		if(cite.isPresent()) {
			return cite.get();
		}else {
			throw new com.server.api.Exceptions.RessourceNotFoundExeception("Cites", "idCite", idCite);
		}
		
	}

	@Override
	public Cites updateCite(Cites cite, UUID idCite) {
		//check if the City id is in the database
				Cites existingCite = citeRepository.findById(idCite).orElseThrow(() 
						-> new com.server.api.Exceptions.RessourceNotFoundExeception("Cites", "idCite", idCite));
				
				existingCite.setNomCite(cite.getNomCite());
				existingCite.setRefCite(cite.getRefCite());
				existingCite.setCreatedAt(cite.getCreatedAt());
				existingCite.setStatut(cite.getStatut());
				existingCite.setImage(cite.getImage());
				existingCite.setIdUtilisateur(cite.getIdUtilisateur());
				existingCite.setUpdatedAt(cite.getUpdatedAt());
				existingCite.setLastUpdate(cite.getLastUpdate());
				//existingCite.set(cite.getCreatedAt());
				
				//save existing book in the dblocal
				citeRepository.save(existingCite);
				return existingCite;
	}

	@Override
	public void deleteCite(UUID idCite) {
		// check if the id is in the db
		citeRepository.findById(idCite).orElseThrow(() -> 
					new com.server.api.Exceptions.RessourceNotFoundExeception("Cites", "idCite", idCite));
		
				citeRepository.deleteById(idCite);
	}

	@Override
	public List<Cites> getCiteUpdateClientFalse() {
		// TODO Auto-generated method stub
		return citeRepository.findByUpdateClient(false);
	}

	@Override
	public Cites updateClientTrue(Cites cite, UUID idCite) {
		//check if the book id is in the database
				Cites existingCite = citeRepository.findById(idCite).orElseThrow(() 
						-> new com.server.api.Exceptions.RessourceNotFoundExeception("Cites", "idCite", idCite));
				
				existingCite.setUpdateClient(!cite.isUpdateClient());
				
				//save existing book in the dblocal
				citeRepository.save(existingCite);
				return existingCite;
	}
	
	
	

}
