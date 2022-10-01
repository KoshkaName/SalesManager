public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat() {
        int sum = 0;
        for (int sale : sales) {
            if (sale != max() && sale != min()) {
                sum += sale;

            }
        }
        sum = (sum - max() - min()) / (sales.length - 2);
        return sum;
    }
}