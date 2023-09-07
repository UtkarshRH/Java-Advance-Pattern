public class Program7{
	public static void main(String args[]){
		int n = 5;
//This Upper part of the patern..
		for(int i = 1; i<= n;i++){
		for(int j= 1;j<=i;j++){
			System.out.print("*");
			}
			for(int j = i;j<n;j++){
			System.out.print(" ");
			}
			for(int j = i;j<n;j++){
			System.out.print(" ");
			}
			 for(int j= 1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
//This Upper part of the pattern..
//This Lower Part of the Pattern..
		for(int i = 1;i<=n;i++){
			for(int j = i;j<=n;j++){
			System.out.print("*");
			}
			for(int j=1;j<i;j++){
			System.out.print(" ");
			}
			for(int j=1;j<i;j++){
			System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
			System.out.print("*");
			}
		System.out.println();
		}
//This Lower Part of the Pattern..
	}
}
