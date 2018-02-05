package bluetooth.adapter.service;

import android.bluetooth.BluetoothAdapter;
import bluetooth.adapter.dao.BluetoothAdapterDao;
import bluetooth.adapter.dao.IBluetoothAdapterDao;
import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Created by Mark on 2/4/2018.
 */
public class BluetoothAdapterService implements IBluetoothAdapterService {

    IBluetoothAdapterDao bluetoothAdapterDao;

    public BluetoothAdapterService() {
        bluetoothAdapterDao = new BluetoothAdapterDao();
    }

    @Override
    public BluetoothAdapterDto getBluetoothAdapterDto(BluetoothAdapter bluetoothAdapter) {
        return bluetoothAdapterDao.getBluetoothAdapter(bluetoothAdapter);
    }
}
