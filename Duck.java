public class Duck extends Animal implements Speakable, Runable, Flyable, Swimmable {

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "crya";
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public int FlySpeed() {
        return 47;
    }

    @Override
    public int swimmSpeed() {
        return 12;
    }
    
    
}
