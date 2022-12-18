public class Eagle extends Animal implements Runable, Flyable, Speakable {

    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public int FlySpeed() {
        // TODO Auto-generated method stub
        return 70;
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "arghhh";
    }
    
}
