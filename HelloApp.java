class HelloApp {
    public static void main(String[] args) {
        
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("Hello");
        } else {
            String result = "Hello ";
            
            // Concatenate all arguments into a single string
            for (int i = 0; i < args.length; i++) {
                result += args[i];
                
                // Add space between words (avoid trailing space)
                if (i != args.length - 1) {
                    result += " ";
                }
            }
            
            System.out.println(result);
        }
    }
}
