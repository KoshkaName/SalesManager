public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {10, 20, 14, 9, 16, 7, 11});

        System.out.println("Максимальная продажа = " + salesManager.max());
        }
}
