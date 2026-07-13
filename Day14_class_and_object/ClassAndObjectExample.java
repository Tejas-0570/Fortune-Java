class ClassAndObjectExample{
    public static void main(String[] args) {
        Animal Tiger = new Animal();

        Tiger.age = 50;
        Tiger.name = "Bengol Tiger";
        Tiger.color = "Orange";

        System.out.println("Tiger's age : "+Tiger.age);
        System.out.println("Tiger's name : "+Tiger.name);
        System.out.println("Tiger's color : "+Tiger.color);

        Tiger.eating();
        Tiger.sleeping();
        Tiger.running();
    }
}


class Animal{
    int age;
    String name;
    String color;

    void eating(){
        System.out.println("Eating...");
    }

    void sleeping(){
        System.out.println("Sleepig...");
    }

    void running(){
        System.out.println("Running...");
    }
}
