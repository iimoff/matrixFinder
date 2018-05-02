package com.mercadolibre.iimoff.matrixFinder.search.impl;


import java.util.HashSet;
import java.util.Set;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class RightHorizontalSearch extends AddressableMatrixSearch {

	/**
	 * @author iimoff
	 * Prototype method implementation to search left-right horizontal. This algorithm will
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
		
		while(colIndex+1 < matrix[rowIndex].length()
			&& !isAHittedCell(hittedCells, rowIndex, colIndex)
				&& secuenceFits(matrix[rowIndex].length(), colIndex, requiredHits, cellHits.size())
					&& isASearchedKey(searchedKeys, matrix[rowIndex].charAt(colIndex))
						&& isAKeyHit(matrix[rowIndex].charAt(colIndex), matrix[rowIndex].charAt(colIndex+1))					 											
							&& isNotSecuenceCompleted(requiredHits, cellHits.size()) ) {	

			/*IF THE NEXT CELL ISN'T A HITTED CELL*/
			if(!isAHittedCell(hittedCells, rowIndex, colIndex+1)){
				
				addHittedCell(cellHits, rowIndex, colIndex+1);		
			}
								
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
