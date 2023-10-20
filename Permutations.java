Example of BackTracking
public class permutations {
    static void Permutation(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res + "");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            Permutation(ros, res + ch);
        }
    }

    public static void main(String[] args) {
        Permutation("ABC", "");

    }
}


Output
ABC
ACB
BAC
BCA
CAB
CBA
