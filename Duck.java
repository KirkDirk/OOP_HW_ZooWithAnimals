public class Duck extends Animal implements Speakable, Runable, Flyable, Swimmable {

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "crya";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public int FlySpeed() {
        // TODO Auto-generated method stub
        return 47;
    }

    @Override
    public int swimmSpeed() {
        // TODO Auto-generated method stub
        return 12;
    }
    
    
}
