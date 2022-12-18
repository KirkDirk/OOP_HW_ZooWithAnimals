import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveService {
    public void saveAnimals(List<Animal> animals) throws IOException {
        try (FileWriter writer = new FileWriter("animalList.txt", false)) {
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();
        }
    }
}
