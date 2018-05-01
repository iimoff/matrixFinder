package com.mercadolibre.iimoff.matrixFinder.search.impl;

import java.util.HashSet;
import java.util.Set;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class DownVerticalSearch extends AddressableMatrixSearch{

	@Override
	public boolean execute(String[] matrix, Set<String> hittedCells, String searchedKeys, int requiredHits,
			int rowIndex, int colIndex)throws IndexOutOfBoundsException {
		
		Set<String> cellHits = new HashSet<String>();
		
		addHittedCell(cellHits, rowIndex, colIndex);		
		
		int matrixRows = matrix.length;
		int matrixCols = matrix[0].length();		
				
		while( rowIndex+1 < matrixRows && colIndex < matrixCols
				&& !isAHittedCell(hittedCells, rowIndex, colIndex)
					&& secuenceFits(matrixRows, rowIndex, requiredHits, cellHits.size())
						&& isASearchedKey(searchedKeys, matrix[rowIndex].charAt(colIndex))
							&& isAKeyHit(matrix[rowIndex].charAt(colIndex), matrix[rowIndex+1].charAt(colIndex))						
								&& isNotSecuenceCompleted(requiredHits, cellHits.size()) ){
			
			/*IF THE NEXT MATCH ISN'T A HITTED CELL*/
			if(!isAHittedCell(hittedCells, rowIndex+1, colIndex)) {
				addHittedCell(cellHits, rowIndex+1, colIndex);
			}				
			rowIndex++;			
		}
		
		if(isNotSecuenceCompleted(requiredHits, cellHits.size())) {
			return false;			
		}else {
			hittedCells.addAll(cellHits);
			return true;
		}		
	}

}