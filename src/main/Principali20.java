package main;


import java.util.function.Function;

public class Principali20 {
    /**
     * QUESTION 1
     *
     * Cette methode tri le tableau.
     * Le tri est fait comme le tri slection, mais a chaque tour de la boucle
     * interne, vous devez choisir le minimum et le maximum.
     * Lorsque la boucle interne les a trouve, alors elle les places au bon
     * endroit.
     *
     * ************************************************************************
     * Placez votre analyse de complexite temporelle ici, analyse de pire cas :
     *
     *
     *
     *Anna dayi développes chwiya je ne sais 
     *pas amk vous faites et la methode que vous  suivez 
     *exactement biz 
     *et 3awed lahssab on ne sais jamais 
     *
     *Meilleur: tableau dejas trié
     *------------------------------
     *t(n)=an^2 +bn + c 
     *avec
     *a = (C5 / 8 + C5 / 8 + C7 / 8)
     *b = (C2 /2 + C3 /2 + C4 /4+C4 /2 +C5 /4+ C7 /4 + C9 /2 + C10 /2 + C11 /2+ C12 /2 +C13 /2 + C14 /2+ C15 /2)
     *c = (C1 + C2)
     *
     *Pire: t(n)=an^2 +bn + c 
     *-----------------------
     *a = (C5 / 8 + C5 / 8+ C6 / 8 + C7 / 8+ C8 / 8)
     *
     *b = (C2 / 2 + C3 / 2 + C4 /4+C4 /2 +C5 /4+ C6 /4+ C7 /4 +C8 /4+ C9 /2 + C10 /2 +C11 /2 + C12 /2 +C13 /2 + C14 /2+C15 /2)
     *
     *c = (C1 + C2 )
     *
     *si on replace les couts avec une unité de temps chacune Ci=1
     *alors on obtient 
     *T (n) = 5/8 n^2 + 25/4n + 2)
     *
     * ************************************************************************
     *
     * @param tab Le tableau a trier.
     * @param <E> Le type des elements du tableau.  Le tri utilise le comparateur
     *           de ce type (Comparable).
     */
    public static < E extends Comparable< E > >
    void triDoubleSelection( E [] tab ) {
        // Placez votre code ici pour la question 1.
    	int n=tab.length;
    	for (int i = 0, j = n - 1; i < j; i++, j--)  
	    { 
	        E min = tab[i], max = tab[i]; 
	        int min_i = i, max_i = i; 
	        for (int k = i; k <= j; k++)  
	        { 
	            if (tab[k].compareTo(max) > 0) 
	            { 
	                max = tab[k]; 
	                max_i = k; 
	            }  
	              
	            else if (tab[k].compareTo(min) < 0)  
	            { 
	                min = tab[k]; 
	                min_i = k; 
	            } 
	        } 
	  
	        // shifting the min. 
	        changer(tab, i, min_i); 
	        
	        if (tab[min_i] == max)  
	        	changer(tab, j, min_i); 
	        else
	        	changer(tab, j, max_i); 
	    } 
    	 

    }
    /**
     * cette fonction permet d'inverser entre deux
     * cases du tableu 
     * son role est d'uniquement rendre plus lisible le  code 
     * son cout en complexité est prit en compt 
     * cout(changer)=4
     * 
     * **/
    public static < E extends Comparable< E > >
    E[] changer( E [] T, int i, int j) 
	{ 
	    E temp = T[i]; 
	    T[i] = T[j]; 
	    T[j] = temp; 
	    return T; 
	}  

    /**
     * QUESTION 2
     *
     * type F : equals.
     *
     * ************************************************************************
     * Placez votre Lamda ici :
     *
     *
     *
     *
     * ************************************************************************
     *
     * @param tab Le tableau a classer.
     * @param classification Une fonction qui transforme les éléments en éléments utiliés
     *                       pour la comparaison et la classification.
     * @param <E> Type des éléments de bases
     * @param <F> Type des éléments transformés
     */
    public static < E, F >
    void classer( E [] tab, Function< E, F > classification ) {
        // Placez votre code ici pour la question 2.

    }




    public static void main( String [] argv ) {
    }
}
