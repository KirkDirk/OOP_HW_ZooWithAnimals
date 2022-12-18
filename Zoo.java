import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }


    
    @Override
    public String toString() {
        return "Zoo [animals=" + animals + "]";
    }

    public String talk() {
        StringBuilder speaks = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            speaks.append(item.speak() + "\n");            
        }
        return speaks.toString();
    }

    private List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable) {
                result.add((Speakable) item);
            }
        }        
        result.add(new Radio());
        return result;
    }

    public List<Runable> gRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }        
        return result;
    }

    public List<Flyable> gFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }        
        return result;
    }

    public List<Swimmable> gSwimmable(){
        List<Swimmable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimmable) {
                result.add((Swimmable) item);
            }
        }        
        return result;
    }

    public int getMaxSpeed(){
        int max = 0;
        for (Runable item : gRunable()) {
            if(item.runSpeed()>max) max = item.runSpeed();
        }
        return max;
    }

    public int getMaxFlySpeed(){
        int maxFly = 0;
        for (Flyable item : gFlyable()) {
            if(item.FlySpeed() >maxFly) maxFly = item.FlySpeed();
        }
        return maxFly;
    }

    public int getMaxSwimmSpeed(){
        int maxSwimm = 0;
        for (Swimmable item : gSwimmable()) {
            if(item.swimmSpeed() >maxSwimm) maxSwimm = item.swimmSpeed();
        }
        return maxSwimm;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

}
