package BitManipulation;

public class oddeven {
    public static void oddoreven(int n) {
        int bitMask=1;
        if((n & bitMask)==0) {
            //even number
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(11);
        oddoreven(14);
    }
}
