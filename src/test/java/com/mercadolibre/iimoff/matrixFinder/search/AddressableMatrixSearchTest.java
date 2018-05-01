package com.mercadolibre.iimoff.matrixFinder.search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.mercadolibre.iimoff.matrixFinder.search.impl.DownVerticalSearch;

public class AddressableMatrixSearchTest {
		
	@Test
	public void isSecuenceFits(){
		AddressableMatrixSearch ams = new DownVerticalSearch();
		
		int totalLenght = 6;
		int currentIndex = 0;
		int secuenceLength = 4;
		int acumSec = 0;		
		
		assertTrue("isSecuenceFits with index: "+ currentIndex + " must return 'true'", ams.secuenceFits(totalLenght, currentIndex, secuenceLength, acumSec));
		
		currentIndex = 1;
		assertTrue("isSecuenceFits with index: "+ currentIndex + " must return 'true'", ams.secuenceFits(totalLenght, currentIndex, secuenceLength, acumSec));
		
		currentIndex = 2;
		assertTrue("isSecuenceFits with index: "+ currentIndex + " must return 'true'", ams.secuenceFits(totalLenght, currentIndex, secuenceLength, acumSec));
		
		currentIndex = 3;
		assertFalse("isSecuenceFits with index: "+ currentIndex + " must return 'false'", ams.secuenceFits(totalLenght,currentIndex, secuenceLength, acumSec));
		
		currentIndex = -1;
		assertFalse("isSecuenceFits with index: "+ currentIndex + " must return 'false'", ams.secuenceFits(totalLenght, currentIndex, secuenceLength, acumSec));
		
	}
	
	
	@Test
	public void inNotSecuenceCompleted() {
		AddressableMatrixSearch ams = new DownVerticalSearch();
		
		int secuenceLength = 4;
		int acumHits = 0;
		
		assertTrue("isSecuenceFits with : "+ acumHits + " acumulated hits must return 'true'", ams.isNotSecuenceCompleted(secuenceLength, acumHits));
		
		acumHits = 2;
		assertTrue("isSecuenceFits with : "+ acumHits + " acumulated hits must return 'true'", ams.isNotSecuenceCompleted(secuenceLength, acumHits));
		
		acumHits = 3;
		assertTrue("isSecuenceFits with : "+ acumHits + " acumulated hits must return 'true'", ams.isNotSecuenceCompleted(secuenceLength, acumHits));
		
		acumHits = 4;
		assertFalse("isSecuenceFits with : "+ acumHits + " acumulated hits must return 'false'", ams.isNotSecuenceCompleted(secuenceLength, acumHits));
		
		
	}
	
	@Test
	public void isASearchedKey() {
		AddressableMatrixSearch ams = new DownVerticalSearch();
		
		String searchedKeys = "ATGC";
		char key = 'A';		
		assertTrue("isASearchedKey with char : "+ key + " must return 'true'", ams.isASearchedKey(searchedKeys, key));
		
		key = 'T';		
		assertTrue("isASearchedKey with char : "+ key + " must return 'true'", ams.isASearchedKey(searchedKeys, key));
		
		key = 'G';		
		assertTrue("isASearchedKey with char : "+ key + " must return 'true'", ams.isASearchedKey(searchedKeys, key));
		
		key = 'C';		
		assertTrue("isASearchedKey with char : "+ key + " must return 'true'", ams.isASearchedKey(searchedKeys, key));
		
		key = 'F';		
		assertFalse("isASearchedKey with char : "+ key + " must return 'false'", ams.isASearchedKey(searchedKeys, key));
		
	}
	
	@Test
	public void isHittedCell(){
		
		AddressableMatrixSearch ams = new DownVerticalSearch();
		Set<String>hittedCells = new HashSet<String>();
		hittedCells.add("01");
		hittedCells.add("02");
		hittedCells.add("03");
		hittedCells.add("04");
		hittedCells.add("05");
		
		int row = 0;
		int col = 1;		
		assertTrue("findHittedCell with coords ["+ row +","+ col +"] must return 'true'", ams.isAHittedCell(hittedCells, row, col));		
		
		row = 0;
		col = 3;
		assertTrue("findHittedCell with coords ["+ row +","+ col +"] must return 'true'", ams.isAHittedCell(hittedCells, row, col));
		
		row = 0;
		col = 5;
		assertTrue("findHittedCell with coords ["+ row +","+ col +"] must return 'true'", ams.isAHittedCell(hittedCells, row, col));
		
		row = 0;
		col = 0;
		assertFalse("findHittedCell with coords ["+ row +","+ col +"] must return 'false'", ams.isAHittedCell(hittedCells, row, col));
		
		row = 0;
		col = 6;
		assertFalse("findHittedCell with coords ["+ row +","+ col +"] must return 'false'", ams.isAHittedCell(hittedCells, row, col));			
			
	}
	
	
	@Test
	public void getCoordsPair(){
		AddressableMatrixSearch ams = new DownVerticalSearch();
		
		int col = 0;
		int row = 0;		
		String expected = "00";			
		assertEquals("getCoordsPair with coords ["+ row +","+ col +"] must return: " + expected, expected, ams.getCoordsPair(row, col));
		
		col = 99;
		row = 99;		
		expected = "9999";	
		assertEquals("getCoordsPair with coords ["+ row +","+ col +"] must return: ", expected, ams.getCoordsPair(row, col));
		
		col = 1234567890;
		row = 987654321;		
		expected = "9876543211234567890";
		assertEquals("getCoordsPair with coords ["+ row +","+ col +"] must return: " + expected, expected, ams.getCoordsPair(row, col));		
		
	}
	
	
	
	@Test	
	public void addHittedCell() {
		AddressableMatrixSearch ams = new DownVerticalSearch();
		
		Set<String>hittedCells = new HashSet<String>();
		int row = 0;
		int col = 0;
		int expected = 1;
		ams.addHittedCell(hittedCells, row, col);
		
		assertEquals("hittedCells must have: " + expected + " elements ", expected, hittedCells.size());
		
		ams.addHittedCell(hittedCells, row, col);
		assertEquals("hittedCells dulplacate value attemp, must have: " + expected + " elements", expected, hittedCells.size());
		
		row = 0;
		col = 1;
		expected = 2;
		ams.addHittedCell(hittedCells, row, col);
		assertEquals("hittedCells dulplacate value attemp, must have: " + expected + " elements", expected, hittedCells.size());
		
	}
	
	
	
	
}































