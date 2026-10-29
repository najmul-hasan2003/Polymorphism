/*
//Method OverLoading
class MOL{
    fun add (a: Int, b: Int): Int {
        return a + b
    }

    fun add (a: Int, b: Int, c: Int): Int {
        return a + b - c
    }

}
fun main(){
    val obj1 =  MOL()
    val c = obj1.add(10, 20)
    println(c)
}

 */


//Method Overriding
open class BankAccount {
    open fun calculateTheInterest(){
        println("General bank account interest")
    }
}

class CurrentAccount: BankAccount() {
    override fun calculateTheInterest() {
        println("Current bank account interest")
    }
}

class SavingsAccount: BankAccount() {
    override fun calculateTheInterest() {
        println("Savings bank account interest")
    }
}
class studentAccount : BankAccount() {
    override fun calculateTheInterest() {
        println("Student bank account interest")
    }
}

fun main (){
    val BankAccount = BankAccount()
    val currentAccount = CurrentAccount()
    val savingsAccount = SavingsAccount()
    val studentAccount = studentAccount()

    BankAccount.calculateTheInterest()
    savingsAccount.calculateTheInterest()
    currentAccount.calculateTheInterest()
    studentAccount.calculateTheInterest()

}
