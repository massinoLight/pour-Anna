package main;


public class Pile< E > {
    private class Chainon {
        public E valeur;
        public Chainon precedant;

        public Chainon( E valeur, Chainon precedant ) {
            this.valeur = valeur;
            this.precedant = precedant;
        }
    }

    protected Chainon sommet;

    /**
     * QUESTION 4
     *
     * Echange les deux premier chainons de place.
     *
     * Le chainon contenant le sommet et le chainon precedant sont echanges.
     * Ce N'EST PAS seulement les valeurs qui change, mais les chainons.
     * Cela va vous demander de deplacer les references (pointeur).
     *
     *
     * ************************************************************************
     * Placez vos explications ici :
     *
     *
     *Vérifier dans un premier lieu que la pile contient au moins
     *deux éléments 
     *si celle-ci n'en contient aucun (elle est vide) ne rien faire 
     *si elle contient uniquement un élement (apres le test)réempiler ce dérnier et ne rien faire 
     *si elle contient au plus deux éléments inverser entre ces deux 
     *
     *
     *
     * *
     * @throws ExceptionPileVide ***********************************************************************
     *
     */
    public void echanger() {
        // Placez votre code ici pour la question 4.
    	
    	if (!this.estVide()) {
    		
    		E tmp=null;
			try {
				tmp = this.depiler();
			} catch (ExceptionPileVide e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (!this.estVide()) {
				
				E tmp2=null;
				try {
					tmp2 = this.depiler();
					this.empiler(tmp);
				} catch (ExceptionPileVide e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				this.empiler(tmp2);
				//this.empiler(tmp);
				
			}else {
				this.empiler(tmp);
			}
    		
    		
			
		} 

    }

    public boolean estVide() {
        return null == sommet;
    }

    public E sommet() throws ExceptionPileVide {
        if( null == sommet ) {
            throw new ExceptionPileVide( "sommet" );
        }

        return sommet.valeur;
    }

    public void empiler( E valeur ) {
        sommet = new Chainon( valeur, sommet );
    }

    public E depiler() throws ExceptionPileVide {
        if( null == sommet ) {
            throw new ExceptionPileVide( "depiler" );
        }

        E temp = sommet.valeur;
        sommet = sommet.precedant;

        return temp;
    }
}
