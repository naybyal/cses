import java.util.*;
class Fibonacci {
	public static long fiboGen(long n) {
		if (n<=1)
			return n;
		else 
			return fiboGen(n-2)+ fiboGen(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = fiboGen(n);
		System.out.println(ans);
	}
}
