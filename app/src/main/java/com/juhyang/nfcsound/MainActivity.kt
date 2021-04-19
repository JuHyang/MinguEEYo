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

        registerReceiver(nfcBroadcastReceiver, null)
    }

    override fun onDestroy() {
        unregisterReceiver(nfcBroadcastReceiver)
        super.onDestroy()
    }
}
