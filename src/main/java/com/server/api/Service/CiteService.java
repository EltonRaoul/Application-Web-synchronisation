package com.server.api.Service;

import java.util.List;
import java.util.UUID;

import com.server.api.Models.Cites;




public interface CiteService {
	
	Cites saveCite(Cites cite);
	
	List<Cites> getAllCite();
	
	Cites getCiteById(UUID idCite);
	
	Cites updateCite(Cites cite, UUID idCite);

	void deleteCite(UUID idCite);
	
	List<Cites> getCiteUpdateClientFalse();
	
	Cites updateClientTrue(Cites cite, UUID idCite);
	
	

}
