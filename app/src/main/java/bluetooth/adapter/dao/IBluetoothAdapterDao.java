package bluetooth.adapter.dao;

import bluetooth.adapter.dto.BluetoothAdapterDto;
import java.io.IOException;
import org.json.JSONException;

/**
 * Interface to retrieve the bluetooth adapter for the device
 * Created by Mark on 2/4/2018.
 */
public interface IBluetoothAdapterDao {

    /**
     * @return The bluetooth adapter for the device
     */
    public BluetoothAdapterDto getBluetoothAdapter() throws IOException, JSONException;
}
