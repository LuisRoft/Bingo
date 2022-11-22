public class Table {
    public int[][] listOfTable = new int[11][10];
    public Table() {
        int filler = 1;
        for(int row = 0; row < 9; row++) {
            for (int col = 0; col < 10; col++) {
                listOfTable[row][col] = filler;
                filler++;
            }
        }
    }
    public void printTable() {
        for (int row = 0; row < 9; row++) {
            System.out.println("|\t" + listOfTable[row][0] + "\t|\t" + listOfTable[row][1] + "\t|\t" + listOfTable[row][2] + "\t|\t" + listOfTable[row][3] + "\t|\t" + listOfTable[row][4] + "\t|\t" + listOfTable[row][5] + "\t|\t" + listOfTable[row][6] + "\t|\t" + listOfTable[row][7] + "\t|\t" + listOfTable[row][8] + "\t|\t" + listOfTable[row][9] + "\t|\t");
        }
    }

}
