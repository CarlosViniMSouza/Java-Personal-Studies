package scripts;

public class script03 {
    public static void main(String[] args) {
        int num01 = 10;
        float num02 = 10.45f;
        double num03 = 10.2;
        boolean state01 = false;
        boolean state02 = true;

        System.out.println((num01 + num02) % (num03 - num01) <= num01 - 10);
        System.out.println(state01 != state02);
    }
}
