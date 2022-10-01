public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {10, 20, 14, 9, 16, 7, 11});

        System.out.println("Максимальная продажа = " + salesManager.max());
        System.out.println("Минимальное значение = " + salesManager.min());
        System.out.println("Среднее обрезанное значение = " + salesManager.stat());

    }
}
