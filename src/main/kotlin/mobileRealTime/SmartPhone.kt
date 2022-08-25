package mobileRealTime

class SmartPhone(
    private val modelName:String,
    private val IMEI:String,
    private val isSIngleSimCard:Boolean,
    private val cpu:String,
    private val ram:Int,

):MobilePhone() {

    fun connectWifi(SSID:String, key:String){
        println("connecting to wifi .....")
    }
    fun changeDataConnection(dataConnectionState:Boolean){
        if(dataConnectionState){
            println("Data turning Off...")
        }else{
            println("Data turning on....")
        }

    }
    override fun getScreenSize(): Int {
        println("Returning Screen size of $modelName")
        return 12
    }

    override fun answer() {
        println("$modelName is answering a call....")
    }

    fun callRejected(){
        println("Call is rejected")
    }
    fun callRejected(msg:String){
        println("Call Rejected with Message")
    }

    override val model: String
        get() {
            return modelName
        }
    override val isSingleSim: Boolean
        get() = isSIngleSimCard
    override val IMEICode: String 
        get() = IMEI
    override val processor: String
        get() = cpu
    override val RAM: Int = ram


    override fun openPhoto(path: String) {
        println("Enabling Full Screen Mode")
        super.openPhoto(path)
    }
}