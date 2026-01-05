import java.util.ArrayList;

public class Collectiondemo {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,4,5,5,7,8,2};
        ArrayList<Integer> AL = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;
            if (!AL.contains(a[i])) {
                AL.add(a[i]);
                for (int j = i; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                if (k == 1) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
