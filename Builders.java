import java.util.HashMap;
import java.util.Map;

public class Builders extends Entity implements ScientificApproachSetting {
    private String homeland = "Мурино";
    private Map<String, Integer> inventory = new HashMap<String, Integer>();


    public Builders() {
        this.setInventory(1, 1, 0);
        this.IQ_level = Math.random() * 100;
    }

    @Override
    public void speak(String s) {
    }

    @Override
    public City work() {
        return new City((int)(Math.random() * 1000), 99);
    }
    public City build(String name){
        return new City(name, (int)(Math.random() * 1000), 99);
    }

    public double getIQ_level(){
        return this.IQ_level;
    }

    @Override
    public String setScientificApproach() {
        if (this.getIQ_level() >= 10.0){return "в этот раз строительству предшествует математический рассчет";}
        return "просто повезло";
    }

    public String getHomeland() {
        return this.homeland;
    }

    final void setInventory(int e1, int e2, int e3) {
        this.inventory.put("Клеточная масса", e1);
        this.inventory.put("Протоплазма", e2);
        this.inventory.put("Камни", e3);
    }

    public Map getInventory() {
        return inventory;
    }

    public void showInventory() {
        System.out.print("Специалисты захватили с собой все необходимое для успешной деятельности, а именно: ");
        if ((int) inventory.get("Клеточная масса") > 0) {
            System.out.println("клеточную массу для производства шогготов- чернорабочих,\nспособных поднимать и перетаскивать камни;");
        }
        if ((int) inventory.get("Протоплазма") > 0) {
            System.out.println("и протоплазму, с легкостью превращавшуюся в фосфоресцирующие организмы, освещавшие темноту.");
        }
    }


    public Shoggots createShoggot() {
        Shoggots sh = new Shoggots((int)(Math.random() * 100), (int)(Math.random() * 100), 30, 40);
        setInventory((int) (this.getInventory().get("Клеточная масса")) - 1, (int) (this.getInventory().get("Протоплазма")), (int) (this.getInventory()).get("Камни"));
        return sh;
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
