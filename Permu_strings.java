import java.util.ArrayList;

public class Recurssion_Eight {
    static ArrayList<String> possible_String(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = possible_String(s.substring(1));
        for (String ss : smallans) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = possible_String("Yash");
        for (String ss : ans) {
            System.out.println(ss);
        }
    }
}
// in the form of thr arraylist
