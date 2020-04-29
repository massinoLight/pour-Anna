package main;



import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Phrase extends ArrayList< String > {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Tableau contenant les 'Mot Vide' possibles.
     * Reference : https://www.ranks.nl/stopwords/french
     */
	
    public static String [] MOT_VIDE = {
            "alors", "au", "aucuns", "aussi", "autre", "avant", "avec", "avoir",
            "bon", "ca", "car", "ce", "cela", "ces", "ceux", "chaque", "ci",
            "comme", "comment", "dans", "debut", "dedans", "dehors", "depuis",
            "des", "devrait", "doit", "donc", "dos", "du", "elle", "elles", "en",
            "encore", "essai", "est", "et", "etaient", "etat", "ete", "etions",
            "etre", "eu", "fait", "faites", "fois", "font", "hors", "ici", "il",
            "ils", "je", "juste", "la", "la", "le", "les", "leur", "ma",
            "maintenant", "mais", "meme", "mes", "mien", "moins", "mon", "mot",
            "ni", "nommes", "notre", "nous", "ou", "par", "parce", "pas", "peu",
            "peut", "plupart", "pour", "pourquoi", "quand", "que", "quel",
            "quelle", "quelles", "quels", "qui", "sa", "sans", "ses", "seulement",
            "si", "sien", "son", "sont", "sous", "soyez", "sujet", "sur", "ta",
            "tandis", "tellement", "tels", "tes", "ton", "tous", "tout", "tres",
            "trop", "tu", "voient", "vont", "votre", "vous", "vu"
    };

    public Phrase(){}

    public Phrase( Collection< String > collection ) {
        super( collection );
    }

    /**
     * QUESTION 3
     *
     * Enleve les 'Mot Vide' de la Phrase sans changer l'ordre des autres Mots.
     */ 
       
    
    
    public void nettoyer() {
    	 // code pour la question 3.
    	/*
    	 * on cree une nouvelle collection 
    	 * qui va contenir temporérement 
    	 * les valeurs de MOT_VIDE
    	 * (ne pas oublier de  passe notre collection en minuscule (pour le test6))
    	 * on Supprime alors de  notre collection pricipale tous les éléments 
    	 * contenus dans la collection temp
    	 * nous pouvons ensuite liberer la collection temp
    	 *  
    	 * **/
    	
    	List<String> temp=new ArrayList<String>();
    	for (int i = 0; i < MOT_VIDE.length; i++) {
			temp.add(i, MOT_VIDE[i]);			
		}
    	
    	/**
    	 * chercher si le mot figure dans MOT VIDE 
    	 * si oui le passer en minuscule
    	 * 
    	 * */
    	String minuscule="";
    	for (int i = 0; i < this.size(); i++) {
    		minuscule=this.get(i).toLowerCase();
    	
    		if (temp.indexOf(minuscule)!=-1) {
    			this.set(i,this.get(i).toLowerCase());
				
			}
        	    	
		}
    	
    	//supprimer MOT_VIDE de notre phrase
       	this.removeAll(temp);
        //liberer temp et lancer le garbage collector (ramasse miettes)
    	temp=null;
    	System.gc();
    	
    }
    
    
}
