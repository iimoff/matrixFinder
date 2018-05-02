package com.mercadolibre.iimoff.matrixFinder.search.impl;

import java.util.HashSet;
import java.util.Set;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class DownRightDiagonalSearch extends AddressableMatrixSearch{

	/**
	 * @author iimoff
	 * Prototype method implementation to search down-right diagonal into the matrix. This algorithm will
	 * keep on serching while the next cell in the directional array is 
	 * equals to the current one, and the secuence fit, and the next cell isn't a hit and 
	 * the secuence isn't completed yet
	 * if some of those conditions is false, the directonal search imediatly ends
	 * in order to avoid innecesary loops.
	 * @param matrix were the keys will be find
	 * @param searchedKeys keys to find into the array
	 * @param requiredHits char secuence required to be a hit
	 * @param rowIndex matrix current row index
	 * @param colIndex matrix current col index
	 * @return boolean true if is a is a positive search
	 */
	@Override
	public boolean execute(String[] matrix, Set<String> hittedCells, String searchedKeys, int requiredHits,
			int rowIndex, int colIndex) throws IndexOutOfBoundsException {		
		
		Set<String> cellHits = new HashSet<String>();
		
		addHittedCell(cellHits, rowIndex, colIndex);
		
		int matrixRows = matrix.length;
		int matrixCols = matrix[0].length();		
		
		while(rowIndex+1 < matrixRows && colIndex+1 < matrixCols
			&& !isAHittedCell(hittedCells, rowIndex, colIndex)
				&& secuenceFits(matrixRows, rowIndex, requiredHits, cellHits.size())
					&& isASearchedKey(searchedKeys, matrix[rowIndex].charAt(colIndex))
						&& isAKeyHit(matrix[rowIndex].charAt(colIndex), matrix[rowIndex+1].charAt(colIndex+1))						
							&& isNotSecuenceCompleted(requiredHits, cellHits.size()) ){			
			/*IF THE NEXT CELL ISN'T A HITTED CELL*/
			if(!isAHittedCell(hittedCells, rowIndex+1, colIndex+1)){
				addHittedCell(cellHits, rowIndex+1, colIndex+1);				
			}
			rowIndex++;
			colIndex++;
		}
		
		if(isNotSecuenceCompleted(requiredHits, cellHits.size())) {
			return false;		
			
		}else {
			hittedCells.addAll(cellHits);
			return true;
		}
	}
}