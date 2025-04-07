package domain.strategy.filters;

import domain.entity.Animal;
import domain.strategy.AnimalFilterStrategy;

import java.util.List;

public class WeightFilterStrategy implements AnimalFilterStrategy {

    @Override
    public List<Animal> filter(List<Animal> animals, String value) {
        try{
            Double weight = Double.valueOf(value);
            return animals.stream()
                    .filter(animal -> weight.equals(animal.getWeight()))
                    .toList();
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Please enter a valid weight!");
        }
    }
}
