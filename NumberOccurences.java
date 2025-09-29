class NumberOccurences {
    public static void main(String[] args) {
        System.out.println("Number Occurences Finding\n");
        int num = 25535;

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}

