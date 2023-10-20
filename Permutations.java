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
@
                                    ABC
    J = 0                            J=1                                                J=2
    A|BC                            B|AC                                                C|AB
 J=1   J=2                J=1              J=2                                    J=1         J=2
AB|C   AC|B             BA|C             BC|A                                    CA|B       CB|A
ABC    ACB              BAC              BCA                                     CAB        CBA

Output
ABC
ACB
BAC
BCA
CAB
CBA
