package MultiplicationTable;

public class MultiplicatioTable {
    private int size = 10;

    public MultiplicatioTable(int size) {
        this.size = size;
    }

    public void calculate() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}