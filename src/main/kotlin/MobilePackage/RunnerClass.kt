package MobilePackage
import java.awt.Taskbar.Feature
import java.util.ArrayList

fun main() {
    var smartPhone = TouchScreen("Samsung F23",112233,"Android 10")
    var featurePhone = Keypad("Nokia 2252",332211)
    var telephone = Telephone()
    smartPhone.call("7030133305")
    smartPhone.call("7030133305",Recorder())

    featurePhone.call("988988988")

    smartPhone.captureVideo(RearCamera(),FrontCamera())
    smartPhone.captureVideo(RearCamera())

    val arr:ArrayList<Answerable> = ArrayList()
    arr.add(smartPhone)
    arr.add(featurePhone)
    arr.add(telephone)

    for (obj in arr){
        obj.answer()
    }

    println(smartPhone.checkSilent())
    smartPhone.changeSilent()
    println(smartPhone.checkSilent())

    var smartPhone2 = TouchScreen("MI Note 11",5454785,"Android 12","123AZV456")
    println(smartPhone2.getBuiltIn())
    println(smartPhone.getBuiltIn())

}