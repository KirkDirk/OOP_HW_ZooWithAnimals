public abstract class Animal {
    private String nickname;
    private int legs;
    private String owner;

    public String getNickname() {
        return nickname;
    }
    public int getLegs() {
        return legs;
    }
    public String getOwner() {
        return owner;
    }
    public Animal(String nickname, int legs, String owner) {
        this.nickname = nickname;
        this.legs = legs;
        this.owner = owner;
    }

    //public abstract String speak();
    

    @Override
    public String toString() {
        return "Animal [nickname=" + nickname + ", legs=" + legs + ", owner=" + owner + "]";
    }

    
}
