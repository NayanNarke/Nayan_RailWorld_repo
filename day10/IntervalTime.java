package day10;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IntervalTime {

	public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        
        Runnable task = () -> {
            
            System.out.println("Task executed at: " + System.currentTimeMillis() ) ;
        };

        
        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        
        executor.schedule(() -> executor.shutdown(), 10, TimeUnit.SECONDS);

}
}