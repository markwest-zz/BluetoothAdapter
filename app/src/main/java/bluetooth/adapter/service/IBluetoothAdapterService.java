package bluetooth.adapter.service;

import org.json.JSONException;

import java.io.IOException;

import bluetooth.adapter.dto.BluetoothAdapterDto;

/**
 * Business logic for the bluetooth adapter
 * Created by Mark on 2/4/2018.
 */
public interface IBluetoothAdapterService {

    /**
     * @return The bluetooth adapter for the device
     */
    BluetoothAdapterDto getBluetoothAdapterDto() throws IOException, JSONException;
}
