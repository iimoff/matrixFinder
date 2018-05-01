package com.mercadolibre.iimoff.matrixFinder.search.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;


public class DownVerticalSearchTest {
	
	@Test
	public void verticalTopBorderMatchTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("01");
		cellHitteds.add("11");
		cellHitteds.add("21");
		cellHitteds.add("31");
		cellHitteds.add("40");
		cellHitteds.add("41");
		
		assertTrue("verticalTopBorderMatchTest must return true " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "40";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "20";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 10;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	

	@Test
	public void verticalBottomBorderMatchTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("21");
		cellHitteds.add("31");
		cellHitteds.add("41");
		cellHitteds.add("51");		
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ"
	        		  };	        
	    
	    
	    assertTrue("verticalBottomBorderMatchTest must return true " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "51";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "20";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "40";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "50";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
	   
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	}

	
	
	@Test
	public void verticalMiddleMatchTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		
		cellHitteds.add("00");
		cellHitteds.add("01");
		cellHitteds.add("11");
		cellHitteds.add("21");
		cellHitteds.add("31");
		cellHitteds.add("41");
		cellHitteds.add("51");
		cellHitteds.add("50");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ"
	        		  };	        
	    
	    assertTrue("verticalMiddleMatchTest must return a set with ", search.execute(dna, cellHitteds , mutantKeys, secuenceHits, row, col) );
	    	    
	    String expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "01";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "11";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "51";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "50";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "20";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "40";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 12;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
	    
	   
	}
	

	@Test
	public void verticalSearchDoesNotMatchTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("11");
		cellHitteds.add("21");
		cellHitteds.add("31");
		cellHitteds.add("41");
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ"
	        		  };	        
	    
	    assertFalse("verticalSearchDoesNotMatchTest must return true", search.execute(dna, cellHitteds , mutantKeys, secuenceHits, row, col) );
	 	    
	    String expected = "11";
		assertTrue("rightHorizontalSearchTestLeftBorder must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("rightHorizontalSearchTestLeftBorder must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "31";
		assertTrue("rightHorizontalSearchTestLeftBorder must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "41";
		assertTrue("rightHorizontalSearchTestLeftBorder must contains the value:" + expected,  cellHitteds.contains(expected));
					    
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	@Test
	public void verticalSearchDoesNotFitTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("31");
		cellHitteds.add("41");
		cellHitteds.add("52");		
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 3;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ"
	        		  };	       
	    
	 	    
	    assertFalse("verticalSearchDoesNotFitTest must return a set wit ", search.execute(dna, cellHitteds, mutantKeys, secuenceHits, row, col) );
	    
	    String expected = "31";
		assertTrue("secuenceHits must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "41";
		assertTrue("secuenceHits must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "52";
		assertTrue("secuenceHits must contains the value:" + expected,  cellHitteds.contains(expected));
					
		int listSizeExpected =3;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	@Test
	public void verticalTopBorderOverHittedCellsTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 0;				
	    String[]dna = {
	    				"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("00");
		cellHitteds.add("10");
		cellHitteds.add("20");
		cellHitteds.add("30");		
		
		assertFalse("verticalTopBorderOverHittedCellsTest must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "00";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "10";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "20";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));		
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());
		
	}
	
	
	@Test
	public void verticalTopBorderOverHittedLastCellsTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("50");
		cellHitteds.add("51");
		cellHitteds.add("52");
		cellHitteds.add("53");		
		
		assertFalse("verticalTopBorderOverHittedLastCellsTest must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "50";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "51";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "52";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "53";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
	@Test
	public void verticalTopBorderOverHittedCellTest(){	
		
		AddressableMatrixSearch search = new DownVerticalSearch();	
		
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 0;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellHitteds = new HashSet<String>();
		cellHitteds.add("20");
		cellHitteds.add("21");
		cellHitteds.add("22");
		cellHitteds.add("23");		
		
		assertFalse("verticalTopBorderOverHittedCellTest must return false " , search.execute(dna, cellHitteds ,mutantKeys, secuenceHits, row, col));
		
		String expected = "20";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellHitteds.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellHitteds.size());	
		
	}
	
}
