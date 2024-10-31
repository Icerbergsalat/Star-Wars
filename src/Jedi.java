public class Jedi extends Character{
    @Override
    public void action(){
        System.out.println("jedi uses force for good");
    }
    public Jedi(String name,int alder){
        super(name, alder);
    }
}