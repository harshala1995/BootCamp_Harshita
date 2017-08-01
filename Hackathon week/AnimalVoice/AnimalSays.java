import org.testng.annotations.Test;

/**
 * Created by marwahh on 7/17/2017.
 */
public class AnimalSays {
    public static void main(String[] args) {
        VoiceOfAnimal voiceOfAnimal = new VoiceOfAnimal();
        voiceOfAnimal.insert("Cat","Meow");
        voiceOfAnimal.insert("Dog","Bow");
        voiceOfAnimal.insert("Camel","Grunt");
        voiceOfAnimal.insert("Cattle","mow");
        voiceOfAnimal.insert("Calf","Bleet");
        System.out.println(voiceOfAnimal.search("Cat"));
        System.out.println(voiceOfAnimal.search("Calf"));
        System.out.println(voiceOfAnimal.search("Cattle"));
        System.out.println(voiceOfAnimal.search("Car"));
    }

    @Test
    public void testInsert(){
        VoiceOfAnimal voiceOfAnimal = new VoiceOfAnimal();
        voiceOfAnimal.insert("Cat","Meow");
        voiceOfAnimal.insert("Cattle","Moo");
        voiceOfAnimal.insert("Canada","Trudeau");
        String canadaVoice = voiceOfAnimal.search("Canada");
        String voice = voiceOfAnimal.search("Cap");
        System.out.println(canadaVoice);
    }
}