package hoangytm.EventAndListener;

import org.apache.catalina.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newCachedThreadPool();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Có 100 request tới cùng lúc

        for (int i = 0; i < 100; i++) {
            executor.execute(new RequestHandler("request-" + i));

        }
        executor.shutdown(); // Không cho threadpool nhận thêm nhiệm vụ nào nữa


        while (!executor.isTerminated()) {
            // Chờ xử lý hết các request còn chờ trong Queue ...
        }
    }
}

// OUTPUT:
/*
..
..
pool-1-thread-1 Starting process request-98
pool-1-thread-1 Finished process request-98
pool-1-thread-1 Starting process request-99
pool-1-thread-1 Finished process request-99
*/