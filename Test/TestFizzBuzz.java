import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TestFizzBuzz {
	
	@Test
	public void donneBien100R�sultats()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> r�sultats = fizzBuzz.calculerFizzBuzz();
		assertEquals(100,r�sultats.size());
	}
	
	@Test
	public void tableauNonVide(){
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> r�sultats = fizzBuzz.calculerFizzBuzz();
		assertEquals("1",r�sultats.get(1));
	}
	
	@Test
	public void donnePourMultipe3Fizz()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> r�sultats = fizzBuzz.calculerFizzBuzz();
		for(int i = 0; i<100 ;i++)
		{
			if(i%3 == 0)
				assertEquals("Fizz", r�sultats.get(i));	
		}
	}
	
	@Test
	public void donnePour5Buzz()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> r�sultats = fizzBuzz.calculerFizzBuzz();
		assertEquals("Buzz", r�sultats.get(4));
	}
}