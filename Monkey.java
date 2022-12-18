public class Monkey extends Animal implements Speakable, Runable {

    public Monkey(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "iaiaiai";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 10;
    }
    
}
