import org.json.JSONObject;
import java.util.*;
public class javaprc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and roll- ");
		String a = sc.next();
		int b = sc.nextInt();
		JSONObject obj = new JSONObject();
		obj.put(a, b);
		System.out.println("Rollno. " + obj.get(b));
	}
}