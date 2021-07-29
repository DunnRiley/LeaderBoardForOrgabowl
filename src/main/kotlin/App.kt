import kotlinx.css.*
import kotlinx.css.properties.border
import react.*
import react.dom.*
import styled.*

fun TeamNames(): Array<Array<String>> {
    val NameOfteams = arrayOf(
        arrayOf("Team 1", "1a", "2a", "3a", "4a","5a"),
        arrayOf("Team 2", "1b", "2b", "3b", "4b","5b"),
        arrayOf("Team 3", "1c", "2c", "3c", "4c","5c"),
        arrayOf("Team 4", "1d", "2d", "3d", "4d","5d"),
        arrayOf("Team 5", "1e", "2e", "3e", "4e","5e"),
    )
    return NameOfteams
}
fun ProblemSetNames(): Array<String> {
    val NameOfProblemSet = arrayOf<String>("ProblemSet1","ProblemSet2","ProblemSet3","ProblemSet4","ProblemSet5")
    return NameOfProblemSet
}

@JsExport
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledH1 {
            css {
                color = Color.red
            }
        }

        h1 {
            +"Leader board"
        }
        table {
            tr {
                th {
                    +"Team Name"
                }
                for(i in 0..ProblemSetNames().size-1){
                    th{
                        +ProblemSetNames()[i]
//                        +"ProblemSetName"
                    }
                }

            }
        }
        for(i in 0..TeamNames().size-1){
            tr {
                th {
                    +TeamNames()[i][0]
//                    +"TeamName"
                }
                for (j in 1..ProblemSetNames().size){
                    td {
                        +TeamNames()[i][j]
//                        +"Color"
                    }
                }
            }
        }
    }
}