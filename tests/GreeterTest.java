import main.Greeter;
import static junit.Assertions.assertEquals;
import junit.Test;

public class GreeterTest{
	
	@Test
	public void hello(){
		assertEquals("Hello",greet());
	}
}
	