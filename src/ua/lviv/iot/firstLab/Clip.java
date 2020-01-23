package ua.lviv.iot.firstLab;

public class Clip {
    private String nameOfPerformer;
    private String nameOfTheSong;
    private int durationInSeconds;
    private int numberOfViewsOnYouTube;
    private String genreOfSong;
    private int numberOfLikes;
    public static int numberOfClips;
    protected int numberOfDownloads;
    protected String releaseDate;

    public Clip(String nameOfPerformer, String nameOfTheSong, int durationInSeconds, int numberOfViewsOnYouTube, String genreOfSong, int numberOfLikes, int numberOfDownloads, String releaseDate) {
        this.nameOfPerformer = nameOfPerformer;
        this.nameOfTheSong = nameOfTheSong;
        this.durationInSeconds = durationInSeconds;
        this.numberOfViewsOnYouTube = numberOfViewsOnYouTube;
        this.genreOfSong = genreOfSong;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDownloads = numberOfDownloads;
        this.releaseDate = releaseDate;
        Clip.numberOfClips++;
    }

    public Clip(String nameOfPerformer, String nameOfTheSong, int durationInSeconds, int numberOfViewsOnYouTube) {
        this(nameOfPerformer, nameOfTheSong, durationInSeconds, numberOfViewsOnYouTube, "0", 0, 0, "0");
    }

    public String getNameOfPerformer() {
        return nameOfPerformer;
    }

    public void setNameOfPerformer(String nameOfPerformer) {
        this.nameOfPerformer = nameOfPerformer;
    }

    public String getNameOfTheSong() {
        return nameOfTheSong;
    }

    public void setNameOfTheSong(String nameOfTheSong) {
        this.nameOfTheSong = nameOfTheSong;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getNumberOfViewsOnYouTube() {
        return numberOfViewsOnYouTube;
    }

    public void setNumberOfViewsOnYouTube(int numberOfViewsOnYouTube) {
        this.numberOfViewsOnYouTube = numberOfViewsOnYouTube;
    }

    public String getGenreOfSong() {
        return genreOfSong;
    }

    public void setGenreOfSong(String genreOfSong) {
        this.genreOfSong = genreOfSong;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public static int getNumberOfClips() {
        return numberOfClips;
    }

    public static void setNumberOfClips(int numberOfClips) {
        Clip.numberOfClips = numberOfClips;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Clip() {
        this("0", "0", 0, 0, "0", 0, 0, "0");
    }

    @Override
    public String toString() {
        return "Clip{" +
                "nameOfPerformer='" + nameOfPerformer + '\'' +
                ", nameOfTheSong='" + nameOfTheSong + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                ", numberOfViewsOnYouTube=" + numberOfViewsOnYouTube +
                ", genreOfSong='" + genreOfSong + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", numberOfDownloads=" + numberOfDownloads +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
    public static String printStaticNumberOfClips() {
        return "Static number of clips = " + numberOfClips;
    }
    public String printNumberOfClips() {
        return "Number of clips = " + numberOfClips;
    }
    public void resetValues(String nameOfPerformer, String nameOfTheSong, int durationInSeconds, int numberOfViewsOnYouTube, String genreOfSong, int numberOfLikes, int numberOfDownloads, String releaseDate) {
        this.nameOfPerformer = nameOfPerformer;
        this.nameOfTheSong = nameOfTheSong;
        this.durationInSeconds = durationInSeconds;
        this.numberOfViewsOnYouTube = numberOfViewsOnYouTube;
        this.genreOfSong = genreOfSong;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDownloads = numberOfDownloads;
        this.releaseDate = releaseDate;
    }

}


