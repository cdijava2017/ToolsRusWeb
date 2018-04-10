package beanAction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AfficheMessageAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;
	
	public static final String MESSAGE = "HelloWorld";
	private String message;

	@Override
	 public String execute() throws Exception {
	 setMessage(MESSAGE);
	 return SUCCESS;
	 }

	public String getMessage() { return message; }

	public void setMessage(String message) {
		this.message = message;
	}

	// Gestion de l'heure (notez l'absence d'attribut – choix de gestion)
	public String getHeure() { return
			LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);}
}
