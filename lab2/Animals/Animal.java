package Animals;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void introduce(){
        System.out.println("tên của nó là : "+name);
    }
    public abstract void makeSound();
}
