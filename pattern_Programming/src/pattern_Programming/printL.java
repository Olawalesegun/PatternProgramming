package pattern_Programming;

public class printL {
	public static int n = 10;
	public static int i = 0;
	public static void main(String[] args) {
		
		for (i=0; i<n; i++) {
			printFirstAlphabet(i, n);
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(i==0 && !(j==0) && !(j==n-1)||
						i>0 && j==n-1 && !(i==n-1)||
						i>0 && j==0 && !(i==n-1)||
						(i==(n-1)/2 && !(j==n-1))||
						i==n-1 && j<n-1 && j>0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				if(i==0 && j>=1 && j<n-1 ||
						i>=1 && j==0 && !(i==n-1)||
						i==n-1 && j>0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				if(i==0 && !(j==n-1)||
						i>=1 && j==n-1 &&!(i==n-1 && j==n-1)||
						i>=1 && j==0||
						i==n-1 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				if(i==0 ||
						i>0 && j==0||
						i==(n-1)/2||
						i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}
	public static void printFirstAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 && j>=1 && j<n-1 ||
					i>0 && j==n-1 || 
					i>0 && j==0 ||
					i==(n-1)/2) {
				System.out.print("*");
			}
			 else { System.out.print(" "); }	 
		}
	}
}