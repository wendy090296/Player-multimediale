package PlayerMultimediale;

public class Video{
    //PROPERTIES
    private String title;
    private int brightness;
    private int volume;

    //----------------------------//

    //CONSTRUCTOR

    public Video(String title,int brightness,int volume){
        this.title=title;
        this.brightness=brightness;
        this.volume=volume;

    }

    //------------------------------//

    //INSTRUCTIONS
    public int increaseVolume(){
        return this.volume++;

    }

    public int decreaseVolume(){
        return  this.volume--;
    }

    public int increaseBrightness(){
        return this.brightness++;
    }

    public int decreaseBrightness(){
        return this.brightness--;
    }
}
