package programsOnString;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CharactersAndTheirFrequencyInString 
{
	@Test
	public void charactersAndTheirFrequencyInString() // without Collection
	{
		String s="welcome"; // O/P: w1e2l1c1o1m1
        String req="";
        for(int i=0; i<s.length(); i++)
        {
            int count=0;
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(i>j)
                        break;
                    else
                        count++;
                }
            }
            if(count>=1)
                req=req+s.charAt(i)+count;
        }
        System.out.println(req);
	}
	
	
	@Test
	public void charactersAndTheirFrequencyInString1() // with LinkedHashMap
	{
		String s="welcome";
        String req="";
        LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>(); // use linked hashmap
        for(int i=0; i<s.length(); i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        
        for(Entry<Character, Integer> m : hm.entrySet())
        {
            req=req+m.getKey()+m.getValue();
        }
        System.out.println(req);
	}
}
