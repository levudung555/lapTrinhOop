package Animals;

public  class Cat extends Animal implements Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo ");
    }

    @Override
    public void play() {
        System.out.println("Mèo đang đuổi bóng lên ");
    }
}
