import react.dom.*
import kotlinx.browser.document
import kotlinx.css.*
import styled.*

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}