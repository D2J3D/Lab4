
public class Architectures extends Entity{

    private String name;

    public Architectures(String name){
        this.name = name;
        this.IQ_level = Math.random() * 100;
    }

    public Architectures(){}
    public String getName(){
        return this.name;
    }
    public double getIQ_level(){
        return this.IQ_level;
    }

    @Override
    public void speak(String history){
        System.out.println("древние скульпторы рассказывали на своих барельефах о том, "  + history);
        if (history.contains("новый город")){
            SpeechManner speechManner = SpeechManner.EPIC;
            System.out.println("декадентская, упадническая манера речи преображалась, и в ней появлялись характерные эпические черты ");
        }
        else{
            SpeechManner speechManner = SpeechManner.DECADENT;
            System.out.println("рассказывали в декадентской, упаднической манере ");
        }

    }
    @Override
    public String work(){
        BasRelief brelief = new BasRelief();
        return "Барельеф заполнен.";
    }
    public void steal(String thief, String victim, String goal){
        System.out.println(thief + " в такое же гиблое для искусств время вывез из " + victim + ",\nчтобы " + goal);
    }
    public static class BasRelief{
        private static double size = 0.5;
    }
    public void suggest(String thought){
        System.out.println("Может быть, " + thought + "?");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
