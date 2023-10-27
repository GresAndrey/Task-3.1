package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String saying;

    public Dog(String saying) {
        this.saying = saying;
    }

    @Override
    public String toString() {
        return "I'm a Dog";
    }

    @Override
    void say() {
        System.out.println(saying);
    }
}
