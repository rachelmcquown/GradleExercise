public class IntegerSequence {
    
    public static void main(String[] args) {

        if (args.length != 2) {

            System.out.println("Incorrect number of arguments, exiting program.");
            System.exit(1);
        }

        if ((!args[0].equals("lazy")) && (!args[0].equals("triangle"))){
            System.out.println("First argument not valid, exiting program.");
            System.exit(1);
        }

        try {
            int arg1 = Integer.parseInt(args[1]);
            if (arg1 < 0) {
                System.out.println("Integer not in valid range, exiting program.");
                System.exit(2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Second argument not an integer, exiting program.");
            System.exit(2);
        }
    }
}