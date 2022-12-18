public class Eagle extends Animal implements Runable, Flyable, Speakable {

    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public Integer runSpeed() {
        return 4;
    }

    @Override
    public int FlySpeed() {
        return 70;
    }

    @Override
    public String speak() {
        return "arghhh";
    }
    
}
