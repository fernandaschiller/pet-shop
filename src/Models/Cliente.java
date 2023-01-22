package Models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private int id;
    private List<Animal> animal = new ArrayList<>();

    public Cliente(int id, List<Animal> animal) {
        this.id = id;
        this.animal = animal;
    }

    public Cliente(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<Animal> getAnimal() {
        return animal;
    }
    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
}
