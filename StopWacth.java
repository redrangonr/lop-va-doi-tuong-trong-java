public class StopWacth {
    double startTime;
    double endTime;

    public StopWacth() {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

       public void Stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElaspTime(){
        return  endTime- startTime;
    }

    public static void main(String[] args) {
        StopWacth stopWacth = new StopWacth();
        stopWacth.Start();
        for(int i =0;i<1000;i++){
            for(int j=0;j<1000;j++){
                System.out.println(i);
            }
        }
        stopWacth.Stop();
        System.out.println(stopWacth.getElaspTime());
    }
}
