class Personaje(){
    val nombre:String = "Jack"



    fun robar(objetos: ArrayList<Item>){


    }
}

class Item(peso: Int= 0,valor: Int=0){

    var id=0
    var w = peso
    var v = valor



    fun calculoRatio():Float{

        var num: Float= 0.0F

        num=(this.v.toFloat()/this.w.toFloat())

        print(num)

        return num
    }

}

class Mochila(){
    val pesoMax=10
}


fun main() {

    var peso:Int= 0
    var valor:Int=0
    var pesoActual:Int=0


    val num_objetos: Int = 4

    val personaje1=Personaje();


    val objetos = arrayListOf<Item>()
    val ratios = arrayListOf<Float>()



//Asignamos a cada objeto un valor y un peso aleatorio
    repeat(num_objetos) {
        peso=(1..10).random()
        valor=(10..50).random()
        objetos.add(Item(peso, valor))
        objetos[it].id=it;
        ratios.add(objetos[it].calculoRatio())
    }

//Mostramos los objetos a robar

    print("Objetos a robar por ")
    println(personaje1.nombre)
    repeat(num_objetos) {

        print("|peso:" + objetos[it].w)
        print(" /valor:" + objetos[it].v)
        println("|")
    }
    println("")
    println("Ratios:")
    repeat(num_objetos){


        print("|ratio:"+ratios[it].toFloat())

    }
    println("|")

//Decidimos que objetos robar

    ratios.sortedDescending()

    println("")
    println("Ratios ordenados:")
    repeat(num_objetos){


        print("|ratio:"+ratios[it].toFloat())

    }
    println("|")






    var cont:Int=0
    do{
        if(ratios[cont].equals(0) ){
            cont++
        }else{

            pesoActual=pesoActual
            cont++
        }

    }while(pesoActual<=10)


}