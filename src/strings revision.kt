fun main(){
    intro()
}
fun intro(){
//String concatenation.
    var a= "Kasupuu"
    var b="is very pretty."
    var c=(a+" "+b)
    println(c)

//string indexing.
    println(c[0])
    println(c[10])

    println(c.first()) //Will print out the first character.
    println(c.last())//Will print out the first character.


//String Interpolation.
    var d="I know her from my village."
    println("${c},${d}She lives near my mum's house.")

//    var e="One"    //String comparison method 1.
//    var f=1
//    if (2==f){
//        println(true)
//    }else{
//        println(false)
//    }
    var e="one"
    var f=1
    if (e.equals(f)){  //string comparison method 2.
        println(true)
    }else{
        println(false)
    }
//manipulating string cases.
    println(e.capitalize())
    println(e.toUpperCase())
    println(e.toLowerCase())
    println(e.decapitalize())
//empty and blank strings.
    println(e.isBlank())
    println(e.isEmpty())

    var g="" //empty
    var h=" "//blank(has white space)

    // Trimming white spaces out of a string.
    var i= " Mt.Kilimanajaro "
    println(i.trimStart())
    println(i.trimEnd())
    println(i.trim())

    //starts/ends with
    println(e.startsWith("i"))
    println(e.endsWith("j"))

    //splitting characters in strings.
    var tour="Lake Victoria, Tsavo park, OleSereni park, Maasai mara"
    var places=tour.split(",")
    println(places)// output will be a list of the places.

    var hotels="Kempinski,Weston, Sarova Stanley, Panari"
    var letter=hotels.split("a")
    println(letter)//will split anywhere with letter a.


    //replace.
    var hello="My name is Caitlin and I love cake."
    println(hello.replace("cake","shoes"))

    //conversion
    var admissionNo="33"
    println(admissionNo.toInt())

}
