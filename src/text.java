

public class text {

	public static void main(String[] args) {
		int a=23;
		int b=48;
		int c=25;
		int sum=b+c;
		int hour = sum/60;
		if(a+hour>23) {
			System.out.println((a+(hour)-24)+" "+(sum-(hour*60)));
		}else {
			System.out.println(a+(hour)+" "+(sum-(hour*60)));
		}
	}

}
