public class Program8 {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int j2 = j; j2 > 1; j2--) {
                System.out.print(" ");
            }
            for (int j2 = j; j2 <= n; j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
 * Output:-
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */