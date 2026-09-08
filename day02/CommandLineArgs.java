package day02;

public class CommandLineArgs {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No command line argument provided.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        switch (num) {
            case 0:
                System.out.println("You passed 0");
                break;

            case 1:
                System.out.println("You passed 1");
                break;

            case 2:
                System.out.println("You passed 2");
                break;

            case 3:
                System.out.println("You passed 3");
                break;

            default:
                System.out.println("Invalid argument. Please pass 0, 1, 2, or 3.");
        }
    }
}