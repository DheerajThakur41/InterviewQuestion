
public class StringCount {

	public static void main(String[] args) {
		String s="Hello i am here";
		String[] words = s.split(" ");
		StringBuilder opposite=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			opposite.append(words[i]+" ");
		}
		System.out.println(words.length);
		System.out.println(opposite);
	}
}
