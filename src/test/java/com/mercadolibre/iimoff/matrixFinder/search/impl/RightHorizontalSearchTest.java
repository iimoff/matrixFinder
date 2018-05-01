package com.mercadolibre.iimoff.matrixFinder.search.impl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class RightHorizontalSearchTest {
   
	
	@Test
	public void rightHorizontalSearchTestLeftBorder(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AAAAQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("11");
		cellHitteds.add("12");
		cellHitteds.add("13");
		
		assertTrue("rightHorizontalSearchTestLeftBorder must return true " , rightSearch.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "02";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
	
	@Test
	public void rightHorizontalSearchTestRightBorder(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("11");
		cellHitteds.add("12");
		cellHitteds.add("13");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 2;
		int row = 0;				
	    String[]dna = {
	    				"QQAAAA",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };	        
	    
	    
	    assertTrue("cellHitteds must return true " , rightSearch.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "02";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "04";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "05";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
	   
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	}
	
	@Test
	public void rightHorizontalSearchTestMiddle(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("11");
		cellHitteds.add("12");
		cellHitteds.add("13");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 1;
		int row = 0;				
	    String[]dna = {
	    				"QAAAAQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };	        
	    
	    assertTrue("rightHorizontalSearchTestMiddle must return a set with ", rightSearch.execute(dna, cellHitteds , mutantKeys, secuenceHits, row, col) );
	    	    
	    String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "02";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "04";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
	    
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	   
	}
	
	@Test
	public void rightHorizontalSearchTestNotMatch(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("11");
		cellHitteds.add("12");
		cellHitteds.add("13");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 0;				
	    String[]dna = {
	    				"AAQAAA",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };	        
	    
	    assertFalse("rightHorizontalSearchTestNotMatch must return a set with ", rightSearch.execute(dna, cellHitteds , mutantKeys, secuenceHits, row, col) );
	 	    
	    String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
					    
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	    
	}
	
	@Test
	public void rightHorizontalSearchTestNotFit(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("10");
		cellHitteds.add("11");
		cellHitteds.add("12");
		cellHitteds.add("13");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 0;				
	    String[]dna = {
	    				"QQQAAA",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };	       
	    
	 	    
	    assertFalse("rightHorizontalSearchTestNotFit must return a set wit ", rightSearch.execute(dna, cellHitteds, mutantKeys, secuenceHits, row, col) );
	    
	    String expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	}
	
	
	@Test
	public void rightHorizontalSearchTestOverHittedCells(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AAAAQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("00");
		cellHitteds.add("01");
		cellHitteds.add("02");
		cellHitteds.add("03");
		
		assertFalse("rightHorizontalSearchTestOverHittedCells must return false " , rightSearch.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
				
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
	public void rightHorizontalSearchTestOverHittedCellLast(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 2;
		int row = 0;				
	    String[]dna = {
	    				"QQAAAA",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("05");
		cellHitteds.add("15");
		cellHitteds.add("25");
		cellHitteds.add("35");
		
		assertFalse("rightHorizontalSearchTestOverHittedCellLast must return false " , rightSearch.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
				
	
		String expected = "05";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
				
		expected = "15";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "25";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "35";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	}
	
	
	@Test
	public void rightHorizontalSearchTestOverHittedCellMiddle(){	
		
		AddressableMatrixSearch rightSearch = new RightHorizontalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 1;
		int row = 0;				
	    String[]dna = {
	    				"QAAAAQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("03");
		cellHitteds.add("13");
		cellHitteds.add("23");
		cellHitteds.add("33");
		
		assertFalse("rightHorizontalSearchTestOverHittedCellMiddle must return false " , rightSearch.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		
		String expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
				
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	
}
