public class Flute extends MusicalInstrument {
    private void playFlute() {
        System.out.println("Playing Flute ...");
    }

    @Override
    public void playSound() {
        //super.playSound();
        playFlute();
    }
}
