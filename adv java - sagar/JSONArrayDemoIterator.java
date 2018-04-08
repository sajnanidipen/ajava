import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.*;
// Array With Iterator

public class JSONArrayDemoIterator{
	public static void main(String args[]){
		JSONObject obj = new JSONObject();
		JSONArray arrobj = new JSONArray();
		arrobj.add("K1");//values
		arrobj.add("K2");
		arrobj.add("K3");
		System.out.print("ValuesOfArray: ");
		
		// Iterator<String> i = arrobj.iterator();
		// while(i.hasNext()){
			// System.out.print(i.next() +" ");
		// }
		for (String i : arrobj) 
		{ 
			System.out.print(i);
		}
		
		
	}
}