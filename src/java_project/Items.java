
package java_project;


public class Items {
    
    private int code;
    private String name;
    private String artist;
    private float price;
    private byte[] Image;
    
    public Items(int pcod,String pname,String partist,float pprice,byte[] pimg)
    {
        this.code = pcod;
        this.name = pname;
        this.artist = partist;
        this.price = pprice;
        this.Image = pimg;
    }
    public int getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public float getPrice(){
        return price;
    }
    public byte[] getImage(){
        return Image;
    }
    
    
}
