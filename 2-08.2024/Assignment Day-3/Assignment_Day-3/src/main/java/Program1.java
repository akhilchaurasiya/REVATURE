import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e = "Umbrella";
		
		HashSet<Character>str = new HashSet<>();
		
		for(int i = 0;i<e.length();i++)
		{
			str.add(e.charAt(i));
		}
		
		boolean flag = false;
		
		
		for(int i  = 0;i<e.length();i++)
		{
			if(str.contains('e'))
			{
				System.out.println("Letter is present");
				flag = true;
				break;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Letter is not present");
		}
	}

}
