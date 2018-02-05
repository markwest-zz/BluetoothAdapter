package bluetooth.adapter.dao;

import android.bluetooth.BluetoothAdapter;
import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Class to get the bluetooth adapter for the device
 * Created by Mark on 2/4/2018.
 */
public class BluetoothAdapterDao implements IBluetoothAdapterDao {

    private BluetoothAdapter bluetoothAdapter;

    @Override
    public BluetoothAdapterDto getBluetoothAdapter(BluetoothAdapter bluetoothAdapter) {

        BluetoothAdapterDto bluetoothAdapterDto = new BluetoothAdapterDto();

        String address = bluetoothAdapter.getAddress();
        bluetoothAdapterDto.setAddress(address);

        String name = bluetoothAdapter.getName();
        bluetoothAdapterDto.setName(name);

        return bluetoothAdapterDto;
    }
}
