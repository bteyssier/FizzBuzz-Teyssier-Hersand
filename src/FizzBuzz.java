import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
	
	public List<String> calculerFizzBuzz() {
		List<String> tableau = new ArrayList<String>();
		
		
		
		for(int i=0;i < 100;i++)
		{
			if ((i)%3 == 0)
					tableau.add("Fizz");
			else if (i==4)
					tableau.add("Buzz");
			else
					tableau.add("" + i);
		}
		return tableau;
	}

	
}