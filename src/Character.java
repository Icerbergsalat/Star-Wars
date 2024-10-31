public abstract class Character{
    String Navn;
    int alder;

    public void action(){
        System.out.println("action");
    }
    public Character(String navn,int alder){
        System.out.println(navn);
        System.out.println(alder);
    }
}
