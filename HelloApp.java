public class HelloApp {
    public static void main(String[] args) {
        String result = "Hello ";

        // Concatenate arguments with ", "
        for (int i = 0; i < args.length; i++) {
            result += args[i] + ", ";
        }

        // Remove trailing ", " using substring
        if (args.length > 0) {
            result = result.substring(0, result.length() - 2);
        }

        System.out.println(result);
    }
}
