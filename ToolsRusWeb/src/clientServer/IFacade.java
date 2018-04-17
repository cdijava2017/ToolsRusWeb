package clientServer;

import java.util.ArrayList;

import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.commentaire.CommentaireException;
import entity.uc3_Donner1Avis.compteur.Compteur;
import entity.uc3_Donner1Avis.compteur.CompteurVideException;
import entity.uc3_Donner1Avis.compteur.Compteurs;
import entity.uc3_Donner1Avis.titre.Titre;
import entity.uc3_Donner1Avis.titre.TitreVideException;
import entity.uc3_Donner1Avis.titre.Titres;

public interface IFacade {

	/**
	 * Partie de l'interface groupe qui fait référence aux méthodes de l'UC3 - Donner un avis (commenter)
	 * @param commentaire @param titre @param compteur @param ref
	 * 
	 * @throws CommentaireException 
	 * @author Nacer ATOUT
	 */
	
	public Commentaire addCommentaire(Commentaire commentaire) throws CommentaireException;
	public Titre addTitre(Titre titre) throws TitreVideException;
	public Compteur addCompteur(Compteur compteur) throws CompteurVideException;
	
	public void supAllCommentaires();
	public void supCommParId(int idComm) throws CommentaireException;
	public void supAllTitres();
	public void supAllCompteurs();
	
	public ArrayList<Commentaire> getAllCommParId() throws CommentaireException;
	public Titres getAllTitreParId();
	public Compteurs getAllCompteurParId();
	
	public Commentaire getCommParRef(int ref) throws CommentaireException;
	public Titre getTitreParRef(int ref);
	public Compteur getCompteurParRef(int ref);
	
	public void modifCommentaire(Commentaire commentaire);
	public void modifTitre(Titre titre);
	public void modifCompteur(Compteur compteur);
	public void incrementCompteur(int idCompteur);
	
}
