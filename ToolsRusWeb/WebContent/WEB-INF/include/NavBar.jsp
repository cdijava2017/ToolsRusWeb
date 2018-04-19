<%@ taglib prefix="s" uri="/struts-tags" %>

<header>

	<nav>
			<!--<s:a namespace="/uc4" action="accueilUc4" ></s:a>-->

	<button class="tablink" onclick="openPage('accueil', this, 'red')" >Accueil</button>
	<button class="tablink" onclick="openPage('connexion', this, 'green')" id="defaultOpen">Connexion</button>
	<button class="tablink" onclick="openPage('ingredients', this, 'blue')" >Ingredients</button>
	<button class="tablink" onclick="openPage('parleApresMoi', this, 'orange')" >Parle après moi</button> 
	<button class="tablink" onclick="openPage('enrichirLaBase', this, '#c61717')">Enrichir la base</button>
	<button class="tablink" onclick="openPage('humeur', this, '#E3084D')" >Humeur</button>
	<button class="tablink" onclick="openPage('commentaire', this, 'orange')" >Commentaire</button>
	<button class="tablink" onclick="openPage('passeAuTableau', this, 'orange')" >Passe au tableau</button>


		<div id="accueil" class="tabcontent">
		  <h3>Accueil</h3>
		  <p>Mettre un descriptif</p>
		</div>
		
		<div id="connexion" class="tabcontent">
		  <h3>Connexion</h3>
		  <p>Mettre un descriptif</p> 
		</div>
		
		<div id="ingredients" class="tabcontent">
		  <h3>Ingredients</h3>
		  <p>Mettre un descriptif</p>
		</div>
		
		<div id="parleApresMoi" class="tabcontent">
		  <h3>About</h3>
		  <p>Mettre un descriptif</p>
		</div>
		
		<div id="enrichirLaBase" class="tabcontent">
		  <h3>Enrichir la base</h3>
		  <p>Dans cette partie, vous pouvez ajouter un mot ou une image afin d'enrichir la base d'information.</p>
		</div>
		
		<div id="humeur" class="tabcontent">
		  <h3>Humeur</h3>
		  <p>Mettre un descriptif</p>
		</div>
		
		<div id="commentaire" class="tabcontent">
		  <h3>Commentaire</h3>
		  <p>Mettre un descriptif</p>
		</div>
		
		<div id="passeAuTableau" class="tabcontent">
		  <h3>Passe au tableau</h3>
		  <p>Mettre un descriptif</p>
		</div>

		<script src="<%=request.getContextPath()%>/script/scriptMenu.js" charset="UTF-8"></script>

	</nav>

</header>

