// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class App {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Monkey("Fobos", 4, "Vladimir"))
            .addAnimal(new Dog("Bars", 4, "Abbos"))
            .addAnimal(new Monkey("Mars", 4, "Alex"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable item : zoo.gRunable()) {
            System.out.println(item.runSpeed());
        }
        System.out.println(zoo.getMaxSpeed());
    }


}
