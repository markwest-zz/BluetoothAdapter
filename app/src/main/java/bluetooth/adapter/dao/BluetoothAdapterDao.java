package bluetooth.adapter.dao;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Class to get the bluetooth adapter for the device
 * Created by Mark on 2/4/2018.
 */
public class BluetoothAdapterDao implements IBluetoothAdapterDao {

    private BluetoothAdapter bluetoothAdapter;
    Context context;

    public BluetoothAdapterDao(Context context) {
        this.context = context;
    }

    @Override
    public BluetoothAdapterDto getBluetoothAdapter() {

        bluetoothAdapter = ((BluetoothManager) context.getSystemService(context.BLUETOOTH_SERVICE))
                .getAdapter();

        BluetoothAdapterDto bluetoothAdapterDto = new BluetoothAdapterDto();

        String address = bluetoothAdapter.getAddress();
        bluetoothAdapterDto.setAddress(address);

        String name = bluetoothAdapter.getName();
        bluetoothAdapterDto.setName(name);

        return bluetoothAdapterDto;
    }
}
