package parallel.sort;

import deafult.sort.Data;

public class SorterThread implements Runnable {

    int startIndex;
    int endIndex;

    public SorterThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {

        for (int i = this.startIndex; i < this.endIndex; i++) {
            Integer numberToInsert = Data.numberList.get(i);
            synchronized (Data.sortedNumberList) {
                int indexToInsert = findIndexToInsert(numberToInsert);
                Data.sortedNumberList.add(indexToInsert, numberToInsert);
            }
        }
    }

    private static int findIndexToInsert(Integer numberToInsert) {
        for (int i = 0; i < Data.sortedNumberList.size(); i++) {
            if(numberToInsert < Data.sortedNumberList.get(i)) {
                return i;
            }
        }
        return Data.sortedNumberList.size();
    }
}
