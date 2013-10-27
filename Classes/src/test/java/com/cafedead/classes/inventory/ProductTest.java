package com.cafedead.classes.inventory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProductTest {
    
	Product product ;
	
	@Before
	public void setup(){
		product = new Product();
		
	}
	
	@Test
	public void testsettersAndGetters(){
		
		product.setId(1L);
		
	}
}
