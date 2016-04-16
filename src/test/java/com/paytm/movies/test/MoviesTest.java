package com.paytm.movies.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.movies.page.MoviesPage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.tests.BaseTest;

public class MoviesTest extends BaseTest{
	
	@Test 
	
	public void testMoviesPage(){
		
		PayTmHeadersPage headersPage = PageFactory.initElements(driver, PayTmHeadersPage.class);
		MoviesPage moviesPage  = headersPage.clickOnMovies();
		
		moviesPage.selectLocation();
		moviesPage.selectTeluguMovies();
		
		String actualText = moviesPage.getTopMoviesText();
		String expectedText = "Top Movies This Week";
		
		Assert.assertEquals(actualText, expectedText);
		
	}
	
	

}
