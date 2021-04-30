fun main(){
   println(sea(listOf("Sargasso","Sapter","Java","Timor","Weddell","ionian","sulu","Celeb","Tasman","Caspian")))
   println(creature(listOf(1.9,2.0,7.0)))
   people()
   humanBeing()

   var gari= listOf(
      Car("KES109R",100),
      Car("KEA389F",200)
   )
   println(carDetails(listOf(100,200)))


}
fun sea(name:List<String>):List<String>{
   var seas= mutableListOf<String>()
   for (x in name){
      if(name.indexOf(x)%2==0){
         seas.add(x)
      }

   }
   return seas
}
fun creature(height:List<Double>):Pair<Double,Double> {
   var sum=height.sum()
   var average=height.average()
   return Pair(sum,average)
}
data class Person(val name: String, val age: Int, val weight:Double, val height:Double)
fun people() {

   val person = listOf(
      Person("Augustine", 16, 56.6, 3.5),
      Person("Christine", 28, 44.5, 1.7),
      Person("Ruth", 23, 45.0, 1.8),
      Person("kallikrates", 39, 50.1, 1.5)
   )
   val ages = person.sortedByDescending { person -> person.age }
   println(ages)
}
data class People(val name: String, val age: Int, val weight:Double, val height:Double)
fun humanBeing() {

   val person = mutableListOf(
      People("Augustine", 16, 56.6, 3.5),
      People("Christine", 28, 44.5, 1.7),
      People("Ruth", 23, 45.0, 1.8),
      People("kallikrates", 39, 50.1, 1.5)
   )
   person.addAll(listOf(
       People("jill",44,1.1,59.5),
      People("hunter",22,1.3,35.20,)
   ))
   println(person)
}


data class Car(var registration:String,var mileage:Int)
fun carDetails(mileage:List<Int>):Int {
   var mileageAverage = mileage.average().toInt()
   return mileageAverage

}
