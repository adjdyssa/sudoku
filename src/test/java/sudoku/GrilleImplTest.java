/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 128bits
 */
public class GrilleImplTest {
    
    public GrilleImplTest() {
    }
    
    
    
    
    /**
     * Test de la methode main de  GrilleImpl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GrilleImpl.main(args);
       
    }

    /**
     * Test de la methode getdimension class GrilleImpl.
     */
    @Test
    public void testGetDimension() {
        System.out.println("getDimension");
   
        char[][] GRID_TO_SOLVE = {
			{'9','0','0','1','0','0','0','0','5'},
                        {'0','0','5','0','9','0','2','0','1'},
                        {'8','0','0','0','4','0','0','0','0'},
                        {'0','0','0','0','8','0','0','0','0'},
                        {'0','0','0','7','0','0','0','0','0'},
                        {'0','0','0','0','2','6','0','0','9'},
                        {'2','0','0','3','0','0','0','0','6'},
                        {'0','0','0','2','0','0','9','0','0'},
                        {'0','0','1','9','0','4','5','7','0'},
	};
        
        
        GrilleImpl instance = new GrilleImpl(GRID_TO_SOLVE);
        int expResult = 9;
        int result = instance.getDimension();
        assertEquals(expResult, result);
        
    }

    /**
     * Test de la methode testsetvalue GrilleImpl.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        
        
         char[][] GRID_TO_SOLVE = {
			{'9','0','0','1','0','0','0','0','5'},
                        {'0','0','5','0','9','0','2','0','1'},
                        {'8','0','0','0','4','0','0','0','0'},
                        {'0','0','0','0','8','0','0','0','0'},
                        {'0','0','0','7','0','0','0','0','0'},
                        {'0','0','0','0','2','6','0','0','9'},
                        {'2','0','0','3','0','0','0','0','6'},
                        {'0','0','0','2','0','0','9','0','0'},
                        {'0','0','1','9','0','4','5','7','0'},
	};
       
          
        GrilleImpl instance = new GrilleImpl(GRID_TO_SOLVE);
        
        
        
        int x = 0;
        int y = 0;
        char value = '2';
       
    instance.setValue(x, y, value);
         
    }

    /**
     * Test de la methode getValue de la class GrilleImpl.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        
         char[][] GRID_TO_SOLVE = {
			{'9','0','0','1','0','0','0','0','5'},
                        {'0','0','5','0','9','0','2','0','1'},
                        {'8','0','0','0','4','0','0','0','0'},
                        {'0','0','0','0','8','0','0','0','0'},
                        {'0','0','0','7','0','0','0','0','0'},
                        {'0','0','0','0','2','6','0','0','9'},
                        {'2','0','0','3','0','0','0','0','6'},
                        {'0','0','0','2','0','0','9','0','0'},
                        {'0','0','1','9','0','4','5','7','0'},
	};
       
          
        GrilleImpl instance = new GrilleImpl(GRID_TO_SOLVE);
        
        
        
        int x = 1;
        int y = 1;
      
        char expResult = '0';
        char result = instance.getValue(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test de la methode complete de la class GrilleImpl.
     */
    @Test
    public void testComplete() {
        System.out.println("complete");
        char[][] GRID_TO_SOLVE = {
			{'9','0','0','1','0','0','0','0','5'},
                        {'0','0','5','0','9','0','2','0','1'},
                        {'8','0','0','0','4','0','0','0','0'},
                        {'0','0','0','0','8','0','0','0','0'},
                        {'0','0','0','7','0','0','0','0','0'},
                        {'0','0','0','0','2','6','0','0','9'},
                        {'2','0','0','3','0','0','0','0','6'},
                        {'0','0','0','2','0','0','9','0','0'},
                        {'0','0','1','9','0','4','5','7','0'},
	};
       
          
        GrilleImpl instance = new GrilleImpl(GRID_TO_SOLVE);
        boolean expResult = true;
        boolean result = instance.complete();
        assertEquals(expResult, result);
        
    }
    /**
     * Test de la methode possible de la class GrilleImpl.
     */
    @Test
    public void testPossible() {
        System.out.println("possible");
        
          char[][] GRID_TO_SOLVE = {
			{'9','0','0','1','0','0','0','0','5'},
                        {'0','0','5','0','9','0','2','0','1'},
                        {'8','0','0','0','4','0','0','0','0'},
                        {'0','0','0','0','8','0','0','0','0'},
                        {'0','0','0','7','0','0','0','0','0'},
                        {'0','0','0','0','2','6','0','0','9'},
                        {'2','0','0','3','0','0','0','0','6'},
                        {'0','0','0','2','0','0','9','0','0'},
                        {'0','0','1','9','0','4','5','7','0'},
	};
       
          
        GrilleImpl instance = new GrilleImpl(GRID_TO_SOLVE);
        
        
        
        int x = 1;
        int y = 1;
        char value = ' ';
      
        boolean expResult = false;
        boolean result = instance.possible(x, y, value);
        assertEquals(expResult, result);
        
    }
    
}
