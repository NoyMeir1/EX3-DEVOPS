
public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		int count =1;
		int[] array=new int [10];
		for (int i=0; i<array.length; i++) {
			array[i]= count++;
			System.out.print(array[i]);
		}
	}
}
