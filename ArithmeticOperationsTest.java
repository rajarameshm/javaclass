public class ArithmeticOperationsTest {

    public static enum Gender {Male, Female}

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        System.out.println(g + a);
        g += a;
        System.out.println(g);

        int h = 20;
        h -= a;
        System.out.println(h);

        int i = 30;
        i *= a;
        System.out.println(i);

        int j = 40;
        j /= a;
        System.out.println(j);

        int x = 1; //x = x+1
        int y = 1;

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++y);

        System.out.println(y--);
        System.out.println(y);
        System.out.println(--x);

        System.out.println(1==1);
        System.out.println(2>1);
        System.out.println(2<1);

        System.out.println(2>=1);
        System.out.println(1<=2);

        System.out.println(true && true);
        System.out.println((1==1) && (2>1));
        System.out.println((1==1) && (false));

        System.out.println((1==1) || (false));

        if (2 > 1) {
            System.out.println("2 is greater than 1");
        }
        if (true) {
            System.out.println("2 is greater than 1");
        }

        int m = 1;
        int n = 2;

        if (m == n) {
            System.out.println("m == n");
        }
        else if (m > n) {
            System.out.println("m > n");
        }
        else if (m < n) {
            System.out.println("m < 1");
            if ((n-m)==1) {
                System.out.println("the difference is 1");
            }
        }
        else if (m != n) {
            System.out.println("m != 1");
        }


        printAge(10);
        printAge(20);
        printAge(30);

        printGender(Gender.Female);
        printMultipleTime();

        System.out.println("4 % 2 = " + (4 % 2) );
        System.out.println("5 % 2 = " + (5 % 2) );

        System.out.println("-----Printing odd number-----");
        for(int z = 0; z < 10; z++) {
            if ((z % 2) == 0)
                continue;
            System.out.println(z);
        }

    }

    public static void printMultipleTime() {
        System.out.println(" Hello World !");
        System.out.println(" Hello World !");
        System.out.println(" Hello World !");
        System.out.println(" Hello World !");
        System.out.println(" Hello World !");
        for (int i = 1; i < 6; i++) {
            System.out.println(" Hello World !!! " + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(" Hello World !!! " + i);
        }
        printTable(9, 5);
        printTable(5, 5);
        printTableWithWhile(7, 5);

        printPrimeNumber(20);


    }

    public static void printTable(int tableFor, int tableTill) {
        for (int i=1; i <= tableTill; i++) {
            System.out.println(tableFor+" * "+i+" = "+ i*tableFor);
        }
    }

    public static void printTableWithWhile(int tableFor, int tableTill) {
        /*
        int n = 5;
        do {
            System.out.println("Hello World !! this is printed using while loop ");
            n--;
        } while (n > 0);
        */
        int i = 1;
        do {
            System.out.println(tableFor+" * "+i+" = "+ i*tableFor);
            tableTill--;
            i++;
        } while (tableTill > 0);
        System.out.println("table printing complete");
    }

    public static void printPrimeNumber(int counter) {
        System.out.println("Printing prime numbers starting from 5......");
        for (int i=5; i<counter; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i+" is prime");

        }
    }

    public static void printGender(Gender gender) {
        switch (gender) {
            case Female  : {
                System.out.println(" gender is Female");
                break;
            }
            case Male  : {
                System.out.println(" gender is Male");
                break;
            }
            default:
                System.out.println(" gender unknown");
        }
    }

    public static void printAge(int age) {
        switch (age) {
            case 10 :
                System.out.println(" age is 10");
                break;
            case 20 :
                System.out.println(" age is 20");
                break;
            default :
                System.out.println(" age is more than 20 ");
                break;
        }
    }
}
