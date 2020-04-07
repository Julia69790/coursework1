import data.Book
import react.*
import react.dom.h2
import react.dom.ol

interface RBookListProps : RProps {
    var books: Array<Book>
}

val RFBookList =
    functionalComponent<RBookListProps> {
        h2{
            +"Book"
        }
        ol {
            it.books.map {
                ol {
                    rbook(it)
                }
            }
        }
    }
     fun RBuilder.rbookList(books: Array<Book>) =
         child(RFBookList){
        attrs.books = books
    }
