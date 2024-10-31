import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Character> Characters = new ArrayList<>();
        Characters.add(new Jedi("John", 31));
        Characters.add(new Sith("darth bingbong", 69420));
        Characters.add(new Droid("beepboop", 1));

        for (Character character : Characters){
            character.action();
        }
    }
}