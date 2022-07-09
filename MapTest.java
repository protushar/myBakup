package test.hrm.Collectionframe.ArraylistPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
Map<Integer,String> map=new HashMap<Integer, String>();
map.put(0, "Tushar");
map.put(110, "Kumar");
map.put(110, "Kumar");
map.put(111, "KUMM");
map.put(82, "Ranchi");
map.put(5, "Home");

for(Map.Entry entry:map.entrySet())
{
	System.out.println("Keys: "+entry.getKey()+" Values"+entry.getValue());
}

Set<Integer> mapset= map.keySet();
for(Integer s:mapset)
{
	System.out.println("List of keys:"+s);
}
	}

}
