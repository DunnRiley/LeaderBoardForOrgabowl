import kotlinx.css.*
import kotlinx.css.properties.border
import react.*
import react.dom.*
import styled.*

// Changes number of teams
fun RowNumbers(): Int {
    var numbers: Int = 6
    return numbers;
}
// Changes numbers of problem sets
fun ProblemSetNumbers(): Int {
    var numbers: Int = 5
    return numbers;
}
// Changes names of teams
// Must be the same number of teams
fun TeamNames(): Array<String> {
    val NameOfteams = arrayOf<String>("Team1","Team2","Team3","Team4","Team5")
    return NameOfteams
}
// Changes names of problem sets
// Must be the same number of problem sets
fun ProblemSetNames(): Array<String> {
    val NameOfProblemSet = arrayOf<String>("ProblemSet1","ProblemSet2","ProblemSet3","ProblemSet4","ProblemSet5")
    return NameOfProblemSet
}

@JsExport
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1 {
            +"Leader Board"
        }
        table {
            tr {
                th {
                    +"Team Name"
                }
                for(i in 0..ProblemSetNames().size){
                    th{
                        +ProblemSetNames()[i]
                    }
                }

            }
        }
        var numberOfRows: Int = RowNumbers()
        var numberOfProblemSets: Int = ProblemSetNumbers()
        for(i in 1..numberOfRows-1){
            tr {
                th {
                    +TeamNames()[i-1]
                }
                for (i in 1..numberOfProblemSets){
                    td {
                        +"Red"
                    }
                }
            }
        }
    }
}