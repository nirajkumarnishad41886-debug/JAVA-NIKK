class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
        }
    }

    public void reset() {
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }

    public long getElapsedTime() {
        if (isRunning) {
            return elapsedTime + (System.currentTimeMillis() - startTime);
        }
        return elapsedTime;
    }
}

public class JAVA {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch sw = new Stopwatch();

        sw.start();
        Thread.sleep(2000);

        sw.stop();
        System.out.println(sw.getElapsedTime());

        sw.reset();
        System.out.println(sw.getElapsedTime());
    }
}