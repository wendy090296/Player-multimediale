package PlayerMultimediale;

import Interfaces.Brightness;
import Interfaces.Playable;

public class Video extends MultimediaElement implements Playable, Brightness {
    //PROPERTIES

    private int brightness;
    private int volume;
    private int duration;

    //----------------------------//

    //CONSTRUCTOR

    public Video(String title,int brightness,int volume, int duration){
        super(title);
        this.brightness=brightness;
        this.volume=volume;
        this.duration=duration;

    }

    //------------------------------//

    //INSTRUCTIONS

    @Override
    public int increaseVolume() {
        this.volume++;
        return 0;
    }
    @Override
    public int decreaseVolume() {
        if (volume > 0) {
            return this.volume--;
        }else return 0;

    }



    @Override
    public void increaseBrightness() {
        this.brightness++;

    }

    @Override
    public void decreaseBrightness() {
        if(this.brightness>0){
            this.brightness--;
        }


    }

    @Override
    public void play() {
        for(int i=0; i<duration; i++){
            System.out.println(this.title+ " " + "!" .repeat(volume) + " " + "*".repeat(brightness));

    }

   }


    //SETTER:

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

}
