package MobilePackage

class TouchScreen(modelParam:String, IMEIParam:Int,androidParam:String): Mobile(modelParam,IMEIParam),Answerable {

    override var model = modelParam;
    override var IMEI = IMEIParam;
    var androidVersion = androidParam;
    private var buildInNumber:String? = null

    constructor(modelParam:String, IMEIParam:Int,androidParam:String,buildInNumber:String):this(modelParam,IMEIParam,androidParam){
        println("Secondary Constructor Called")
        this.buildInNumber = buildInNumber
    }

    init {
        loadOS()
    }
    override fun call(phoneNumber: String, recorder: Recorder) {
        println("calling to $phoneNumber with recording and VoLTE")
    }

    override fun loadOS() {
        println("Loading OS for SmartPhone")
    }

    override fun call(phoneNumber: String) {
        println("calling to $phoneNumber with and VoLTE")
    }

    override fun answer() {
        println("Answering from Smart Phone")
    }

    fun getBuiltIn():String = buildInNumber ?: "Not Found"
}