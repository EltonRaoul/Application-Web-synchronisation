package com.server.api.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.api.Models.Cites;
import com.server.api.Service.CiteService;




@RestController
@RequestMapping("/api/Cite")
public class CiteController {
	
	private CiteService citeService;

	public CiteController(CiteService citeService) {
		super();
		this.citeService = citeService;
	}
	
	@PostMapping()
	public ResponseEntity<Cites> saveLivre(@RequestBody Cites cite){
	
		return new ResponseEntity<Cites>(citeService.saveCite(cite), HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Cites> getLivre(){
		return citeService.getAllCite();
	}
	
	@GetMapping("{idCite}")
	public ResponseEntity<Cites> getLivreById(@PathVariable("idCite") UUID idCite){
		
		return new ResponseEntity<Cites>(citeService.getCiteById(idCite), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{idCite}")
	public ResponseEntity<String> deleteLivre(@PathVariable("idCite") UUID idCite){
		//delete livre from db
		citeService.deleteCite(idCite);
		
		return new ResponseEntity<String>("Suppression Reussie", HttpStatus.OK);
	}
	
	@GetMapping("/syncOut")
	//http://localhost:9000/api/Cite/syncOut
	public List<Cites> getCiteUpdateClientFalse(){
		return citeService.getCiteUpdateClientFalse();
	}
	
	@PutMapping("/change/{idCite}")
	//http://localhost:8080/api/change/id
	public ResponseEntity<Cites> UpdateClientTrue(@PathVariable("idCite") UUID idCite, @RequestBody Cites cite) {
		
		//System.out.println(cite);
	return new ResponseEntity<Cites>(citeService.updateClientTrue(cite, idCite), HttpStatus.OK);
		
	}

}
