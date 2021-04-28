@author soblab

public class Television {
    private String brand;
    private int screenSize;
    private boolean powerOn;
    private int channel;
    private int volume;
    private static int count = 0;
    
    public void powerOn(){
        powerOn = !powerOn;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public int getScreenSize(){
        return screenSize;
    }
    
    public int getChannel(){
        return channel;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setChannel(int chan){
        if(chan > 0)
            channel = chan;
        else
            channel = 2;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }
    
    public Television(String b, int s){
        brand = b;
        screenSize = s;
        powerOn = false;
        channel = 2;
        volume = 10;
    }
    
    public String toString(){
        String str = "Brand: " + brand +
                "Screen size: " + screenSize +
                "Channel: " + channel +
                "Volume: " + volume +
                "Power status: " + powerOn;
        
        return str;
    }
    
    public Television(Television other){
        brand = other.brand;
        screenSize = other.screenSize;
        powerOn = other.powerOn;
        channel = other.channel;
        volume = other.volume;
        count++;
    }
    
    public boolean equals(Television other){
        return brand == other.brand && screenSize == other.screenSize 
                && powerOn == other.powerOn && channel == other.channel 
                && volume == other.volume;
    }
    
    public static void printArray(Television[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    Television[] TV = new Television[4];
    TV[0] = new Television("LG", 40);
    TV[1] = new Television("Sharp", 36);
    TV[2] = new Television("Sony", 70);
    TV[3] = new Television("Samsung", 65);
    printArray(TV);
    }
}
