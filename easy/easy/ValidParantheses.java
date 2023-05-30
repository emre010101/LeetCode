package easy;
import java.util.Stack;
public class ValidParantheses {
	
	public boolean isValid(String s) {
		if(s.length()%2!=0) return false;
		Stack<Character> valid = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c=='(' || c=='[' || c=='{') {
				valid.push(c);
			}else {
				if(!valid.empty()) {
					char d = valid.peek();
					
					switch (d) {
					case '(':
						if(c==')') valid.pop(); else return false;
						break;
					case '{':
						if(c=='}') valid.pop(); else return false;
						break;	
					case '[':
						if(c==']') valid.pop(); else return false;
						break;	
					}
				}else return false;
			}
		}
		if(valid.isEmpty()) return true;
		else return false;
	}

	
	public static void main(String[] args) {
		ValidParantheses tt = new ValidParantheses();
		System.out.println(tt.isValid("([}}])"));
	}
}
