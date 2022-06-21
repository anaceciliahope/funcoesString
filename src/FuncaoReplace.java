public class FuncaoReplace {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";
        String s05 = original.replace('a', 'x');

        System.out.println("Original: " + original);
        System.out.println(s05);
    }
}
