import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.*;
// import org.json.simple.parser.JSONParser;

public class JSONArrayDemoIterator{
	public static void main(String args[]){
		try{
			JSONObject obj = new JSONObject();
			JSONArray arrobj = new JSONArray();
			arrobj.add("K1");//values
			arrobj.add("K2");
			arrobj.add("K3");
			System.out.print("ValuesOfArray: ");
			
			Iterator<String> i = arrobj.iterator();
			while(i.hasNext()){
				System.out.println(i.next());
			}
		catch(Exception e){
			System.out.println(e);
		}
		
		// System.out.println("ValuesOfArray:" + obj.get("array"));
		
		
	}
}









// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter No. of pairs:");
		// int getpair = sc.nextInt();
		// for(int i = 1;i <= getpair; i++){
			// System.out.print("Enter Key:");
			// String k = sc.next();
			// System.out.print("Enter Value:");
			// String v = sc.next();
			// obj.put(k, v);
			// // System.out.println(obj);
			
		// }