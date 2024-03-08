package PlayerMultimediale;

public class Audio {
    //PROPERTIES
    private String title;
    private int duration;
    private int volume;

    //-------------------------------------//

    //CONSTRUCTOR
    public Audio(String title, int duration, int volume) {
        this.title= title;
        this.duration= duration;
        this.volume= volume;

    }
    //---------------------------------------//


    //INSTRUCTIONS

    public void play(){
        System.out.println("Registrazione audio: " + this.title);
    }

    public int increaseVolume(){
        return this.volume++;

    }

    public int decreaseVolume(){
       return  this.volume--;
    }


}

