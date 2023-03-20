package fin.tech.odem.data.models

data class Client(val Id:String,val FirstName:String,val LastName:String,val Email:String,val Phone:String,val Address:Address,val Status:ClientStatus)

enum class ClientStatus{
    Active,
    Disabled
}