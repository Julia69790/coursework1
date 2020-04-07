import data.Author
import data.Book
import react.RBuilder
import react.RProps
import react.child
import react.dom.h2
import react.dom.ol
import react.functionalComponent

interface RAuthorListProps : RProps {
    var authors: Array<Author>
}

val RFAuthorList =
    functionalComponent<RAuthorListProps> {
        h2{
            +"Author"
        }
        ol {
            it.authors.map {
                ol {
                    rauthor(it)
                }
            }
        }
    }
fun RBuilder.rauthorList(authors: Array<Author>) =
    child(RFAuthorList){
        attrs.authors = authors
    }
