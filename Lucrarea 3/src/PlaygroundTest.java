   import static org.mockito.Mockito.*;
    import java.util.List;
    import org.junit.Test;
    
    public class PlaygroundTest {
    
    	
            @Test
            
            
            public void invocation() {
                    //mock creation
                   List<String> mockedList = mock(List.class);
   
                   //using mock object
                   mockedList.add("one");
                   mockedList.clear();
 
                 //verification
                   verify(mockedList).add("one");
                verify(mockedList).clear();
           }
            
            @Test
             public void testCounterWithAnonimous() {
                     HttpStringProvider mockStringProvide = mock(HttpStringProvider.class);
                     when(mockStringProvide.getStringForAdress(anyString())).thenReturn("<b><b></b></b>");
                     
                    TagsParser counter = new TagsParser("http_address");
                    
                    
                     counter.setProvider(mockStringProvide);
                     
                     
                     assertEquals(2, counter.getTagsCount());
                     
                     
                    verify(mockStringProvide).getStringForAdress("http_address");
            }
            
            @AfterClass
                 public static void tearDownClass() throws Exception {
            
            	System.out.println("@AfterClass method will be executed after JUnit test for a Class Completed");
                
            
            }
            
            @Ignore("Not yet implemented")
            
            
            @Test
            
            public void testGetAmount() {
                     System.out.println("getAmount");
            
                     fail("@Ignore method will not run by JUnit4");
                 }
   }