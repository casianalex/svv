 import org.junit.Test;
 import static org.junit.Assert.*;


public class StringConv {
		public int strToInt(String str) throws NumberFormatException {
		      return 0;
		      
		      public int strToInt(String str) throws NumberFormatException {
		    	     int sum=0;
		    	      for (int i = 0; i < str.length(); i++) {
		    	        int digit = (int)str.charAt(str.length()-i-1) - (int)'0';
		    	        sum = sum + digit * (int)Math.pow(10, i);
		    	      }
		    	      return sum;
		    	    }
		      
	
	@BeforeClass
	       public void setUp() {
	           System.out.println("@Before method will execute before every JUnit4 test!");
	        }
	    
	        @After
	       public void tearDown() {
	           System.out.println("@After method will execute after every JUnit4 test!");
	       }
	        
	        
	        @AfterClass
	        public static void tearDownClass() throws Exception {
	             System.out.println("@AfterClass method will be executed after JUnit test for a Class Completed");
	
}
	        
	        @test
	        public void testNull() {
	        	          System.out.println("testNull");
	        	           fail("An Example of @Test JUnit4 annotation");
	        	       }
	        
	        public void testNull() {
	        	          System.out.println("testNull");
	        	          fail("An Example of @Test JUnit4 annotation");
	        	      }
	        
	        @Ignore("Not yet implemented")
	             @Test
	           public void testGetAmount() {
	               System.out.println("getAmount");
	                fail("@Ignore method will not run by JUnit4");
	            }
	        
	        
}
