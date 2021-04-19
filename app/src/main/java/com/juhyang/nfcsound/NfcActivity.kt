package com.juhyang.nfcsound

import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.juhyang.nfcsound.nfc.NFCHelper
import com.juhyang.nfcsound.sound.SoundHelper

class NfcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nfc)

        val newIntent = intent ?: return
        NFCHelper.nfcSound(newIntent, this)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        val newIntent = intent ?: return
        NFCHelper.nfcSound(newIntent, this)
    }
}
