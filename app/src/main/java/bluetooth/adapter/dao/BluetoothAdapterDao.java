package bluetooth.adapter.dao;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;

import bluetooth.adapter.R;
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

        BluetoothAdapterDto bluetoothAdapterDto = new BluetoothAdapterDto();

        if (context.getSystemService(context.BLUETOOTH_SERVICE) != null) {

            bluetoothAdapter = ((BluetoothManager) context.getSystemService(context.BLUETOOTH_SERVICE))
                    .getAdapter();

            String address = bluetoothAdapter.getAddress();
            bluetoothAdapterDto.setAddress(address);

            String name = bluetoothAdapter.getName();
            bluetoothAdapterDto.setName(name);

        } else {
            int messageId = context.getResources().getIdentifier("bt_not_supported", "id", "bluetooth.adapter");
            bluetoothAdapterDto.setError(context.getString(messageId));
        }

        return bluetoothAdapterDto;
    }
}
