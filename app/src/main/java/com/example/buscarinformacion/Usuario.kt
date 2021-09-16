package com.example.buscarinformacion

import com.google.gson.annotations.SerializedName

class Usuario {
        var login :String=" "
        var id : Int = 0
    @SerializedName("repos_url")
    var reposUrl : String= " "
}

class Repo{
    var name : String = ""
    var description : String = ""
    var language : String = ""

    @SerializedName ("html_url")
    var url : String =""


}
//ascii >˜