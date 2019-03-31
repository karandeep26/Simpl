package m.com.simpl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        if (isChecked) {
            if (buttonView.id == R.id.radio_button_upi) {
                radio_button_balance.isChecked = false
            }
            if (buttonView.id == R.id.radio_button_balance) {
                radio_button_upi.isChecked = false
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radio_button_balance.setOnCheckedChangeListener(this)
        radio_button_upi.setOnCheckedChangeListener(this)
    }
}
