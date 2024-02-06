public class swap {
    public static void main(String[] args) {
        int x=10,y=20;
        //swap
        x=x^y;
        y=y^x;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
    }
}
