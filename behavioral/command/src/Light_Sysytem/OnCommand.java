package Light_Sysytem;

public class OnCommand implements ECommand{
    ElectronicDevice electronicDevice;

    public void setElectronicDevice(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        System.out.println("switching on ...");
        electronicDevice.on();
    }
}
