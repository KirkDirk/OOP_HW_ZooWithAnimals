public class Dog extends Animal implements Speakable, Runable{

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "wow";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 30;
    }
    
}
