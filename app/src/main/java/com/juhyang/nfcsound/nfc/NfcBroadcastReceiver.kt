package com.juhyang.nfcsound.nfc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.nfc.NdefMessage
import android.nfc.NfcAdapter
import android.util.Log

/**

 * Created by juhyang on 4/5/21.

 */
class NfcBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val appContext = context ?: return
        val newIntent = intent ?: return
        Log.d("hyang@intent", "${newIntent.action}")

        if (NfcAdapter.ACTION_NDEF_DISCOVERED == newIntent.action) {
            newIntent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES)?.also { rawMessage ->
                val message : List<NdefMessage> = rawMessage.map {it as NdefMessage }
                Log.d("hyang@message", "${message}")
            }

            val alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val mediaPlayer = MediaPlayer.create(appContext, alarmSound)
            mediaPlayer.start()
        }
    }
}
