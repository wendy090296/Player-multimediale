package PlayerMultimediale;

import Interfaces.Brightness;
import Interfaces.Playable;

public class Audio extends MultimediaElement implements Playable {
    //PROPERTIES

    private int duration;
    private int volume;

    //-------------------------------------//

    //CONSTRUCTOR
    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;

    }


    //---------------------------------------//


    //INSTRUCTIONS



    @Override
    public void play() {
        for (int i = 0; i < duration; i++){
            System.out.println(this.title + " " + "!".repeat(volume)); //ripeto la stringa ! per tante volte quante sono quelle in cui viene passato volume;
        }

    }

    @Override
    public int increaseVolume() {
       return  this.volume++;

    }



    @Override
    public int decreaseVolume() {
        if(this.volume>0){
            return this.volume--;
        }
        return 0;
    }

//SETTER:

    public void setVolume(int volume) { // perché volume é  private e non accessibile dall'esterno.
        this.volume = volume;
    }

}

