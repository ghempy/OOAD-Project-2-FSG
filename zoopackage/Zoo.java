package zoopackage;

public class Zoo{
    public Zookeeper keeper;
    public ZooFoodServer server;
    public static ZooAnnouncer announcer;   //needs to be static to be referenced by the ZooEmployee
    public static Animal[] all_animals;
    public static Clock clock;

    public Zoo(int numDays){
        //Abstraction example regarding lines 10-30 where we are creating new animals w/ names
        //Identity example regarding lines 10-40 (excluding 11) are examples of object identity because each new animal object is given its own unique name identifier.
       
        all_animals = new Animal[20];
        Alligator allison = new Alligator("Allison");
        Alligator abraham = new Alligator("Abraham");
        Dog dale = new Dog("Dale");
        Dog daisy = new Dog("Daisy");
        Elephant edward = new Elephant("Edward");
        Elephant ellie = new Elephant("Ellie");
        Hippo harriet = new Hippo("Harriet");
        Hippo harrison = new Hippo("Harrison");
        Leopard lenny = new Leopard("Lenny");
        Leopard lydia = new Leopard("Lydia");
        Rhino rebecca = new Rhino("Rebecca");
        Rhino ron = new Rhino("Ron");
        Snake sally = new Snake("Sally");
        Snake sergio = new Snake("Sergio");
        Tiger tony = new Tiger("Tony");
        Tiger taryn = new Tiger("Taryn");
        Wolf willie = new Wolf("Willie");
        Wolf wendy = new Wolf("Wendy");
        Cat cathy = new Cat("Cathy");
        Cat clayton = new Cat("Clayton");

        all_animals[0] = allison;
        all_animals[1] = abraham;
        all_animals[2] = cathy;
        all_animals[3] = clayton;
        all_animals[4] = dale;
        all_animals[5] = daisy;
        all_animals[6] = edward;
        all_animals[7] = ellie;
        all_animals[8] = harriet;
        all_animals[9] = harrison;
        all_animals[10] = lenny;
        all_animals[11] = lydia;
        all_animals[12] = rebecca;
        all_animals[13] = ron;
        all_animals[14] = sally;
        all_animals[15] = sergio;
        all_animals[16] = tony;
        all_animals[17] = taryn;
        all_animals[18] = willie;
        all_animals[19] = wendy;

        clock = new Clock();
        keeper = new Zookeeper("Zach");
        server = new ZooFoodServer("Steve");
        announcer = new ZooAnnouncer("Morgan Freeman");
        clock.start(numDays);

    }
}