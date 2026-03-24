public class HelloApp {
    public static void main(String[] args) {

        // If no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // If arguments are passed
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            System.out.println("Hello, " + nameBuilder + "!");
        }
    }
}