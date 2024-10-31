public class Droid extends Character{
    @Override
    public void action() {
        System.out.println("droid shoots");
    }
    public Droid(String name, int alder) {
        super(name, alder);
    }
}
