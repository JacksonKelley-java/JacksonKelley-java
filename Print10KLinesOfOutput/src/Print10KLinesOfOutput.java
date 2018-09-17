public class Print10KLinesOfOutput {
    public static void main(String[] args) {
        thousand();
        thousand();
        thousand();
        thousand();
    }
    public static void first25Lines() {
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25");
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25");
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25");
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25");
    }
    public static void fiveHundred() {
        first25Lines();
        first25Lines();
        first25Lines();
        first25Lines();
        first25Lines();
    }
    public static void thousand() {
        fiveHundred();
        fiveHundred();
        fiveHundred();
        fiveHundred();
        fiveHundred();
    }
}