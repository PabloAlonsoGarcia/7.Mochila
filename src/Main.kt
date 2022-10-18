class Personaje() {
    val nombre: String = "Jack"
    val mochila = mutableListOf<Item>()

//Función para robar en base al ratio de los objetos* con un peso límite
    fun robar(objetos: ArrayList<Item>) {
        var pesoActual: Int = 0
        objetos.forEach{
            if (pesoActual <= 10 && (pesoActual + it.w)<=10){
                mochila.add(it)
                pesoActual += it.w
            }
        }

        mochila.forEach { println(it) }

    }
}

class Item(peso: Int = 0, valor: Int = 0) {



    var w = peso
    var v = valor
    var ratio: Float = calculoRatio()

//Asignamos a un objeto su ratio correspondiente
    fun calculoRatio(): Float {

        var num: Float = 0.0F

        num = (this.v.toFloat() / this.w.toFloat())

        return num

    }
//To string para mostrarlo
    override fun toString(): String {
        return "Item(w=$w, v=$v)"
    }


}


fun main() {

    var peso: Int = 0
    var valor: Int = 0

    val num_objetos: Int = 4

    val personaje1 = Personaje();

    val objetos = arrayListOf<Item>()


//Asignamos a cada objeto un valor y un peso aleatorio y calculamos su ratio
    repeat(num_objetos) {
        peso = (1..10).random()
        valor = (10..50).random()
        objetos.add(Item(peso, valor))
    }

//Mostramos los objetos a robar

    print("Objetos a robar por ")
    println(personaje1.nombre)
    repeat(num_objetos) {

        print("|peso:" + objetos[it].w)
        print(" /valor:" + objetos[it].v)
        println("|")
    }


    objetos.sortByDescending { it.ratio }


    println()
    personaje1.robar(objetos)

}


