public class Monkey extends Animal implements Speakable, Runable {

    public Monkey(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "iaiaiai";
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }
    
}
