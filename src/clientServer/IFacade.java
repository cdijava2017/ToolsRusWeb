package clientServer;

import java.util.List;

import entity.gestionAcces.Profil;
import entity.gestionAcces.Role;
import entity.gestionAcces.User;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.commentaire.CommentaireVideException;
import entity.uc3_Donner1Avis.commentaire.Commentaires;
import entity.uc3_Donner1Avis.compteur.Compteur;
import entity.uc3_Donner1Avis.compteur.CompteurVideException;
import entity.uc3_Donner1Avis.compteur.Compteurs;
import entity.uc3_Donner1Avis.titre.Titre;
import entity.uc3_Donner1Avis.titre.TitreVideException;
import entity.uc3_Donner1Avis.titre.Titres;
import exception.gestionAcces.DoublonException;
import exception.gestionAcces.IdException;

public interface IFacade {

	/**
	 * Partie de l'interface groupe qui fait référence aux méthodes de l'UC3 - Donner un avis (commenter)
	 * @param commentaire @param titre @param compteur @param ref
	 * 
	 * @throws CommentaireVideException 
	 * @author Nacer ATOUT
	 */
	
	public Commentaire addCommentaire(Commentaire commentaire) throws CommentaireVideException;
	public Titre addTitre(Titre titre) throws TitreVideException;
	public Compteur addCompteur(Compteur compteur) throws CompteurVideException;
	
	public void supAllCommentaires();
	public void supCommParId(Commentaire commentaire);
	public void supAllTitres();
	public void supAllCompteurs();
	
	public Commentaires getAllCommParId();
	public Titres getAllTitreParId();
	public Compteurs getAllCompteurParId();
	
	public Commentaire getCommParRef(int ref);
	public Titre getTitreParRef(int ref);
	public Compteur getCompteurParRef(int ref);
	
	public void modifCommentaire(Commentaire commentaire);
	public void modifTitre(Titre titre);
	public void modifCompteur(Compteur compteur);
	/**
	 * 
	 */

	// =========================================================================================================
	/**
	 * Partie de l'interface implement User
	 * 
	 * @author Ousseynou
	 * @param user
	 * @throws UserException
	 * @throws DoublonException
	 * @throws IdException
	 */

	public User addNewUser(User user) throws UserException, DoublonException, IdException;

	public User updUser(User user) throws UserException;

	public void delUser(User user) throws UserException;

	public void delUserByid(int id) throws UserException;

	public User getUser(int id) throws UserException;

	public void removeNativeUser();

	/**
	 * implement profil
	 * 
	 * @param profil
	 */
	public Profil addNewProfile(Profil profil) throws UserException;

	public Profil updProfile(Profil profil) throws UserException;

	public void delProfile(Profil profil) throws UserException;

	public void delProfileByid(int id) throws UserException;

	public Profil getProfil(int id) throws UserException;

	public void removeNativeProfil();

	/**
	 * implement La classe mere abstraite Role pour
	 * Participant,Animateur,SuperAdministrateur
	 * 
	 * @param role
	 * @throws UserException
	 */
	public Role addRole(Role role) throws UserException;

	public Role updRole(Role role) throws UserException;

	public void delRole(Role role);

	public Role getRole(int id) throws UserException;

	public void delRoleByid(int id) throws UserException;

	public void removeNativeRole();

	/*
	 * Dao_Liste_Acces
	 */
	// PRofil List
	public List<Profil> getAllbyProfilById();

	public List<Profil> getAllbyProfilByNom();

	public List<Profil> getAllbyProfilByPrenom();

	// User List
	public List<User> getAllbyUserById();

	public List<User> getAllbyUserByPseudo();

	// FIN-Ousseynou********************************************************************************************

	/**
	 * implement Image
	 * 
	 * @param
	 */

}
