class ReverseNumber {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse number: " + rev);
    }
}

