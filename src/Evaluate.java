
import com.example.Std.*;
import java.util.*;

public class Evaluate {
	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		String str = null;
		
		while(!StdIn.isEmpty()){
			str = StdIn.readLine();
			StdOut.println(str);
		}
		
		Scanner in = new Scanner(str);
		
		while(in.hasNext()){
			String s = in.next();
			if(s.equals("("))			;
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) ops.push(s);
			else if(s.equals(")"))
			{
				String op = ops.pop();
				double v = vals.pop();
				if(op.equals("+"))		v = vals.pop() + v;
				else if(op.equals("-"))		v = vals.pop() - v;
				else if(op.equals("*"))		v = vals.pop() * v;
				else if(op.equals("/"))		v = vals.pop() / v;
				else if(op.equals("sqrt"))		v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
		StdOut.println(vals.pop());
	}

}
