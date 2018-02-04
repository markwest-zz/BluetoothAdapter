package bluetooth.adapter.dto;

/**
 * Created by Mark on 2/4/2018.
 */

public class BluetoothAdapterDto {

    private String address;
    private int maximumAdvertisingDataLength;
    private String name;
    private int profileConnectionState;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaximumAdvertisingDataLength() {
        return maximumAdvertisingDataLength;
    }

    public void setMaximumAdvertisingDataLength(int maximumAdvertisingDataLength) {
        this.maximumAdvertisingDataLength = maximumAdvertisingDataLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileConnectionState() {
        return profileConnectionState;
    }

    public void setProfileConnectionState(int profileConnectionState) {
        this.profileConnectionState = profileConnectionState;
    }

    @Override
    public String toString() {
        String nameString = "The name of your bluetooth adapter is " + name;
        String addressString = ", which is located at " + address;
        return nameString + addressString;
    }
}
