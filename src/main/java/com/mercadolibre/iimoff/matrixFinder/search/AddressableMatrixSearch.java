package com.mercadolibre.iimoff.matrixFinder.search;

import java.util.Set;

public abstract class AddressableMatrixSearch {	

		
	/**
	 * 
	 * @param matrix
	 * @param searchedKeys
	 * @param requiredHits
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 */
	public abstract boolean execute(String [] matrix, Set<String> hittedCells ,String searchedKeys, 
						int requiredHits , int rowIndex, int colIndex) throws IndexOutOfBoundsException;
	
	/**
	 * 
	 * @param c1
	 * @param c2
	 * @return
	 */
	protected boolean isAKeyHit(char c1, char c2) {
		return c1 == c2;
	}	
	
	/**
	 * 
	 * @param totalLenght
	 * @param currentIndex
	 * @param secuenceLength
	 * @param acumSec
	 * @return
	 */
	protected boolean secuenceFits(int totalLenght, int currentIndex, int secuenceLength, int acumSec) {
		return currentIndex >= 0 && (totalLenght - currentIndex) >= (secuenceLength - acumSec);
	}
	
	/**
	 * 
	 * @param secuenceLength
	 * @param acumHits
	 * @return
	 */
	protected boolean isNotSecuenceCompleted(int secuenceLength, int acumHits) {
		return acumHits < secuenceLength;
	}
	
	/**
	 * 
	 * @param searchedKeys
	 * @param key
	 * @return
	 */
	protected boolean isASearchedKey(String searchedKeys, char key) {
		return searchedKeys.indexOf(key) >= 0;
	}
	
	/***
	 * 
	 * @param hittedCells
	 * @param row
	 * @param col
	 * @return
	 */
	protected boolean isAHittedCell(Set<String>hittedCells, int row, int col) {
		StringBuilder cell = new StringBuilder(String.valueOf(row)).append(String.valueOf(col));	
		return hittedCells.contains(cell.toString());
	}
	
	
	/***
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	protected String getCoordsPair(int row, int col) {
		StringBuilder coord = new StringBuilder(Integer.toString(row));		
		return coord.append(col).toString();
	}

	
	
	/***
	 * 
	 * @param hittedCells
	 * @param row
	 * @param col
	 */
	protected void addHittedCell(Set<String>hittedCells, int row, int col) {		
		hittedCells.add(getCoordsPair(row,col));
	}
	
	
	
	
}
