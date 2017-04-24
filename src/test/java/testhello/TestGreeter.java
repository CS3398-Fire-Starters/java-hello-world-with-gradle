package hello; 

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }

   @Test
   public void newtestOKEGreeterPass()
   {
      g.setName("OKETest");
      assertEquals(g.getName(), "OKETest");//Should succeed.
   }

   /*@Test
   public void newtestOKEGreeterFail()
   {
      g.setName("failure");
      assertEquals(g.getName(), "OKETest");//Should fail.
   }*/
	
   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }
}
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }
}