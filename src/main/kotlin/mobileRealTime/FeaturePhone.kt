package mobileRealTime

class FeaturePhone(private val modelName:String,
                   private val IMEI:String,
                   private val isSingleSimCard:Boolean,
                   private val cpu:String,
                   private val ram:Int):MobilePhone() {
    override val model: String
        get() = modelName
    override val IMEICode: String = IMEI
    override val isSingleSim: Boolean = isSingleSimCard
    override val processor: String = cpu
    override val RAM: Int = ram

    override fun getScreenSize(): Int {
        println("Returning Screen size of $model")
        return 4
    }

    override fun answer() {
        println("$model is answering a call ....")
    }


}