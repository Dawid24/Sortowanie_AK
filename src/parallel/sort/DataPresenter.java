package parallel.sort;

import deafult.sort.Data;

public class DataPresenter implements Runnable {
    @Override
    public void run() {
        System.out.println(Data.sortedNumberList);
    }
}
