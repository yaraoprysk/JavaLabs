package ua.lviv.iot.firstLab;

public class ClipPublication {
    public static void main(String[] args){
        Clip.numberOfClips = 0;
        Clip firstClip = new Clip();
        Clip secondClip = new Clip("Calvin Harris", "My Way", 220, 348000000);
        Clip thirdClip = new Clip("Queen", "Bohemian Rhapsody", 360, 1000000000,"Rock",7000000,210000,"1 august 2008" );

        System.out.println(firstClip.toString());
        System.out.println(secondClip.toString());
        System.out.println(thirdClip.toString());

        System.out.println(thirdClip.printNumberOfClips());
        System.out.println(Clip.printStaticNumberOfClips());

        Clip [] clipsArray = new Clip[4];
        int currentClipIndex = 0;
        do {
           clipsArray[currentClipIndex] = new Clip("Calvin Harris", "My Way", 220, 348000000);
            currentClipIndex++;
        }while(currentClipIndex!=4);
        for (Clip clip : clipsArray) {
            System.out.println(clip.toString());
        }
    }
}
