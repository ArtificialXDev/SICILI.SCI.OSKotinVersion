import kotlin.concurrent.thread
import kotlin.system.exitProcess

fun main()
{
println("Welcome To SICILI.SCI.OS Kotlin Version")
    fun delete_last_line(Times: Int)
    {
       repeat(Times) {
            print("\\x1b[1A")
            print("\\x1b[2K")
       }

    }
    delete_last_line(74)
    var treevalue = 1
    var panicErrorCode = "None"
    fun panic(errorCode: String)
    {
    println("SICILI.SCI.OS(Kotlin Version) Has Crashed, Error Code: $errorCode")
    }
    println("Welcome To SICILI.SCI.OS(Kotlin Version)! Thank You To All The Contributors, Who Worked On This.")
    println("Hope You Find This OS Useful.")
    println("SICILI.SCI.OS v0.0000001 arcitechure written in Kotlin")
    fun wait() {
        for (i in 1..5) {
            println(".")
            Thread.sleep(1000)
            delete_last_line(1)
            println("..")
            Thread.sleep(1000)
            delete_last_line(1)
            println("...")
            Thread.sleep(1000)
            delete_last_line(1)
        }
        println("Skip Loading? Nothing Happens if You Skip(y/n)")
        var loadingSkip = readln()
        if (loadingSkip == "y")
        {
            delete_last_line(1)
        }
        else if (loadingSkip == "n"){
            wait()
        }
        var commandHistory = mutableListOf<String>()
        delete_last_line(1)
        println("Tip:  Run sci.help For Help.")
        while (true)
        {
            println("command:")
            var cmd = readln().trim().lowercase()
            commandHistory.add(cmd)
            if (cmd == "sci.help")
            {
                println(""" 
                Available commands:
                sci.help - show this help message
                sci.info.sciex.kernel - show information about this program
                sci.echo.sciex - echo back what you type
                sci.tree.danger.sciex - create a value for tree. use the -p command to print the value.
                sci.history - show all command history
                sci.clear.screen- clears the screen
                sci.dumb.wait.why.you.should.not.do.this.it.is.dumb- left without description""")
            }
            else if (cmd == "" || cmd == " ")
            {
                println("Please Enter A Command, An Empty Space/Whitespace is Not A Command, If You Don't Know The Commands Yet, Run sci.help")
            }
            else if (cmd == "sci.dumb.wait.why.you.should.not.do.this.it.is.dumb")
            {
                wait()
            }
            else if (cmd == "sci.info.sciex.kernel.")
            {
               println("""Developed by Shahzain Khan. All rights reserved.
                   This kernel may be reproduced in any way under the MIT License.
                   You can archive (make sure the archive is public).""")
            }
            else if (cmd == "sci.echo.sciex")
            {
                fun echo()
                {
                    println("What To Echo:")
                    var text = readln().trim().toString()
                    println(text)
                }
                echo()
            }
            else if (cmd == "sci.tree.danger.sciex")
            {
                println("What Should Be The Value:")
                treevalue = readln().toInt()
            }
            else if (cmd ==  "sci.tree.danger.sciex -p")
            {
                println(treevalue)
            }
            else if (cmd == "sci.history")
            {
                println("Command History:")
                for ((index, cmd) in commandHistory.withIndex()) {
                    println("${index + 1}: $cmd")
                }

            }
            else if (cmd == "sci.clear.screen")
            {
                println("How Many Lines to Clear:")
                val ti = readln().toInt()

                delete_last_line(ti)
            }
        }




}
}
