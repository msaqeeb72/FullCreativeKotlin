package MobilePackage

class Keypad(modelParam:String, IMEIParam:Int): Mobile(modelParam,IMEIParam),Answerable {
    override fun loadOS() {
        println("Loading OS for feature phone")
    }
    init {
        loadOS()
    }
    override var model = modelParam;
    override var IMEI = IMEIParam;
    override fun answer() {
        println("Answering from Keypad Phone")
    }

}