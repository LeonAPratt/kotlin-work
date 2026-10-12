// Task 7.7.1: statistics functions
fun median(data:List<Float>):Float{
    val sorted = data.sorted()
    val n = sorted.size
    return if(n%2 == 1){
        sorted[n/2]
    }else{
        (sorted[n/2-1] + sorted[n/2])/2
    }

}

fun displayStats(Data:List<Float>){
    println("Minimum: ${data.min()}")
    println("Maximum: ${data.max()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}