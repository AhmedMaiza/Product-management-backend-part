package com.ahmed.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahmed.produits.entities.Categorie;

@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	
	
}