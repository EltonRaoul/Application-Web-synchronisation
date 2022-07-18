package com.server.api.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.api.Models.Cites;

@Repository
public interface CiteRepository extends JpaRepository<Cites, UUID> {
	
	List <Cites> findByUpdateClient(boolean updateClient);

}
