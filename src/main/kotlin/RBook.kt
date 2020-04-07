import data.Book
import react.*
import react.functionalComponent

interface RBookProps : RProps {
    var book: Book
}

val RFBook =
    functionalComponent<RBookProps> {
            +"${it.book.title}"
    }

fun RBuilder.rbook(book: Book) =
    child(RFBook) {
        attrs.book = book
    }