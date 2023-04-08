import java.time.LocalTime;

public class LopStopWatch {
    LocalTime startTime;
    LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }

    LopStopWatch() {
        startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }

    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        int ElaspedTime = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()*10000));
        System.out.println("so don  vi miligiay " + -ElaspedTime + " Milisecone");

    }
    public static void main(String[] args) {
        LopStopWatch stopWatch = new LopStopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i = 0 ; i <= 100000 ; i++ ){
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}