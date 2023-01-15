public class Arctic extends Location{
    private String dayTime;
    public Arctic(String dayTime, double temperature){
        this.dayTime = dayTime;
        this.temperature = temperature;
    }
    public String getDayTime(){
        return this.dayTime;
    }
    public double getTemperature(){
        return this.temperature;
    }
}