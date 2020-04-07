import data.*
import react.RBuilder
import react.RProps
import react.child
import react.dom.h2
import react.dom.ol
import react.functionalComponent

interface RCatalogProps : RProps {
    var books: Array<Book>
    var authors: Array<Author>
    var genres: Array<Genre>
    var heading: Array<String>
}

val RFCatalogList =
    functionalComponent<RCatalogProps> {
        it.heading.map {
            h2{
                ol {
                    +it
                }
            }
        }
        rbookList(it.books)
        rauthorList(it.authors)
        rgenreList(it.genres)
    }
fun RBuilder.rcatalog(books: Array<Book>,authors: Array<Author>,genres: Array<Genre>, heading:Array<String>) =
    child(RFCatalogList){
        attrs.books = books
        attrs.authors = authors
        attrs.genres = genres
        attrs.heading = heading
    }