package lab_3;

public class LB_3 {
    public static void main(String[] args) {

        int[] ar = {10, -8, -65, -6, -14, 0};

        int sum = 0;


        for (int i = 0; i < ar.length; i++) {


            if (ar[i] < 0 && ar[i] % 2 == 0) {
                sum = sum + ar[i];
            }
        }


        System.out.println("Сума від'ємних парних елементів: " + sum);
    }
}
