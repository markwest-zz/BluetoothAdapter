package bluetooth.adapter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;

import java.io.IOException;

import bluetooth.adapter.service.BluetoothAdapterService;
import bluetooth.adapter.service.IBluetoothAdapterService;

/**
 * Starting point of the application
 */
public class MainActivity extends AppCompatActivity {

    IBluetoothAdapterService bluetoothAdapterService;

    private BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_main_title);

        bluetoothAdapterService = new BluetoothAdapterService();

        if (savedInstanceState == null) {

            if (getSystemService(Context.BLUETOOTH_SERVICE) != null) {

                bluetoothAdapter = ((BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE))
                        .getAdapter();

                if (bluetoothAdapter != null) {
                    TextView view = findViewById(R.id.error_textview);
                    view.setText(R.string.bt_supported);
                }
            }
        }
        else {
            showErrorText(R.string.bt_not_supported);
        }
    }

    private void showErrorText(int messageId) {

        TextView view = findViewById(R.id.error_textview);
        view.setText(getString(messageId));
    }

    public void searchBluetoothAdapter(View v) throws IOException, JSONException {
        bluetoothAdapterService.getBluetoothAdapterDto();
    }
}
