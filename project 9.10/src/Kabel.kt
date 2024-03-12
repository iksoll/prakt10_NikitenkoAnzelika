open class Kabel (var typekabel:String, var oplet1:Boolean) : InfoKabel() {
    override var type = typekabel
    override var zhil = 0.0
    override var Oplet = oplet1
    override var diametr = 0.0
    override fun Q(): Double {
        var Q = diametr / zhil
        return Q
    }
    override fun Qp():Double{
        return 0.0;
    }
    fun Input(){
        print("Введите количество жил в кабеле: ")
        zhil = readLine()!!.toDouble()
        print("Введите диаметр кабеля: ")
        diametr = readLine()!!.toDouble()
    }
}