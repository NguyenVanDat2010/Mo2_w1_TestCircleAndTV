public class TestTV {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnOn();
        tv1.setChannel(20);
        tv1.setVolume(5);

        TV tv2=new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1 đang ở kênh "+tv1.channel+", tv1 đang có âm lượng "+tv1.volumeLevel);
        System.out.println("tv1 đang ở kênh "+tv2.channel+", tv1 đang có âm lượng "+tv2.volumeLevel);
    }
}
