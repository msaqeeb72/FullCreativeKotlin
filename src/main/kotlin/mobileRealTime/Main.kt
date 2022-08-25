package mobileRealTime

fun main() {
    val smartPhone:MobilePhone = SmartPhone("Samsung F32","11554587.2",false,"Snapdragon 668",4)
    val featurePhone:MobilePhone = FeaturePhone("Nokia 2252","6566.5",true,"MediaTek",1)
    val fax:Fax = Fax("112255")


    val smartPhone2:SmartPhone = SmartPhone("Samsung F32","11554587.2",false,"Snapdragon 668",4)
    smartPhone2.changeDataConnection(true)

    smartPhone.dailCall("+91 7030133305")
    println("${smartPhone.RAM} GB of RAM with ${smartPhone.processor}")
    featurePhone.setVolume(11)
    featurePhone.setVolume(9)

    //overloading Example
    smartPhone.sendMessage("+91 7030133305","Hello")
//    smartPhone.sendMessage("+91 7030133305","hey","www.google.com")

    //Overriding Example
    featurePhone.openPhoto("/path/image.jpg")
    smartPhone.openPhoto("/path/image.jpg")

    //Interface Example
    smartPhone.answer()
    featurePhone.answer()
    fax.answer()




}