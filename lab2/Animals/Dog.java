package Animals;

public class Dog  extends Animal implements Pet{
    public Dog(String name){
        super( name);
    }
    @Override
    public void makeSound() {
        System.out.println("Gâu Gâu ");
    }

    @Override
    public void play() {
        System.out.println("Con chó đang chơi ném bóng");
    }
}
