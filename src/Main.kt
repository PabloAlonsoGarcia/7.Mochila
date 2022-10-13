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

    var peso:Int= 0
    var valor:Int=0

    val num_objetos: Int = 4

    val personaje1=Personaje();


    val objetos = arrayListOf<Item>()



    repeat(num_objetos) {
        peso=(1..10).random()
        valor=(0..50).random()
        objetos.add(Item(peso, valor))
        objetos[it].id=it;
    }

    print("Objetos a robar por ")
    println(personaje1.nombre)
    repeat(num_objetos){

        print("|peso:"+objetos[it].w)
        print(" /valor:"+objetos[it].v)
        println("|")

    }













}