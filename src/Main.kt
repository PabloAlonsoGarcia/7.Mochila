class Personaje(){
    val nombre:String = "Jack"



}




class Item(peso: Int= 0,valor: Int=0){

    var id=0
    var w = peso
    var v = valor



}
class Mochila(){
    val pesoMax=10
}


fun main() {

    val num_objetos: Int = 4


    val objetos = arrayListOf<Item>()

    println("ini de objetos")

    repeat(num_objetos) {
        objetos.add(Item(0+it, 0+it))
        objetos[it].id=it;
    }


    println("Objetos:")
    print(objetos)




    /*
        val objeto1 = Item(5,10);
        val objeto2 = Item(4,40)
        val objeto3= Item(6,30)
        val objeto4 = Item(4,50)

*/



}