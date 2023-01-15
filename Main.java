public class Main {
    public static void main(String[] args) {
        City capital = new City("Столица","Материк", (int) (Math.random() * 2000), 97);
        Architectures a1 = new Architectures();
        Elders e1 = new Elders((int) (Math.random() * 100));
        City newCity = e1.work();
        Sea s1 = new Sea("мрачного", 35);
        newCity.setLocation(s1.getName());
        if (!(newCity.getLocation().equals("материк"))){
            System.out.println("не на пологих берегах, а " + newCity.getLocation() + " - " + s1.getTemperatureInfo() + s1.getDepthInfo());
        }
        e1.checkUnderWaterLivingAbility(e1.new Grills(3, 15.5));
        System.out.println("На отдельных барельфах мы видели картины " + e1.visit());
        System.out.println("Не сумщала их и " + s1.getLightLevelInfo());
        Arctic arctic1 = new Arctic("ночь", -88);
        System.out.println("сказалась привычка к долгим арктическим " + arctic1.getDayTime());
        System.out.print("Когда ");
        a1.speak("как на дне подземного моря закладывали новый город");
        if (e1.getIQ_level() > 10) {
            Builders[] teamBuilders = e1.setScientificApproach();
            Builders b1 = teamBuilders[0];
            b1.showInventory();
            Shoggots sh1 = b1.createShoggot();
            e1.ruleShoggots(sh1);
            //City newCity = b1.build("Грандиозный");
            //newCity.setLocation("на дне мрачного моря");
            System.out.print("И вот " + newCity.getLocation() + " вырос ");
            if (newCity.getSize() > 100) {
                System.out.print("громадный ");
            } else {
                System.out.print("скромный ");
            }
            System.out.println("город, напоминающий древнюю столицу, а мастерством исполнения ");
            if (newCity.findGreater(newCity, capital).equals(newCity)) {
                System.out.println("превосходивший, ибо " + b1.setScientificApproach());
            } else {
                System.out.print("недотягивающий. ");
            }
            Architectures a2 = new Architectures("бедняга Лейк");
            System.out.println("Со Старцами они изъяснялись, подражая их голосам, мелодичными, трубными звуками, слышными,\nесли правильно предположил" + a2.getName() + ", на большом расстоянии");
            try{
                sh1.grow();
            } catch (LackOfSkillsException e){
                System.out.println(e.getMessage());
            }
            if (sh1.getIQ_level() >= 10){
                System.out.print("и значительного интеллекта, понимая и исполняя приказы с удивительной быстротой.");
            }
            else{
                System.out.print("и отупели.");
            }
            if (sh1.getObedience() != 103){
                // obedience = 103 - критерий загипнотизированности шоггота
                System.out.println("теперь шогготы подчинялись не гипнотическому внушению, а простым командам и были идеально послушны" );
            }
            Luminescent ph1 = new Luminescent(){
                @Override
                public void shine(){}
            };
            ph1.shine();
            System.out.println("\nФосфоресцирующие организмы полностью обеспечивали Старцев светом,\nкомпенсируя этим утрату полярных сияний -- непременных спутников антарктических ночей.");

            Arts arts1 = new Arts(8);
            if (arts1.getGreatness() < 10){
                System.out.println("Изобразительные искусства продолжали существовать, хотя их упадок был очевиден.");
            }
            else{
                System.out.println("Изобразительные искусства были в рассвете.");
            }
            e1.understand("это");
            Architectures imperator = new Architectures("Константин Великий");
            System.out.println("потому что во многих случаях предвосхитили политику Константина Великого ");
            e1.steal("несколько глыб с великолепными обрацзами древней резьбы", "подводный город");
            System.out.print("подобно тому, как ");
            imperator.steal(imperator.getName(), "Грецию и Азию", "чтобы сделать свою новую столицу Византию ещё более прекрасной.");
            City Vizantia = new City("Византия", "Побережье", 7000, 93, 101);
            if (Vizantia.getPeopleAmount() < 1000){
                System.out.println("То, что Старцы не забрали из бывшей столицы все барельефы, объяснялось несомненно тем, что\n первое время город на суше не был еще полностью заброшен.");
            }
            Vizantia.setPeopleAmount(0);
            System.out.println("Когда же он полностью обезлюдел - а это случилось ");
            if (arctic1.getTemperature() > -150){
                System.out.println("до прихода великих холодов плейстоцена, - ");
            }
            System.out.println(" Старцев уже, видимо, вполне устраивало современное искусство,\n и они перестали замечать особое совершенство работы древних резчиков и ваятелей.");
            System.out.println("Во всяком случае, вековечные руины вокруг нас во многом сохранили свои первоначальные красоты,\n хотя все, что было легко вывезти, особенно отдельно стоявшие прекрасные скульптуры, обрело новое пристанище на дне подземного моря.");
        }
        else{
            System.out.println();
        }
    }
}