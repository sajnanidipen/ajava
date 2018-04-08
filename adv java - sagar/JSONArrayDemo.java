import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.*;
@SuppressWarnings("unchecked")// Suppressing warnings while Compilation

// Storing values in an array

public class JSONArrayDemo{
	public static void main(String args[]){
		try{
			JSONObject obj = new JSONObject();
			JSONArray arrobj = new JSONArray();
			arrobj.add("V1");//values
			arrobj.add("V2");
			arrobj.add("V3");
			System.out.print("ValuesOfArray: ");
			for(int i=0; i < arrobj.size(); i++){
				System.out.print(arrobj.get(i) +" ");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}