import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TestFizzBuzz {
	
	@Test
	public void donneBien100Résultats()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> résultats = fizzBuzz.calculerFizzBuzz();
		assertEquals(100,résultats.size());
	}
	
	@Test
	public void tableauNonVide(){
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> résultats = fizzBuzz.calculerFizzBuzz();
		assertEquals("1",résultats.get(1));
	}
	
	@Test
	public void donnePourMultipe3Fizz()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> résultats = fizzBuzz.calculerFizzBuzz();
		for(int i = 0; i<100 ;i++)
		{
			if(i%3 == 0)
				assertEquals("Fizz", résultats.get(i));	
		}
	}
	
	@Test
	public void donnePour5Buzz()
	{
		final FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> résultats = fizzBuzz.calculerFizzBuzz();
		assertEquals("Buzz", résultats.get(4));
	}
}