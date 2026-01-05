import java.util.ArrayList;

public class UCS {

    public static void main(String[] args) {

        String S1 = "THISS ISS AN AUTOMATION FRAMEWORKK";
        char[] ch = S1.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {

            int count = 0;

            if (!list.contains(ch[i])) {
                list.add(ch[i]);

                for (int j = 0; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        count++;
                    }
                }

                if (count == 1 && ch[i] != ' ') {
                    System.out.println(ch[i]);
                }
            }
        }
    }
}
