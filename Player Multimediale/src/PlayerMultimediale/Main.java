package PlayerMultimediale;

import java.util.Scanner;


 ;

    public class Main {
        public static void main(String[] args) {
//
//        testo corretto funzionamento del codice
//
        Audio ventoDiPassione = new Audio("Vento Di Passione", 5, 3);

        ventoDiPassione.play();

       System.out.println("---------------");
        ventoDiPassione.decreaseVolume();
        ventoDiPassione.play();
        System.out.println("---------------");
        ventoDiPassione.increaseVolume();
        ventoDiPassione.increaseVolume();
        ventoDiPassione.play();

        Video spotPubblicitario = new Video("Spot pubblicitario L'Oreal", 2, 2,3);

        spotPubblicitario.play();

        System.out.println("---------------");
        spotPubblicitario.decreaseVolume();
        spotPubblicitario.play();
       System.out.println("---------------");
        spotPubblicitario.increaseVolume();
        spotPubblicitario.increaseVolume();
        spotPubblicitario.increaseVolume();
        spotPubblicitario.play();
        System.out.println("---------------");
        spotPubblicitario.decreaseBrightness();
        spotPubblicitario.play();
        System.out.println("---------------");
        spotPubblicitario.increaseBrightness();
        spotPubblicitario.play();

        Image fotoAlMare = new Image("La mia foto",5);
        fotoAlMare.show();
        System.out.println("---------------");
        fotoAlMare.increaseBrightness();
        fotoAlMare.increaseBrightness();
        fotoAlMare.show();
        System.out.println("---------------");
        fotoAlMare.decreaseBrightness();
        fotoAlMare.show();

            Scanner scanner = new Scanner(System.in);

            MultimediaElement[] mediaArray = new MultimediaElement[5];

            // 1     File audio

                System.out.println("BENVENUTO, questo é il nostro Player multimediale:)- Inserisci il tuo tipo di elemento preferito da creare : premi 1 per file audio, premi 2 per file video, 3 per un'immagine e premi INVIO ");
            for (int i = 0; i < 1; i++) {
                String title = scanner.nextLine();
                System.out.println(" OTTIMO! Hai scelto il tipo di file Audio");
                System.out.println("Ora inserisci la durata dell'audio:");
                int duration = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci il volume dell'audio");
                int volume = Integer.parseInt(scanner.nextLine());
                System.out.println("Media creato!");
                mediaArray[i] = new Audio(title, volume, duration);
            }

            // 2 file video
            for (int i = 1; i < 3; i++) {
                System.out.println(" OTTIMO! Hai scelto il tipo di file Video");

                String title = scanner.nextLine();
                System.out.println("STEP 1) Inserisci il titolo del video: " );
                System.out.println("STEP 2) Inserisci la durata del video: ");
                int duration = Integer.parseInt(scanner.nextLine());
                System.out.println(" STEP 3) Inserisci la luminosità del video: " );
                int brightness = Integer.parseInt(scanner.nextLine());
                System.out.println("STEP 4) Inserisci il volume del video: " );
                int volume = Integer.parseInt(scanner.nextLine());
                mediaArray[i] = new Video(title, volume, duration, brightness);
            }

            //  2 file immagini
            for (int i = 3; i < 5; i++) {
                System.out.println(" OTTIMO! Hai scelto il tipo di file Immagine");
                System.out.println("Inserisci il titolo dell'immagine : " );
                String title = scanner.nextLine();
                System.out.println("Inserisci la luminosità dell'immagine: ");
                int brightness = Integer.parseInt(scanner.nextLine());
                mediaArray[i] = new Image(title, brightness);
            }



        System.out.println("Media inseriti:");
        for (MultimediaElement media : mediaArray) {
            System.out.println(media);
           }



            int input;
            do {
                System.out.println("Premi 1 => audio, 2 => per primo video, 3 => per secondo video, 4 => per prima immagine, 5=> per seconda immagine. Premi 0 per uscire! ");
                input = scanner.nextInt();

                switch (input) {
//              cast esplicito per converitre elemento di tipo MultimedialElement in elemento di tipo audio
                    case 1: ((Audio) mediaArray[0]).play(); break;
                    case 2: ((Video) mediaArray[1]).play(); break;
                    case 3: ((Video) mediaArray[2]).play(); break;
                    case 4: ((Image) mediaArray[3]).show(); break;
                    case 5: ((Image) mediaArray[4]).show(); break;
                    default:
                        System.out.println("Il numero inserito non é corretto! Devi utilizzare un numero da 1 a 5 oppure 0 per uscire.");
                }
            } while (input != 0);


            scanner.close();
        }

    }
