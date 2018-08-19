package deafult.sort;

import parallel.sort.DataPresenter;
import parallel.sort.SorterThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //Zwykle sortowanie (bez watkow)
        /*
        ReadUtil.readNumbersFromFile();
        Sorter.sortList();
        System.out.println(Data.numberList);
        System.out.println(Data.sortedNumberList);
        */

        //sortowanie na watkach
        ReadUtil.readNumbersFromFile();
        System.out.println(Data.numberList);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        scheduledExecutorService.schedule(new SorterThread(0,10), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new SorterThread(10,19), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new DataPresenter(), 3, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
