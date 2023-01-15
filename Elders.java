public class Elders extends Entity implements ScientificApproachSetting {
    public double getIQ_level() {
        return this.IQ_level;
    }

    public Elders(double IQ_level) {
        this.IQ_level = IQ_level;
    }

    @Override
    public void speak(String message) {
        SpeechManner speechManner1 = SpeechManner.TRUMPET;
        SpeechManner speechManner2 = SpeechManner.MELODIC;
        System.out.println(message);
    }

    @Override
    public City work(){
            Builders[] team = this.hire(1);
            City newCity = team[0].build("Новый город"); // Новый город - значение по умолчанию
            System.out.println("Старцы выстроили " + newCity.getName());
            return newCity;
    }

    @Override
    public Builders[] setScientificApproach(){
        System.out.print("Подойдя к проблеме научно, ");
        int n = (int) (Math.random() * 10) + 1;

        Builders[] team = hire(n);
        for (int i = 0; i < n; i++) {
            mine(team[i]);
        }
        System.out.println(" и наладили производство особо прочных камней");
        return team;
    }

    public Builders[] hire(int n){
        Builders[] team = new Builders[n];
        for (int i = 0; i < n; i++) {
            team[i] = new Builders();
        }
        if (n > 1){System.out.println("Старцы пригласили из " + team[n - 1].getHomeland() + " опытных строителей, чтобы использовать в работе новейшие технологии");}
        return team;
    }

    public class Grills{
        private int grillsAmount;
        private double grillsPower;
        public Grills(int grillsAmount, double grillsPower){
            this.grillsAmount = grillsAmount;
            this.grillsPower = grillsPower;
        }
        public int getGrillsAmount(){
            return this.grillsAmount;
        }
        public double getGrillsPower(){
            return this.grillsPower;
        }
    }

    public boolean checkUnderWaterLivingAbility(Grills g1){
        if (g1.getGrillsAmount() > 0){
            System.out.println("Те же без труда приспособились проводить под водой большую часть времени, ");
            if (g1.getGrillsPower() > 10){
                System.out.println("а позднее и вовсе перестали выходить на берег -- они ведь никогда не позволяли жабрам окончательно отмереть.");
            }
            return true;
        }
        return false;
    }
    public String visit(){
        return "посщения Старцами посещения живущих под водой родствнников";
    }

    public void hypnotizeShoggot(Shoggots sh) {
        sh.setObedience(103);
        sh.setSpeed(103);
    }

    public void ruleShoggots(Shoggots sh) {
        if (sh.getIQ_level() < 90.0d) {
            hypnotizeShoggot(sh);
        }
        sh.work();
    }
    public void steal(String stuff, String place) throws NullStealException{
        if ( !(stuff == null) && !(stuff.equals("")) ) {
            System.out.println("и перенесли в " + place + " " + stuff);
        }
        else{
            throw new NullStealException("Красть ничего!");
        }
    }
    public void understand(String matter){
        System.out.println("Старцы, по-видимому, и сами понимали " + matter);
    }

    public void mine(Builders b) {
        class Stone{
            public Stone(){}
        }
        int stonesAmount = (int) (Math.random() * 100);
        for (int i = 0; i < stonesAmount; i++){
            Stone s = new Stone();
        }
        b.setInventory((int) (b.getInventory().get("Клеточная масса")), (int) (b.getInventory().get("Протоплазма")), stonesAmount);
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
