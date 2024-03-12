abstract class InfoKabel(): InfoKab{
    abstract var type:String
    abstract var zhil:Double
    abstract var Oplet:Boolean
    abstract var diametr: Double
    abstract fun Q():Double
    abstract fun Qp(): Double
    override fun info() {
        println ("Тип: $type \nКоличество жил: $zhil \nДиаметр: $diametr")
    }
}