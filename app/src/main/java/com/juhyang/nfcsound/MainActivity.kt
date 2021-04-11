package com.juhyang.nfcsound

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.juhyang.nfcsound.nfc.NfcBroadcastReceiver


class MainActivity : AppCompatActivity() {

    val nfcBroadcastReceiver = NfcBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filter = IntentFilter()
        filter.addAction("SOME_ACTION")
        filter.addAction("SOME_OTHER_ACTION")

        registerReceiver(nfcBroadcastReceiver, filter)
    }

    override fun onDestroy() {
        unregisterReceiver(nfcBroadcastReceiver)
        super.onDestroy()
    }
}
