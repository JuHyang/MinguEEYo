package com.juhyang.nfcsound.nfc

import android.content.Context
import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.util.Log
import com.juhyang.nfcsound.sound.SoundHelper

/**

 * Created by juhyang on 4/19/21.

 */
object NFCHelper {
    fun nfcSound(intent : Intent, context : Context) {
        val tag = intent.getParcelableExtra<Tag>(NfcAdapter.EXTRA_TAG)
        if (tag != null) {
            val tagId = tag.id
            Log.d("hyang@tagId", "${tagId}")
            SoundHelper.startSound(context)
        }
    }
}
