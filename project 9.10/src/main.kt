fun main(){
    try{
    var Kabel = Nasled("type-c",true)
        Kabel.Input()
        Kabel.kab()
        Kabel.info()
        Kabel.Q()
        Kabel.Qp()
        var Kabel2= Kabel("USB", true)
        Kabel2.Input()
        Kabel2.info()
        Kabel2.Q()
        Kabel2.Qp()
    }catch(e:Exception){}
}