package PlayerMultimediale;

public class Image {
    //PROPERTIES
    private String title;
    private int brightness;

    //-----------------------------------//

    //CONSTRUCTOR
    public Image(String title,int brightness) {
        this.title = title;
        this.brightness=brightness;
    }
    //----------------------------------//

    // INSTRUCTIONS
    public void show(){
        System.out.println("L'immagine é: " + this.title);
    }
}