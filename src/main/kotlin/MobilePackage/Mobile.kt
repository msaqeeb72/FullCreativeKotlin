package MobilePackage


abstract class Mobile(open var model:String, open var IMEI:Int){

    init {
        println("$model is created")
    }
    private var isSilent = false

    open fun call(phoneNumber: String){
        println("calling to $phoneNumber and 2G")

    }
    open fun call(phoneNumber: String, recorder:Recorder){
        println("calling to $phoneNumber with recording and 2G")
    }

    open fun captureVideo(rear:RearCamera){
        println("capturing video with rear Camera")
    }
    open fun captureVideo(rear:RearCamera,front:FrontCamera){
        println("capturing video with dual mode")
    }

    abstract fun loadOS()



    fun checkSilent():Boolean{
        return isSilent
    }
    fun changeSilent(){
        isSilent = !isSilent
    }


}

class FrontCamera {

}

class RearCamera {

}

class Recorder {

}
