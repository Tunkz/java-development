public class main {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "abc";
        String s3 = new String("A" + "B" + "C");
        if (s1.equals(s2) ) {
            System.out.println("This is correct");
        }
        if (s1 == s3) {

            System.out.println("The second one is also correct");
        }

    }
}