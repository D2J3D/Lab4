public class Arts{
    private double greatness;
    private int age;
    private String author;
    public Arts(double greatness){
        this.greatness = greatness;
    }
    public Arts(String author, double greatness){
        this.author = author;
        this.greatness = greatness;
    }
    public Arts(String author, double greatness, int age){
        this.author = author;
        this.greatness = greatness;
        this.age = age;
    }

    public double getGreatness() {
        return this.greatness;

    }
    public String getAuthor() {
        return author;
    }
    public int getAge(){
        return this.age;
    }
}