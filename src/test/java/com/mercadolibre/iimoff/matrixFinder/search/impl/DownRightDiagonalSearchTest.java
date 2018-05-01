package com.mercadolibre.iimoff.matrixFinder.search.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class DownRightDiagonalSearchTest {
	
	
	@Test
	public void downRightDiagonalTopTest(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("21");
		cellHitteds.add("32");
		cellHitteds.add("43");
		cellHitteds.add("01");
		cellHitteds.add("12");
		cellHitteds.add("23");
		cellHitteds.add("34");	
		
		assertTrue("downRightDiagonalTopTest must return true " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "43";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "34";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
				
		expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 12;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
	
	@Test
	public void downRightDiagonalBottomTest(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 2;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQAQ",
	        			"QQQQQA"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("21");
		cellHitteds.add("32");
		cellHitteds.add("43");
		cellHitteds.add("54");			
		
		assertTrue("downRightDiagonalBottomTest must return true " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "43";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "54";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "44";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "55";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));	
		
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}

	
	@Test
	public void downRightDiagonalMiddleTest(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 1;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQAQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("12");
		cellHitteds.add("23");
		cellHitteds.add("34");
		cellHitteds.add("45");			
		
		assertTrue("downRightDiagonalMiddleTest must return true " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "34";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "45";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));	
		
		expected = "44";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));	
		
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	@Test
	public void downRightDiagonalMiddleDoesntFitTest(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 1;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("12");
		cellHitteds.add("23");
		cellHitteds.add("34");
		cellHitteds.add("45");			
		
		assertFalse("downRightDiagonalMiddleDoesntFitTest must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "34";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "45";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
						
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}

	
	@Test
	public void downRightDiagonalBottomDoesNotFitTest(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 3;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQAQQ",
	        			"QQQQAQ",
	        			"QQQQQA"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("21");
		cellHitteds.add("32");
		cellHitteds.add("43");
		cellHitteds.add("54");			
		
		assertFalse("downRightDiagonalBottomDoesNotFitTest must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "43";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));		
		
		expected = "54";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));		
						
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	@Test
	public void downRightDiagonalTopTestDoesNotFit(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("21");
		cellHitteds.add("32");
		cellHitteds.add("43");
		cellHitteds.add("01");
		cellHitteds.add("12");
		cellHitteds.add("23");
		cellHitteds.add("34");	
		
		assertFalse("downRightDiagonalTopTestDoesNotFit must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "43";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "34";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
				
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
		
		
	}
	
	
	@Test
	public void downRightDiagonalTopTestDoesOverHittedCell(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQQQ",	
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("00");
		cellHitteds.add("01");
		cellHitteds.add("02");
		cellHitteds.add("03");
		
		assertFalse("downRightDiagonalTopTestDoesOverHittedCell must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "02";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
				
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
	
	@Test
	public void downRightDiagonalBottomTestOverHittedCell(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 2;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQAQ",
	        			"QQQQQA"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("52");
		cellHitteds.add("53");
		cellHitteds.add("54");
		cellHitteds.add("55");			
		
		assertFalse("downRightDiagonalBottomTestOverHittedCell must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "52";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "53";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "54";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "55";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));	
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
	
	@Test
	public void downRightDiagonalMiddleTestOverHittedCell(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 1;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QAQQQQ",
	        			"QQAQQQ",
	        			"QQQAQQ",
	        			"QQQQAQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("30");
		cellHitteds.add("31");
		cellHitteds.add("32");
		cellHitteds.add("33");			
		
		assertFalse("downRightDiagonalMiddleTestOverHittedCell must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String 	expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());		
		
	}
	
	
	@Test
	public void downRightDiagonalDoesNotMatch(){	
		
		AddressableMatrixSearch search = new DownRightDiagonalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("21");
		cellHitteds.add("32");
		cellHitteds.add("43");
		cellHitteds.add("01");
		cellHitteds.add("12");
		cellHitteds.add("23");
		cellHitteds.add("34");	
		
		assertFalse("downRightDiagonalDoesNotMatch must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "43";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "34";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
   
}
