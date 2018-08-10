
public class NumberSeries {

	public static void main(String[] args) {
		numSeries(10);
	}
	public static  void numSeries(int n) {
		int x=1;
		for(int i=1;i<=n;i++) {
			System.out.print(x+" ");
			x=x+i;
		}
	}
}
