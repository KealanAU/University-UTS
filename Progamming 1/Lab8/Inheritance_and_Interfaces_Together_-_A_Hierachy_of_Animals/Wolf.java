public class Wolf extends Animal implements Noisy, Mobile{

    public String makeNoise(){
        return "The wolf howls.";
    }

    public String move(){
        return "The wolf lopes.";
    }
    
    @Override
    public String eat() {
        return "The wolf eats meat.";
    }
}
