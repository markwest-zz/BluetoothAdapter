package bluetooth.adapter.service;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

import bluetooth.adapter.dao.BluetoothAdapterDao;
import bluetooth.adapter.dao.IBluetoothAdapterDao;
import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Created by Mark on 2/4/2018.
 */
public class BluetoothAdapterService implements IBluetoothAdapterService {

    Context context;
    IBluetoothAdapterDao bluetoothAdapterDao;

    public BluetoothAdapterService(Context context) {
        this.context = context;
        bluetoothAdapterDao = new BluetoothAdapterDao(context);
    }

    @Override
    public BluetoothAdapterDto getBluetoothAdapterDto() {
        return bluetoothAdapterDao.getBluetoothAdapter();
    }
}
