public class Test { //class declaration
    //variable name - starts with small, no special char, camel case, case sensitive
    public static String classVariable = "i am class level variable";
    String instanceVariable = "i am an instance variable";
    //Naming convention - name of the constructor same as its class name; no return type; can not be abstract, static, final, synchronized
    //Naming convention - name of the constructor same as its class name; no return type; can not be abstract, static, final, synchronized
    public Test() { //constructor
    }

    public static void main(String[] args) { //method declaration
        //System.out.println("Hello World !"); //statements/instructions
        //String localVariable = "i am a local variable";
        //System.out.println("this is local variable " + localVariable); //statements/instructions
        
        /*
        MusicPlayer musicPlayer = new MusicPlayer();
        int currentTrack = musicPlayer.getCurrentTrack();
        System.out.println("current tracking playing : " + currentTrack);
        musicPlayer.playNextTrack();
        musicPlayer.playNextTrack();
        currentTrack = musicPlayer.getCurrentTrack();
        System.out.println("current tracking playing : " + currentTrack);
        musicPlayer.playPreviousTrack();
        currentTrack = musicPlayer.getCurrentTrack();
        System.out.println("current tracking playing : " + currentTrack);
        */
        
        MusicalInstrument musicalInstrument = new MusicalInstrument();
        musicalInstrument.playSound();
        Flute flute = new Flute();
        flute.playSound();
        
        //new Circle(2).area();
        //new Rectangle(2, 3).area();
        //new Square(5).area();
        //Shape shape = new Circle(3.5f);
        //shape.area();
    }
}
