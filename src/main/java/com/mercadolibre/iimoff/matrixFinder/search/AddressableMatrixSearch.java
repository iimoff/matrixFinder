package com.mercadolibre.iimoff.matrixFinder.search;

import java.util.Set;

public abstract class AddressableMatrixSearch {	

		
	/**
	 * @author iimoff
	 * Prototype method to extend each one of the search algorithm
	 * @param matrix were the keys will be find
	 * @param searchedKeys keys to find into the array
	 * @param requiredHits char secuence required to be a hit
	 * @param rowIndex matrix current row index
	 * @param colIndex matrix current col index
	 * @return boolean true if is a is a positive search
	 */
	public abstract boolean execute(String [] matrix, Set<String> hittedCells ,String searchedKeys, 
						int requiredHits , int rowIndex, int colIndex) throws IndexOutOfBoundsException;
	
	/**
	 * @author iimoff
	 * compares two chars in order to know if this is a hit
	 * @param c1 char to compare
	 * @param c2 char to compare
	 * @return true if it is a hit
	 */
	protected boolean isAKeyHit(char c1, char c2) {
		return c1 == c2;
	}	
	
	/**
	 * @author iimoff
	 * verify if the secuence fits into a the remaining search direction array
	 * to do this compares the number of cells hitted until now, the remaining 
	 * cells until the matrix border and the amount of cells that I need in order 
	 * to complete the secuence, if the secuence fits return true, if there is no
	 * change to put the remainings cells in the direction array it will return 
	 * false. 
	 * @param totalLenght direction array lenght
	 * @param currentIndex  of the direcction array
	 * @param secuenceLength min required amount of cells to be a hit
	 * @param acumSec hitted cells acum until now.
	 * @return
	 */
	protected boolean secuenceFits(int totalLenght, int currentIndex, int secuenceLength, int acumSec) {
		return currentIndex >= 0 && (totalLenght - currentIndex) >= (secuenceLength - acumSec);
	}
	
	/**
	 * @author iimoff
	 * verify if the secuence isn't complete
	 * @param secuenceLength min required amount of cells to be a hit
	 * @param acumHits hitted cells acum until now.
	 * @return true if the accum is smaller than secuencehits
	 */
	protected boolean isNotSecuenceCompleted(int secuenceLength, int acumHits) {
		return acumHits < secuenceLength;
	}
	
	/**
	 * @author iimoff
	 * vereify is the cell passed as parameter is contained into
	 * the searched keys.
	 * @param searchedKeys keys to find in order to get a positive hit
	 * @param key current key to evalute
	 * @return true if that key is contained into the searched keys
	 */
	protected boolean isASearchedKey(String searchedKeys, char key) {
		return searchedKeys.indexOf(key) >= 0;
	}
	
	/***
	 * @author iimoff
	 * Verify if the coors passed as parameter, where impacted as 
	 * a positive hit 
	 * @param hittedCells cells hitted until now
	 * @param row current row index
	 * @param col current col index
	 * @return true if the current coords were hitted
	 */
	protected boolean isAHittedCell(Set<String>hittedCells, int row, int col) {
		StringBuilder cell = new StringBuilder(String.valueOf(row)).append(String.valueOf(col));	
		return hittedCells.contains(cell.toString());
	}
	
	
	/***
	 * @author iimoff
	 * return a string with the coords appended like "00"
	 * @param row matrix row index
	 * @param col matrix col index 
	 * @return
	 */
	protected String getCoordsPair(int row, int col) {
		StringBuilder coord = new StringBuilder(Integer.toString(row));		
		return coord.append(col).toString();
	}

	
	
	/***
	 * @author iimoff
	 * marks a cell as hitted into the hittedCells Set
	 * @param hittedCells Set of hitted cells
	 * @param row matrix col index
	 * @param col matrix row index
	 */
	protected void addHittedCell(Set<String>hittedCells, int row, int col) {		
		hittedCells.add(getCoordsPair(row,col));
	}
	
	
	
	
}
