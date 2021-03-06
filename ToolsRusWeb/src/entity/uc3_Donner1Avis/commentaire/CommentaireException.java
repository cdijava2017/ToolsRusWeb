package entity.uc3_Donner1Avis.commentaire;

public class CommentaireException extends Exception {

	private static final long serialVersionUID = 1L;

	private int code;
	
	public CommentaireException() {	}
	
	public CommentaireException(String message) {
		super(message);
	}

	public CommentaireException(String message, int code) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
