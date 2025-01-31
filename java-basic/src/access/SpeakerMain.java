package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // 볼륨 필드에 private 접근제어자 사용해서 외부에서 접근을 금지함
        speaker.showVolume();
    }
}
