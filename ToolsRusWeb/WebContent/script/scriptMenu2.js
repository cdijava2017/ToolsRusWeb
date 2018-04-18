/**
 * Controles de saisie Js
 * @param formBase d'information
 * @returns
 */

window.onload=initAll;

function initAll(){
	className = "tablink";
	name = "Enrichir la base";
	
	listButtons = document.getElementsByClassName(className);
					
	for(i = 0 ; i < listButtons.length ; i++){
		button = listButtons[i];
		if(button.innerHTML === name) 
			button.click();
	}
}


