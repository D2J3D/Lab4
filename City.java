public class City extends Location{
    private int peopleAmount;
    public City(String name, String location, double size, double greatness, int peopleAmount){
        this.name = name;
        this.greatness = greatness;
        this.location = location;
        this.size = size;
        this.peopleAmount = peopleAmount;
    }
    public City(String name, String location, double size, double greatness){
        this.name = name;
        this.greatness = greatness;
        this.location = location;
        this.size = size;
    }
    public City(String name, double size, double greatness){
        this.name = name;
        this.greatness = greatness;
        this.size = size;
    }
    public City(double size, double greatness){
        this.greatness = greatness;
        this.size = size;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public double getSize() {
        return size;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public double getTemperature(){
        return this.temperature;
    }

    public double getGreatness() {
        return greatness;
    }
    public void setPeopleAmount(int peopleAmount){
        this.peopleAmount = peopleAmount;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }


    public City findGreater(City c1, City c2){
        if (c1.getGreatness() > c2.getGreatness()){
            return c1;
        }
        return c2;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
