package com.server.api.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.api.Models.Cites;

public interface CiteRepository extends JpaRepository<Cites, UUID> {
	
	List <Cites> findByUpdateClient(boolean updateClient);

}
