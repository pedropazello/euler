public class Timer {
    private Long stime;
    private Long rtime;
    private String methodName = "Method name: ";

    Timer(String methodName) {
        this.methodName += methodName;
        this.stime = System.currentTimeMillis();
    }

    public String runTime() {
        this.rtime = System.currentTimeMillis() - stime;

        return methodName + "\nTime: " + this.rtime + " milliseconds";
    }
}
