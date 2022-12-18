public class Penguin extends Animal implements Runable, Speakable, Swimmable{

    public Penguin(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int swimmSpeed() {
        return 25;
    }

    @Override
    public String speak() {
        return "yeaaaa";
    }

    @Override
    public Integer runSpeed() {
        return 6;
    }
    
}
