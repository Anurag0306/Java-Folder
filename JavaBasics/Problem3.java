import java.util.Scanner;

class Problem3 {
	
	public static void main(String args[]) {
		
		try (Scanner sc = new Scanner(System.in)) {
            int principal = sc.nextInt();
            double rate = sc.nextDouble();
            int time = sc.nextInt();
            
            int si = (int)(principal * rate * time) / 100;
            
            System.out.println(si);
        }
		
	}
}