
import java.time.LocalDateTime

fun main(args: Array<String>) {

    val Name : String = "Robert Clark"
    val GitCode : String = "ghp_nufsdjiowjieoijiojwdsjsdhkjhjfjhhds"
    val SSH : String = "robert_clark_1967@34.129.54.75"
    val Project : String = "FirstProject"
    val Year : String = "2022"
    val Month : String = "1"
    val Day : String = "9"

    val current = LocalDateTime.now()
    println("go or kotlin")
    val quest = readln()
    if (quest == "go") {
        println("Date and Time is: $current Kotlin V1.0.1")
        println("Welcome $Name you are working on project $Project")
        println(".git.json")
        println("----GO MOD --------------------------------------")
        println("")
        println("cd ~/gocode/src/github.com/Rob8150/$Project")
        println("go mod init github.com/Rob8150/$Project")
        println("go get github.com/charmbracelet/lipgloss")
        println("")
        println("----GitHub---------------------------------------")
        println("git branch -m master main")
        println("git remote remove origin")
        println("git remote add origin https://$GitCode@github.com/Rob8150/$Project")
        println("git push --set-upstream origin main")
        println("")
        println("--ZIP--------------------------------------------")
        println("")
        println("cd gocode/src/github.com/Rob8150/")
        println("tar -cvzf $Project.tar.gz $Project")
        println("")
        println("-----Upstream ------------------------------------")
        println("scp ~/gocode/src/github.com/Rob8150/$Project.tar.gz $SSH:gocode/src/github.com/Rob8150/$Project.tar.gz")
        println("")
        println("-----Transport Remote-----------------------------")
        println("")
        println("-----DownStream-----------------------------------")
        println("scp $SSH:gocode/src/github.com/Rob8150/$Project.tar.gz ~/gocode/src/github.com/Rob8150/$Project.tar.gz")
        println("ssh $SSH")
        println("cd ~/gocode/src/github.com/Rob8150/")
        println("Extract")
        println("tar -zxvf $Project.tar.gz")

    }else{
        println("Date and Time is: $current Kotlin V1.0.1")
        println("Welcome $Name you are working on project $Project")
        println(".git.json")
        println("---------- --------------------------------------")
        println("")
        println("cd C:\\Users\\rober\\IdeaProjects\\$Project")
        println("")
        println("----GitHub---------------------------------------")
        println("Add .gitignore from kotlin drive")
        println("git add .")
        println("git commit -m \"some message\"")
        println("git branch -m master main")
        println("git remote remove origin")
        println("git remote add origin https://$GitCode@github.com/Rob8150/$Project")
        println("git push --set-upstream origin main")
        println("")
        println("--ZIP--------------------------------------------")
        println("")
        println("cd C:\\Users\\rober\\IdeaProjects")
        println("tar -cvzf $Project.tar.gz $Project")
        println("")
        println("-----Upstream ------------------------------------")
        println("scp ~/IdeaProjects/$Project.tar.gz $SSH:IdeaProjects/$Project.tar.gz")
        println("")
        println("-----Transport Remote-----------------------------")
        println("")
        println("-----DownStream-----------------------------------")
        println("scp $SSH:IdeaProjects/$Project.tar.gz ~/IdeaProjects/$Project.tar.gz")
        println("ssh $SSH")
        println("cd ~/IdeaProjects/")
        println("Extract")
        println("tar -zxvf $Project.tar.gz")


    }

}
