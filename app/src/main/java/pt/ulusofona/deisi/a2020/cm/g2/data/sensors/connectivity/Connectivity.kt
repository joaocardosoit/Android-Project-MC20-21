package pt.ulusofona.deisi.a2020.cm.g2.data.sensors.connectivity

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

abstract class Connectivity private constructor(){

    companion object{
        fun isConnected(context: Context): Boolean{
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
            return if(activeNetwork?.isConnected!=null){
                activeNetwork.isConnected
            } else{
                false
            }
        }
    }
}