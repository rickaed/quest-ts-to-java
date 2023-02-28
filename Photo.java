public class Photo {
    private String url;
    private String filename;
    private int width;
    private int height;

    public Photo(String url, String filename, int width, int height) {
        this.url = url;
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public String[] getPhoto() {
        String userPhoto[] = {
                this.url, this.filename, String.valueOf(this.width), String.valueOf(this.height)
        };
        return userPhoto;
    }
}
