package com.mercadolibre.iimoff.matrixFinder.search.funtional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;
import com.mercadolibre.iimoff.matrixFinder.search.impl.DownLeftDiagonalSearch;
import com.mercadolibre.iimoff.matrixFinder.search.impl.DownRightDiagonalSearch;
import com.mercadolibre.iimoff.matrixFinder.search.impl.DownVerticalSearch;
import com.mercadolibre.iimoff.matrixFinder.search.impl.RightHorizontalSearch;

public class CoreSearchTest {
	
	public static final int MATRIX_ROWS = 6;
	public static final int MATRIX_COLS = 6;
	public static final int SECUENCE_CELLS_HITS = 4;
	public static final int MIN_HITS = 2;
	public static final String SEARCHED_KEYS = "ATCG";
	
	protected AddressableMatrixSearch [] searchDirections = {
			new RightHorizontalSearch(),
			new DownRightDiagonalSearch(),
			new DownVerticalSearch(),				
			new DownLeftDiagonalSearch()
	}; 		
	
	private boolean findSecuences(String[]matrix) {	
		
		int i = 0;
		int countHits = 0;
		Set<String> cellsHitted = new HashSet<String>();		
		/*MIENTRAS TENGA ELEMENTOS Y TODAVIA NO ENCONTRE LA CANTIDAD DE HITS NECESARIOS RECORRO LOS ROWS*/
		while(i < MATRIX_ROWS && countHits < MIN_HITS) {			
			int j = 0;			
			while(j < MATRIX_COLS && countHits < MIN_HITS) {								
				int x = 0;
				boolean isHit = false;				
				/*MIENTRAS TENGA VALIDADIONES PARA EJECUTAR Y EL CONTADOR DE MUTANTES SEA MENOR 
				 * A LO REQUERIDO */
				while(x < searchDirections.length && countHits < MIN_HITS ) {					
					isHit = searchDirections[x].execute(matrix, cellsHitted ,SEARCHED_KEYS, SECUENCE_CELLS_HITS, i, j);					
					if(isHit) {
						/*CONSTRUIR UN NUEVO REGISTRO CON EL ADN MARCADO COMO MUTANTE*/
						countHits++;
					}						
					x++;
				}
				j++;
			}
			i++;			
		}		
		return countHits >= MIN_HITS;		
	}
	
	
	@Test
	public void isHorizontalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"AAAAAA",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"AAAAAA"
		};
		
		assertTrue("isHorizontalHit must be true", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void isVerticallHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"AQQQQA",
							"AQQQQA",
							"AQQQQA",
							"AQQQQA",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertTrue("isVerticallHit must be true", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void isDownRightDiagonalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"AQAQQQ",
							"QAQAQQ",
							"QQAQAQ",
							"QQQAQA",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertTrue("isDownRightDiagonalHit must be true", coreTest.findSecuences(matrix));    
		
	}

	
	@Test
	public void isDownLeftDiagonalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQQAQQ",
							"QQAQQQ",
							"QAQQQA",
							"AQQQAQ",
							"QQQAQQ",
							"QQAQQQ"
		};
		
		assertTrue("isDownLeftDiagonalHit must be true", coreTest.findSecuences(matrix));    
		
	}

	
	@Test
	public void isProvidedExampleMatrixHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String [] matrix = {
							"ATGCGA",
							"CAGTGC",
							"TTATGT",
							"AGAAGG",
							"CCCCTA",
							"TCACTG"						
						};
				
		assertTrue("isProvidedExampleMatrixHit must be true", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void doesNotMatchTest() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String [] matrix = {
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ"						
						};
				
		assertFalse("doesNotMatchTest must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void verticalDoesNotFit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String [] matrix = {
							"AQQQQQ",
							"AQQQQQ",
							"AQAQQQ",
							"QQAQQA",
							"QQAQQA",
							"QQQQQA"						
						};
				
		assertFalse("verticalDoesNotFit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void horizontalDoesNotFit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String [] matrix = {
							"AAAQQQ",
							"QQQQQQ",
							"QQAAAQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQAAA"						
						};
				
		assertFalse("horizontalDoesNotFit must be false", coreTest.findSecuences(matrix));		
	}
	
	
	@Test
	public void downRightDiagonalDoesNotFit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"AQQQQQ",
							"QAQAQQ",
							"QQAQAQ",
							"QQQQQA",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("downRightDiagonalDoesNotFit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void downLeftDiagonalDoesNotFit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQQQQQ",
							"QQAQQQ",
							"QAQQQA",
							"AQQQAQ",
							"QQQAQQ",
							"QQQQQQ"
		};
		
		assertFalse("downLeftDiagonalDoesNotFit must be false", coreTest.findSecuences(matrix));    
		
	}	
	
	@Test
	public void downLeftDiagonalOverVerticallHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QAQQAQ",
							"QAQAQQ",
							"QAAQQQ",
							"QAQQQQ",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("downLeftDiagonalOverHorizontalHit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void downrRightDiagonalOverHorizontalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQQQQQ",
							"QQQQQQ",
							"QAAAAQ",
							"QQQAQQ",
							"QQQQAQ",
							"QQQQQA"
		};
		
		assertFalse("downrRightDiagonalOverHorizontalHit must be true", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void horizontalOverVerticallHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QAQQQQ",
							"QAQQQQ",
							"QAQQQQ",
							"QAAAAQ",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("horizontalOverVerticallHit must be false", coreTest.findSecuences(matrix));    
		
	}
		
			
	@Test
	public void oneHorizontalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"AAAAAA",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("oneHorizontalHit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void oneVerticallHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQQQQA",
							"QQQQQA",
							"QQQQQA",
							"QQQQQA",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("oneVerticallHit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void oneDownRightDiagonalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQAQQQ",
							"QQQAQQ",
							"QQQQAQ",
							"QQQQQA",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("oneDownRightDiagonalHit must be false", coreTest.findSecuences(matrix));    
		
	}
	
	
	@Test
	public void oneDownLeftDiagonalHit() {
		
		CoreSearchTest coreTest = new CoreSearchTest();
		
		String[]matrix = {
							"QQQAQQ",
							"QQAQQQ",
							"QAQQQQ",
							"AQQQQQ",
							"QQQQQQ",
							"QQQQQQ"
		};
		
		assertFalse("oneDownLeftDiagonalHit must be false", coreTest.findSecuences(matrix));    
		
	}	
}
