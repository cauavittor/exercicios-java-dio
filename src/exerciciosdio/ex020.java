package exerciciosdio;

public class ex020 {
    public static void main(String[] args) {
                int num = 1;
                while (num < 11) {
                    for (int i = 0; i <= 10; i++) {
                        int result = num * i;
                        System.out.println(num + " X " + i + " = " + result);
                    }
                    num = num + 1;
                    System.out.println();
                }
    }
}
