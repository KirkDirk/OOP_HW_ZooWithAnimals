public class Dog extends Animal implements Speakable, Runable, Swimmable{

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "wow";
    }

    @Override
    public Integer runSpeed() {
        return 30;
    }

    @Override
    public int swimmSpeed() {
        return 4;
    }
    
}
