package com.techgbeamers.selenium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
   }
}

/*import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
	
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}*/
