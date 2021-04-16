fun main(){

    var inicio = 0
    var fin = 0
    var sumaPares = 0
    var sumaImpares = 0
    var aux = 0
    val arrayForEach = mutableListOf<Int>()
    //inicio = readLine()?.toInt()

    inicio = 14
    fin = 13
    if(inicio <= fin){

        //forEach más óptimo:
        sumaPares = 0
        sumaImpares = 0
        (inicio..fin).forEach {
            if(it%2 == 0)
                sumaPares += it
            else
                sumaImpares += it
        }
        println("Bucle forEach más óptimo sumaPares: $sumaPares")
        println("Bucle forEach más óptimo sumaImpares: $sumaImpares")


        //forEach
        for(i in inicio..fin)
            arrayForEach.add(i)

        sumaPares = 0
        sumaImpares = 0
        arrayForEach.forEach{
            if(it%2 == 0)
                sumaPares += it
            else
                sumaImpares += it
        }
        println("Bucle forEach sumaPares: $sumaPares")
        println("Bucle forEach sumaImpares: $sumaImpares")

        //for
        sumaPares = 0
        sumaImpares = 0
        for(i in inicio..fin)
            if(i%2 == 0)
                sumaPares += i
            else
                sumaImpares += i

        println("Bucle for sumaPares: $sumaPares")
        println("Bucle for sumaImpares: $sumaImpares")

        //while
        sumaPares = 0
        sumaImpares = 0
        aux = inicio
        while (aux <= fin){
            if(aux%2 == 0)
                sumaPares += aux
            else
                sumaImpares += aux
            aux++
        }
        println("Bucle while sumaPares: $sumaPares")
        println("Bucle while sumaImpares: $sumaImpares")

        //do while
        sumaPares = 0
        sumaImpares = 0
        aux = inicio
        do{
            if(aux%2 == 0)
                sumaPares += aux
            else
                sumaImpares += aux
            aux++
        }while(aux <= fin)
        println("Bucle do while sumaPares: $sumaPares")
        println("Bucle do while sumaImpares: $sumaImpares")



    }else
        println("No pude hacer los bucles porque el primer número($inicio) es mayor al segundo($fin)")


}