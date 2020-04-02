package com.devopstest;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringHelperTest {
    StringHelper helper= new StringHelper();
	@Test
	public void testtruncateAInFirst2Positions() {
		//asserEquals(Expected, Actual)
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		 
	}
	//Test method must be a public and void
	@Test
	public void testtruncateAInFirstPosition(){
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositive(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegative(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}
}
