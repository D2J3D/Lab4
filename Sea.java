public class Sea extends Location{
    private double depth;
    public Sea(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String getName(){
        return "на дне " + this.name + " моря";
    }
    public String getTemperatureInfo(){
        //TODO
        return "температура была равномерно теплой.";
    }
    public String getDepthInfo(){
        return "Огромная глубина моря давала гарантию, что внутренний жар земли позволит новым поселенцам жить сколько потребуется";
    }
    public String getLightLevelInfo(){
        return "вечная тьма земных недр";
    }

}
