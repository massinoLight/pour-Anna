package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Principali20;

class Principali20Test {

	 @Test
	    void triDoubleSelection1() {
		 
	        Integer [] t = {1};
	        Integer [] t_resultat = {1};
	        System.out.println("test 1");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();
	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }
	    @Test
	    void triDoubleSelection2() {
	    	
	        Integer [] t = {1, 0};
	        Integer [] t_resultat = {0, 1};
	        System.out.println("test 2");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();

	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }
	    @Test
	    void triDoubleSelection3() {
	    	
	        Integer [] t = {1, 4, 3};
	        Integer [] t_resultat = {1, 3, 4};
	        System.out.println("test 3");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();

	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }
	    @Test
	    void triDoubleSelection4() {
	    	
	        Integer [] t = {2, 6, 3, 8, 1, 5};
	        Integer [] t_resultat = {1, 2, 3, 5, 6, 8};
	        System.out.println("test 4");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();

	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }
	    
	  
	    
	    @Test
	    void triDoubleSelection5() {
	    	
	        Integer [] t = {5, 4, 3, 2, 1};
	        Integer [] t_resultat = {1, 2, 3, 4, 5};
	        System.out.println("test 5");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();

	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }
	    @Test
	    void triDoubleSelection6() {
	    	
	        Integer [] t = {5, 4, 3, 2, 1, 0};
	        Integer [] t_resultat = {0, 1, 2, 3, 4, 5};
	        System.out.println("test 6");
	        for (int i = 0; i < t_resultat.length; i++) {
				System.out.print(" "+t_resultat[i]);
			}
	        System.out.println();

	        Principali20.triDoubleSelection( t );

	        assertArrayEquals( t_resultat, t );
	    }

}
