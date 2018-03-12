import java.util.*;

public class Network {
//    private final ArrayList<Printer> devicesPrinter; removidos en el momento qu eemopezamos a usar el ICONNECT
    private String name;
//    private ArrayList<Desktop> devicesDesktop;
    private ArrayList<IConnect> devices;
    private int maxDevices;

    public Network(String name, int maxDevices){
        this.devices = new ArrayList<>();
//        this.devicesDesktop = new ArrayList<Desktop>();
//        this.devicesPrinter = new ArrayList<Printer>();
        this.name = name;
        this.maxDevices = maxDevices;
    }


    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

//        public int deviceCount(){
//        return devices.size();
//    }
//
//    public void connect(Desktop desktop){
//        devicesDesktop.add(desktop);
//    }

        public void connect(IConnect device){
        if (howManyFreeSlots() > 0){
            devices.add(device);
        }

//        device.connect("bla bla");
    }
    public void connect(Printer printer){
//        devicesPrinter.add(printer);
    }

//    public void disconnectAll(){
//        devicesDesktop.clear();
////        devicesPrinter.clear();
//
//    }

        public void disconnectAll(){
        devices.clear();

        }

    public int howManyFreeSlots() {
        return this.maxDevices-deviceCount();
    }


}