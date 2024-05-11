public class loops {
    public static void main(String[] args) {
        forLoop();
    }

    // while loop
    public static void whileLoop() {
        int myInt = 0;
        while (myInt < 10) {
            System.out.println(myInt);
            myInt = myInt + 1;

        }
    }

    // for loop
    public static void forLoop() {
        // ;; deler loopen inn i 3 deler
        // den første er kode som skjer før looper begynner ofte å lage et variabel
        // i skriver du hva som skal være true for loopen
        // i den siste skriver du hva som skjer hver gang loopen har gjort en runde.
        for (short i = 0; i < 5; i++) {
            System.out.println("hello");

        }

    }

}
