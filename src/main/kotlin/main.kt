import data.authorList
import data.bookList
import data.genreList
import react.dom.*
import kotlin.browser.document


fun main() {
    val heading = arrayOf("Book","Author","Genre")
    render(document.getElementById("root")!!) {
        h1 {
            +"Catalog"
        }
        rcatalog(bookList.toTypedArray(),authorList.toTypedArray(),genreList.toTypedArray(), heading)
    }
}
