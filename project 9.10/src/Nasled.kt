class Nasled(typekabel:String, oplet1: Boolean) : Kabel(typekabel, oplet1) {
    fun kab(){
        println ("Оплетен ли кабель?\n 1-Да \n 2-Нет")
        var oplet = readLine()!!.toInt()
        if (oplet ==1)
            Oplet = true;
        else if (oplet ==2)
             Oplet = false;
        else {
            println ("Ошибка ввода данных")
        }
    }
    var Qp1:Double = 0.0
    override fun Qp():Double{
        if (Oplet)
            Qp1=2*Q()
        else Qp1 = 0.7*Q()
        return Qp1
    }
}