package mobileRealTime
 abstract class MobilePhone():Answerable {
     abstract val model:String
     abstract val IMEICode:String
     abstract val isSingleSim:Boolean
     abstract val processor:String
     abstract val RAM:Int

     private var volumeLevel:Int =10
     set(value){
         if (value in 0..10){
             field = value
             println("Set volume to $value")
         }
         else
             println("Invalid volume")
     }


    fun connectBluetooth(){
        println("${model} is connecting to bluetooth")
    }
    fun dailCall(number:String){
        println("$model is calling tp $number")
    }
    open fun openPhoto(path:String){
        println("displaying photo having path $path")
    }
     //method overloading
    fun sendMessage(number:String, text:String){
        println("$model is sending message to $number")
    }


     //example of abstract method
    abstract fun getScreenSize():Int







    //fun getIMEICode():String = IMEICode
    fun hasSingleSim():Boolean = isSingleSim
    //fun getProcessor():String = processor
    //fun getRAM():Int = RAM
    fun getVolume() = volumeLevel
    fun setVolume(newVol:Int){
        volumeLevel = newVol
    }



 }