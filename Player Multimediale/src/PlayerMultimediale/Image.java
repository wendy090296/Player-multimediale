package PlayerMultimediale;

import Interfaces.Brightness;

public class Image extends MultimediaElement implements Brightness {
    //PROPERTIES

    private int brightness;

    //-----------------------------------//

    //CONSTRUCTOR
    public Image(String title,int brightness) {
        super(title);
        this.brightness=brightness;
    }
    //----------------------------------//

    // INSTRUCTIONS

   public void show(){
       System.out.println( title + " " + "*".repeat(brightness));
   }

    @Override
    public void increaseBrightness() {
        this.brightness++;

    }

    @Override
    public void decreaseBrightness() {
        if(brightness>0){
            this.brightness--;
        }

    }
    //SETTER:
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}