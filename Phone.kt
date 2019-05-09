package Bolum1.OOProject

import Bolum1.kalitim.person


class Phone(){
    var userList:ArrayList<Person>
    init {
        this.userList=ArrayList()
        userList.add(Person("RIDVAN","555555"))
        userList.add(Person("YASİN","222222"))
        userList.add(Person("SELCUK","222222"))
    }

    fun menu(){
        println("*********MENU*********")
        println("1 -> List All People \n" +
                "2 -> Add New Person \n" +
                "3 -> Search Person \n" +
                "4 -> Delete Person \n" +
                "5 -> Update Person \n" +
                "7 -> Exit")
        var choose= readLine()
        when (choose) {
            "1" -> listAllPerson()
            "2" -> addNewPerson()
            "3" -> searchPerson()
            "4" -> deletePerson()
            "5" -> updatePerson()
            "6" -> print("x == 2")
            "7" -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
    }

    fun listAllPerson(){
        for (i:Int in userList.indices){
            println("Name : "+userList[i].name + "\tPhone : " + userList[i].phone)
        }
        println("Search Result \n")
        menu()
    }

    fun addNewPerson(){
        println("Please Enter Name :")
        var name = readLine()
        name=name.toString()
        println("Please Enter Phone :")
        var phone= readLine()
        phone=phone.toString()
        userList.add(Person(name,phone))
        println("Person is Successfully Added \n")
        menu()
    }

    fun searchPerson(){
        var rslt=0
        println("Please Enter Search Name :")
        var name = readLine()
        name=name.toString()

        for (i:Int in userList.indices){
            if (userList[i].name==name){
                rslt=1
                println("Name : 1"+userList[i].name + "\t Surname : "+userList[i].phone)
            }
        }
        if (rslt==0){
            println("Do not find result")
        }

        menu()
    }

    fun deletePerson(){
        var rslt=0
        println("Please Enter Delete Name")
        var name= readLine()
        for (i:Int in userList.indices){
            if (userList[i].name==name){
                rslt=1
                userList.removeAt(i)
                println("Person is Deleted")
            }
        }

        if (rslt==0){
            println("Do not find result")
        }


    }

    fun updatePerson(){
        var rslt=0
        println("Please Enter The Changing Name")
        var name= readLine()
        for (i:Int in userList.indices){
            if (userList[i].name==name){
                rslt=1
                println("Please Enter New Name")
                var newName= readLine()
                println("Please Enter New Phone")
                var newPhone= readLine()
                userList[i].name= newName!!
                userList[i].phone= newPhone!!
                println("Person is Successfully Updated \n")
            }

        }
        if (rslt==0){
            println("Person is Not Updated \n")
        }

        menu()
    }
}

fun main() {
    var phone=Phone()
    phone.menu()
}