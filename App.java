// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class App {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Monkey("Fobos", 4, "Vladimir"))
            .addAnimal(new Dog("Bars", 4, "Abbos"))
            .addAnimal(new Monkey("Mars", 4, "Alex"))
            .addAnimal(new Duck("Donald", 2, "Igor"))
            .addAnimal(new Eagle("White", 2, "USA"))
            .addAnimal(new Penguin("Crush", 2, "Antarctica"));
        
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable item : zoo.gRunable()) {
            System.out.println(item.runSpeed());
        }
        System.out.println("Max runSpeed = " + zoo.getMaxSpeed());

        for (Flyable item : zoo.gFlyable()) {
            System.out.println(item.FlySpeed());
        }
        System.out.println("Max flySpeed = " + zoo.getMaxFlySpeed());

        for (Swimmable item : zoo.gSwimmable()) {
            System.out.println(item.swimmSpeed());
        }
        System.out.println("Max swimmSpeed = " + zoo.getMaxSwimmSpeed());

        SaveService saveZoo = new SaveService();
        saveZoo.saveAnimals(zoo.getAnimals());
    }
    


}
