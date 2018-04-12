function initAll(){
				className = "tablink";
				name = "Parle après moi"; // mettre ce qu'il y a entre les balises button de votre fonctionnalite
				
				listButtons = document.getElementsByClassName(className);
								
				for(i = 0 ; i < listButtons.length ; i++){
					button = listButtons[i];
					if(button.innerHTML === name) 
						button.click();
				}
			}

window.onload = initAll;