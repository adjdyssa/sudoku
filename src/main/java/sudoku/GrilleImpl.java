/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import java.util.Arrays;
/**
 *
 * @author 128bits
 */
public class GrilleImpl implements Grille {
    private char[] caracteresautoriser;
   /**
* Caractere de case vide  
*/
static final char EMPTY = '@';
/**
* Caractere possible a mettre dans la grille
*
* pour une grille 9x9 : 1..9 jkhklhdd ld jdljdf lfklsfjdls 
*
* pour une grille 16x16: 0..9-a.. f
*/
static final char[] POSSIBLE = new char[] { '1', '2', '3', '4', '5', '6',
'7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f' };  
public static char[][] GRID_TO_SOLVE = {
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
private char [][] board;

/**
 * fonction grille imple.
 * @param grille 
 */
 public GrilleImpl(final char[][] grille) {
        this.board = grille;
    }
 /**
  * fonction principal.
  * @param args 
  */
    public static void main(String[] args) {
        // programme principal
    }
/**
 * fonction get dimenssion.
 * @return 
 */
    @Override
    public int getDimension() {
      
        return this.board.length ;
    }
    /**
     * fonction setvalue permet de definir une valeur.
     * @param x
     * @param y
     * @param value
     * @throws IllegalArgumentException 
     */
    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
       
  try {
      if ((0 < x ) && (x < this.getDimension())  && (0 < y ) && (y < this.getDimension()) ) {
          
 
            if (possible(x, y, value)) {
                
                
                this.board[x][y] = value;
                
            }
      }
      
        } catch (Exception e) {
            throw new IllegalArgumentException("indices ou valeur incorrectes");
        }
    
    }
    /**
     * fonction getvalue.
     * @param x
     * @param y
     * @return
     * @throws IllegalArgumentException 
     */
    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
       
        if ((0 < x ) && (x < this.getDimension())  && (0 < y ) && (y < this.getDimension()) ) {
            return this.board[x][y];
        } else {
            throw new IllegalArgumentException("indices incorrectes ou innexistant");
        }
    
    }
    /**
     * fonction test complet.
     * @return 
     */
    @Override
    public boolean complete(){  
         return !Arrays.stream(this.board).anyMatch("@"::equals);
       
    }
    /**
     * fontion possible.
     * @param x
     * @param y
     * @param value
     * @return
     * @throws IllegalArgumentException 
     */
@Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
                 caracteresautoriser = Arrays.copyOfRange(POSSIBLE, 0, getDimension());
          
                 int verif = 0;
                 
             for (int k = 0; k < caracteresautoriser.length; k++) {
             if (caracteresautoriser[k] == value) {
        // do something
     verif = 1;
        break;
                }
                }                
             if ( verif == 0) {
                 
                return false ;
             }
        
        for (int i = 0; i < this.getDimension() ; i++) {
   	if (this.board[x][i] == value){
            return false;                  
             }
  	 }
        for (int j = 0; j < this.getDimension() ; j++){
   
   	if (board[y][j] == value){
            return false;                  
             }
  	
     }    	
      return true;        
    }
    
}