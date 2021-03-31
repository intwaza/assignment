fun main() {
    var car= Car("Benz","E200","black",5)
    car.carry(3)
    car.identity()
   println( car.calculateParkingFees(2))


    var bus=Bus("Prado","Legacy","White",50)
    bus.carry(30)
    bus.identity()
    println(bus.calculateParkingFees(3))
   println( bus.maxTripFare(500.4))
}

open class Transport(var make: String, var model: String,var color: String,var capacity: Int){
    fun carry(people:Int){
        var x= people-capacity
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("over $x people")
        }
    }
    fun identity(){
        println("I am $color, $make and $model")
    }
   open fun calculateParkingFees(hours: Int):Int{
        return hours*20
    }


}
class Car(make:String, model:String, color:String, capacity:Int):Transport(make, model, color, capacity){}



class Bus(make:String,model:String, color:String, capacity:Int):Transport(make, model, color, capacity) {
    override fun calculateParkingFees(hours: Int):Int{
        return hours * capacity
    }
    fun maxTripFare(fare: Double): Double {
        var max = 0
        return max + fare

    }
    }

