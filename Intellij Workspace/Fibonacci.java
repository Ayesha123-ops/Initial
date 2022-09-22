class Fibonacci{
        public static void main(String[] args) {

            int totaldigits = 8, firstdigit= 0, seconddigit = 1;
            System.out.println("Fibonacci Series of " + totaldigits + " numbers:");

            for (int i = 1; i <= totaldigits; ++i) {
                System.out.print(firstdigit + ", ");

                // compute the next term
                int nextdigit= firstdigit + seconddigit;
                firstdigit = seconddigit;
                seconddigit = nextdigit;
            }
        }
    }

