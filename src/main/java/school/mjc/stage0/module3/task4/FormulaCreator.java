package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        char a = 1;
        char b = 2;

        double result = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((double) (a + b - 4 * a * b) / 2);
        System.out.println(result);
    }
}
