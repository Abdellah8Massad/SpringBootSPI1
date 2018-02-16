package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.repositories.CandidatRepository;

@Component
public class CandidatBusinessJPA implements CandidatBusiness{

	CandidatRepository repos;
	
	@Autowired
	public CandidatBusinessJPA(CandidatRepository repos) {
		this.repos = repos;
	}
	
	@Override
	public Candidat creerCandidat(Candidat newcandidat) {
		newcandidat.setEmail("mail@mail");
		return repos.save(newcandidat);
	}

	@Override
	public void supprimerCandidat(String id) {
		 repos.delete(id);
	}

	@Override
	public List<Candidat> rechercherParNom(String nom) {
		return repos.findByNom(nom);
	}

	@Override
	public List<Candidat> rechercherParUniv(String universiteOrigine) {
		return repos.findByUniversiteOrigine(universiteOrigine);
	}

	@Override
	public List<Candidat> recupererToutesLesCandidat() {
		return (List<Candidat>) repos.findAll();
	}
	

}
