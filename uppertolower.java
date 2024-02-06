//convert uppercase to lowercase character
public class solution {
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++) {
            System.out.println((char)(ch | ' ')); //ASCII value of ' ' is 32        
        }
    }
}
