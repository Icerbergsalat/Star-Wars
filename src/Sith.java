public class Sith extends Character{
    @Override
    public void action() {
        System.out.println("Sith taps into dark side");
    }
    public Sith(String name, int alder) {
        super(name, alder);
    }
}
