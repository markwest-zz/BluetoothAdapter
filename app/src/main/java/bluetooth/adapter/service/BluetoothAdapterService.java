package bluetooth.adapter.service;

import org.json.JSONException;

import java.io.IOException;

import bluetooth.adapter.dao.BluetoothAdapterJsonDao;
import bluetooth.adapter.dao.IBluetoothAdapterDao;
import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Created by Mark on 2/4/2018.
 */
public class BluetoothAdapterService implements IBluetoothAdapterService {

    IBluetoothAdapterDao bluetoothAdapterDao;

    public BluetoothAdapterService() {
        bluetoothAdapterDao = new BluetoothAdapterJsonDao();
    }

    @Override
    public BluetoothAdapterDto getBluetoothAdapterDto() throws IOException, JSONException {
        return bluetoothAdapterDao.getBluetoothAdapter();
    }
}
