package pattern_Programming;

public class printL {
	public static int n = 10;
	public static int i = 0;
	public static void main(String[] args) {
		printL print = new printL();
		for (i=0; i<n; i++) {
			print.printFirstAlphabet(i, n);
			System.out.print("   ");
			print.printSecondAlphabet(i, n);
			System.out.print("  ");
			print.printThirdAlphabet(i, n);
			System.out.print("  ");
			print.printFourthAlphabet(i, n);
			System.out.print("  ");
			print.printFifthAlphabet(i, n);
			System.out.print("  ");
			print.printSixthAlphabet(i, n);
			System.out.print("  ");
			print.printGAlphabet(i, n);
			System.out.print("  ");
			print.printH(i, n);
			System.out.print("  ");
			print.printIAlphabet(i, n);
			System.out.print("  ");
			print.printJAlphabet(i, n);
			System.out.print("  ");
			print.printLAlphabet(i, n);
			System.out.print(" ");
			print.printOAlphabet(i, n);
			System.out.print("  ");
			print.printPAlphabet(i, n);
			System.out.println();
		}
		
	}

	public void printFirstAlphabet(int i, int n) {
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
	public void printSecondAlphabet(int i, int n) {
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
	}
	public void printThirdAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 && j>=1 && j<n-1 ||
					i>=1 && j==0 && !(i==n-1)||
					i==n-1 && j>0) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
	}
	public void printFourthAlphabet(int i, int n) {
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
	}
	public void printFifthAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 ||
					i>0 && j==0 ||
					i==(n-1)/2 ||
					i==n-1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
	}
	private void printSixthAlphabet(int i, int n) {
		for(int j = 0; j<n; j++) {
			if(i==0||
					i>0 && j==0 ||
					i==(n-1)/2) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
	}
	private void printGAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 && j>0 ||
					i>=1 && j==0 && !(j==n-2)||
					i==n-1 && j>=1 && !(j==n-1)||
					i==(n-1)/2 && j>(n-1)/2 && j<(n-1)||
					i >=(n-1)/2 && j>=n-1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
	}
	private void printH(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i>=0 && j==0 ||
					i>=0 && j==n-1||
					i==(n-1)/2
					) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
	}
	private void printIAlphabet(int i2, int n2) {
		for(int j=0; j<n; j++) {
			if(i==0 || i>=0 && j==(n-1)/2||
					i==n-1)System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
	}
	private void printJAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0||
					i>0 && j==(n-1)/2||
					i==n-1 && !(j>=(n-1)/2)) System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		
	}
	private void printLAlphabet(int i2, int n2) {
		for(int j=0; j<n; j++) {
			if(i>=0 && j==0 ||
					i==n-1)System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		
	}

	private void printOAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 && j>0 && !(j==n-1)||
					i>0 && i<n-1 && j==0||
					i==n-1 && j>0 && !(j==n-1)||
					i>0 && i<n-1 && j==n-1)
			{System.out.print("*");}
			else {
				System.out.print(" ");
			}
		}
		
	}
	private void printPAlphabet(int i, int n) {
		for(int j=0; j<n; j++) {
			if(i==0 && j>0 && j<n-1||
					i>0 && j==0||
					i==(n-1)/2 && j<n-1 ||
					i>0 && i<(n-1)/2 && j==n-1) System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		
	}
	
	
	

	

}
