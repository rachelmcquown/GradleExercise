public class IntegerSequence {
    
    public static void main(String[] args) {
	
	int arg1 = -1;
	IntegerSequence is = new IntegerSequence();

        if (args.length != 2) {

            System.out.println("Incorrect number of arguments, exiting program.");
            System.exit(1);
        }

        if ((!args[0].equals("lazy")) && (!args[0].equals("triangle"))){
            System.out.println("First argument not valid, exiting program.");
            System.exit(1);
        }

        try {
            arg1 = Integer.parseInt(args[1]);
            if (arg1 < 0) {
                System.out.println("Integer not in valid range, exiting program.");
                System.exit(2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Second argument not an integer, exiting program.");
            System.exit(2);
        }

        if(args[0].equals("lazy")){
            int p = is.lazy(arg1);
            System.out.println("Lazy(" + args[1] + ") = " + p);
        }

        if(args[0].equals("triangle")){
            int q = is.triangle(arg1);
            System.out.println("Tri{" + arg1 + ") = " + q);
        }
    }

    public int triangle(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        return (n(n+1))/2;
    }

    public int lazy(int n){
        int p = 0;
        p = ((n*n)+n+2)/2;
        return p;
    }
}
