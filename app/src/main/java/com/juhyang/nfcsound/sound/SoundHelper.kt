package com.juhyang.nfcsound.sound

import android.content.Context
import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri

/**

 * Created by juhyang on 4/19/21.

 */

object SoundHelper {
    fun startSound(context : Context) {
        //Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        //Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        //Uri notification = Uri.parse("android.resource://패키지이름/raw/파일명");
        
        val notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val ringtone = RingtoneManager.getRingtone(context, notification)
        ringtone.play()
    }
}
