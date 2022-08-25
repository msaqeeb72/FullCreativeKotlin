package mobileRealTime

class Fax(val faxNumber:String) :Answerable{
    override fun answer() {
        println("Fax $faxNumber is answering...")
    }
}