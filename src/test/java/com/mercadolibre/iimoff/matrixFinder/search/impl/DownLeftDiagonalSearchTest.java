package com.mercadolibre.iimoff.matrixFinder.search.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.AddressableMatrixSearch;

public class DownLeftDiagonalSearchTest {
	
	@Test
	public void firstColFirstRowHitTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 0;				
	    String[]dna = {
	    				"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"AQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("04");
	    cellsHitted.add("13");
	    cellsHitted.add("22");
	    cellsHitted.add("31");
		
		
	    assertTrue("firstColFirstRowHitTest must return 'true'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "04";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "03";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "12";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "30";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
	    
		int listSizeExpected = 8;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());
	}
	
	
	@Test
	public void firstColFirstRowDoeFixsNotTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 0;				
	    String[]dna = {
	    				"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("04");
	    cellsHitted.add("13");
	    cellsHitted.add("22");
	    cellsHitted.add("31");
		
		
	    assertFalse("firstColFirstRowDoeFixsNotTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "04";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
	    		
	}	
	
	
	@Test
	public void firstColFirstRowOverTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 0;				
	    String[]dna = {
	    				"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("04");
	    cellsHitted.add("13");
	    cellsHitted.add("22");
	    cellsHitted.add("31");
		
		
	    assertFalse("firstColFirstRowOverTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "04";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
	    
	}
	
	
	@Test
	public void middleRowHitTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 4;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQAQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("13");
	    cellsHitted.add("22");
	    cellsHitted.add("31");
	    cellsHitted.add("40");
		
		
	    assertTrue("middleRowHitTest must return 'true'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "14";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "40";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "14";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
	    
	}
	
	@Test
	public void middleRowHitDoesNotFitTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 4;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQAQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QQQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("40");
	    cellsHitted.add("31");
	    cellsHitted.add("22");
	    cellsHitted.add("13");
		
		
	    assertFalse("middleRowHitDoesNotFitTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "40";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
		    
	}
	
	@Test
	public void middleRowHitOverHittedCellTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 4;
		int row = 1;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQAQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("20");
	    cellsHitted.add("21");
	    cellsHitted.add("22");
	    cellsHitted.add("23");
		
		
	    assertFalse("middleRowHitOverHittedCellTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "20";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "21";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
		    
	}
	
	@Test
	public void bottomRowHitTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"AQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("40");
	    cellsHitted.add("31");
	    cellsHitted.add("22");
	    cellsHitted.add("13");
		
		
	    assertTrue("bottomRowHitTest must return 'true'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "40";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "23";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "50";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
		
		expected = "41";
		assertTrue("cellHitteds must contains the value:" + expected,  cellsHitted.contains(expected));
	    
	}
	
	
	
	@Test
	public void bottomRowDoesNotFitTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"QQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("40");
	    cellsHitted.add("31");
	    cellsHitted.add("22");
	    cellsHitted.add("13");
		
		
	    assertFalse("bottomRowDoesNotFitTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "40";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "22";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "13";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
	    
	}
	
	
	@Test
	public void bottomRowOverHittedCellTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 2;				
	    String[]dna = {
	    				"QQQQQQ",
	        			"QQQQQQ",
	        			"QQQAQQ",
	        			"QQAQQQ",
	        			"QAQQQQ",
	        			"AQQQQQ"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("30");
	    cellsHitted.add("31");
	    cellsHitted.add("32");
	    cellsHitted.add("33");
		
		
	    assertFalse("bottomRowOverHittedCellTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "30";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	    
	}
		
	
	@Test
	public void bottomDoesNotMatchTest(){
		AddressableMatrixSearch search= new DownLeftDiagonalSearch();
	    
		int secuenceHits = 4;
		String mutantKeys = "ATCG";
		int col = 3;
		int row = 2;				
	    String[]dna = {
	    				"ATGCAA",
	        			"GATGCA",
	        			"CGATGC",
	        			"TCGTCA",
	        			"GTCATC",
	        			"AGTGAT"
	        		  };  
	    
	    Set<String> cellsHitted = new HashSet<String>();
	    cellsHitted.add("30");
	    cellsHitted.add("31");
	    cellsHitted.add("32");
	    cellsHitted.add("33");
		
		
	    assertFalse("bottomDoesNotMatchTest must return 'false'", search.execute(dna, cellsHitted ,mutantKeys, secuenceHits, row, col));
	    
	    String expected = "30";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "31";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "32";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		expected = "33";
		assertTrue("cellHitteds must contains the value: " + expected,  cellsHitted.contains(expected));
		
		int listSizeExpected = 4;
		assertEquals("cellHitteds must have a legnth of :" + listSizeExpected ,listSizeExpected , cellsHitted.size());	
	    
	}

}
