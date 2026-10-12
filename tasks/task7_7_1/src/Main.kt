// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>){
    if(args.isEmpty()){
        println("Error: filename required")
        return
    }
    val data = readData(args[0])

    if(data.isEmpty()){
        println("Error: file contains no data")
        return
    }
    displayStats(data)

}