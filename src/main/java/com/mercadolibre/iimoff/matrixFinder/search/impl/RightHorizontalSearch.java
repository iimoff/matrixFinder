package com.mercadolibre.iimoff.matrixFinder.search.impl;


import java.util.HashSet;
import java.util.Set;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class RightHorizontalSearch extends AddressableMatrixSearch {

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
