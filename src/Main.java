/**
 * Created by KPS on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(i);
        }
        long time2 = System.nanoTime();
        System.out.println(time2-time1);
    }
}
