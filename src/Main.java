public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for (int i = 5; i >= 0; i--) {
            System.out.print("i = " + i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Приввет и добро пожаловать");
    }
}