package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;

public interface FormationBusiness {
	
	//default Formation creerFormation(Formation newformation) {
	//	return null;
	//}
	
	Formation creerFormation(Formation newformation);
	List<Formation> rechercherParNom(String nom);
	List<Formation> recupererToutesLesFormation();
}
