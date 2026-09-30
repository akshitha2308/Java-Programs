interface Camera {
    void takePhoto();
}
interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo clicked");
    }
    public void playMusic() {
        System.out.println("Playing song");
    }
}

public class Main15 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.takePhoto();
        sp.playMusic();
    }
}