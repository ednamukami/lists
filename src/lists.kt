fun main(){
   println(sea(listOf("Sargasso","Sapter","Java","Timor","Weddell","ionian","sulu","Celeb","Tasman","Caspian")))
   val person = listOf(
      Person("Peter", 16, 56.6, 3.5),
      Person("Anna", 28, 44.5, 1.7),
      Person("Anna", 23, 45.0, 1.8),
      Person("Sonya", 39, 50.1, 1.5))
      val ages = person.sortedByDescending{it.age}
   println(ages)
      var x=(listOf<Person>(Person("greg",16,1.1,60.5),
      Person("jane",12,1.3,44.20,)))
   println(x)

  var persons=(listOf<Person>(Person("jill",44,1.1,59.5),
      Person("hunter",22,1.3,35.20,)))
   println(persons)

   val age = persons.sortedByDescending{it.age}
   println(age)

}
fun sea(name:List<String>):List<String>{
   var seas= mutableListOf<String>()
   for (x in seas){
      if(name.indexOf(x)%2==0){
         seas.add(x)
      }

   }
   return seas
}
fun creature(height:List<Double>):Pair<Double,Double> {
   var sum=height.average()
   var average=height.average()
   return Pair(sum,average)
}
data class Person(val name: String, val age: Int, val weight:Double, val height:Double)





data class Car(var registration:String,var mileage:Int)
fun carDetails(mileage:List<Double>):Double {
   var mileageAverage = mileage.average().toDouble()
   return mileageAverage

}
