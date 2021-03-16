package ip.swagger.petstore;

public class PetStoreTest {
   @Test
    public void testPrintMessage() {	
       System.out.println("Inside testPrintMessage()");    
       assertEquals(message, messageUtil.printMessage());     
    }

}
