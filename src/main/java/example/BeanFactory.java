package example;

public class BeanFactory {
    Bean create() {
        return new Bean("name", 1);
    }
}
