
public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr= {2,4,5,1,9,8,7,3};
		ascending(arr);
		
	}
	public static  void ascending(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=0;
//					System.out.println(" "+a[i]+" "+a[j]);
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
