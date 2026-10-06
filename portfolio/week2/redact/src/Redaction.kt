// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(s:String,t:String,c:Char='X'):String{
    var previous = s
    var current = s.replace(t,c.toString().repeat(t.length))

    while(previous!=current){
        previous = current
        current = current.replace(t,c.toString().repeat(t.length))
    }

    return current
}