public class HelloApp {
    public static void main(String[] args) {

        // Check if argument is given
        if(args.length > 0) {
            System.out.println("Hello " + args[0]);
        } 
        else {
            System.out.println("No command line argument given");
        }
    }
}