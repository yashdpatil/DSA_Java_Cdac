*/
s = Source
a = middle 
d = Dstinatation
*/
import java.util.Scanner;
public class Toh {
    static void Tohh(int n, char s, char a, char d) {
        if (n == 1) {
            System.out.println("Disk" + n + s + "to" + d);
            return;
        }
        Tohh(n - 1, s, d, a);
        System.out.println("Disk" + n + "From" + s + "to" + d);
        Tohh(n - 1, a, s, d);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        Tohh(n, 'A', 'B', 'C');

    }
}
