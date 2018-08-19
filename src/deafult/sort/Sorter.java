package deafult.sort;

public class Sorter {
    public static void sortList() {
        Data.sortedNumberList.add(Data.numberList.get(0));

        for (int i = 1; i < Data.numberList.size(); i++) {
            Integer numberToInsert = Data.numberList.get(i);
            int indexToInsert = findIndexToInsert(numberToInsert);
            Data.sortedNumberList.add(indexToInsert, numberToInsert);
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
