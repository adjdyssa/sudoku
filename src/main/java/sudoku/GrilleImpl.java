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

    /**
     * Caractere autoriser.
     */
    private char[] caracteresautoriser;
    /**
     * Caractere de case vide.
     */
    static final char EMPTY = '@';
    /**
     * Caractere possible a mettre dans la grille.
     *
     * pour une grille 9x9 : 1..9 
     *
     * pour une grille 16x16: 0..9-a.. f
     */
    static final char[] POSSIBLE = new char[]{'1', '2', '3', '4', '5', '6',
        '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f'};
    /**
     * grille a solutionner.
     */
    private static final  char[][] GRID_TO_SOLVE = {
        {'9', '0', '0', '1', '0', '0', '0', '0', '5'},
        {'0', '0', '5', '0', '9', '0', '2', '0', '1'},
        {'8', '0', '0', '0', '4', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '8', '0', '0', '0', '0'},
        {'0', '0', '0', '7', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '2', '6', '0', '0', '9'},
        {'2', '0', '0', '3', '0', '0', '0', '0', '6'},
        {'0', '0', '0', '2', '0', '0', '9', '0', '0'},
        {'0', '0', '1', '9', '0', '4', '5', '7', '0'}, };
    /**
     * board  grille de travail.
     */
    private char[][] board;

    /**
     * fonction grille imple.
     *
     * @param grille initialisation grille
     */
    public GrilleImpl(final char[][] grille) {
        this.board = grille;
    }

    /**
     * fonction principal.
     *
     * @param args info arguments
     */
    public static void main(final String[] args) {
        // programme principal
    }

    /**
     * fonction get dimenssion.
     *
     * @return
     */
    @Override
    public final int getDimension() {

        return this.board.length;
    }

    /**
     * fonction setvalue permet de definir une valeur.
     *
     * @param x
     * @param y
     * @param value
     * @throws IllegalArgumentException
     */
    @Override
public final void setValue(final int x, final int y, final char value)
        throws IllegalArgumentException {
 
        try {
if ((0 < x) && (x < this.getDimension())
        && (0 < y) && (y < this.getDimension())) {
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
     *
     * @param x
     * @param y
     * @return
     * @throws IllegalArgumentException
     */
    @Override
public final char getValue(final int x, final int y)
        throws IllegalArgumentException {
if ((0 < x) && (x < this.getDimension())
&& (0 < y) && (y < this.getDimension())) {
            return this.board[x][y];
        } else {
throw new IllegalArgumentException("indices incorrectes ou innexistant");
        }
    }

    /**
     * fonction test complet.
     *
     * @return
     */
    @Override
    public final boolean complete() {
        return !Arrays.stream(this.board).anyMatch("@"::equals);
    }

    /**
     * fontion possible.
     *
     * @param x
     * @param y
     * @param value
     * @return
     * @throws IllegalArgumentException
     */
    @Override
public final boolean possible(final int x, final int y, final char value)
throws IllegalArgumentException {
        caracteresautoriser = Arrays.copyOfRange(POSSIBLE, 0, getDimension());

        int verif = 0;

        for (int k = 0; k < caracteresautoriser.length; k++) {
            if (caracteresautoriser[k] == value) {
                // do something
                verif = 1;
                break;
            }
        }
        if (verif == 0) {

            return false;
        }

        for (int i = 0; i < this.getDimension(); i++) {
            if (this.board[x][i] == value) {
                return false;
            }
        }
        for (int j = 0; j < this.getDimension(); j++) {

            if (board[y][j] == value) {
                return false;
            }

        }
        return true;
    }



  /*
fonction solution.

@return boolean 
*/
    public boolean solution() {
        for (int row = 0; row < this.getDimension(); row++) {
         for (int col = 0; col < this.getDimension(); col++) {
          // recherche de cellule vide
          if (board[row][col] == EMPTY ) {
            // essai de nombre possible
            for (int number = 1; number <= this.getDimension(); number++) {
              if (this.possible(row, col, (char) number)) {
                // respect des contrainte de sudoku
                this.board[row][col] = (char) number;
                
                
                if (solution()) { //rappel de la methode de facon recursive pour trouver la solution
                  return true;
                } else { // si ce n'est pas la solution on vide la cellule 
                 this.board[row][col] = EMPTY ;
                }
             }
            }

            return false; 
           }
          }
         }

         return true; 
	} 
    
    


}

