import data.Author
import react.RBuilder
import react.RProps
import react.child
import react.functionalComponent

interface RAuthorProps : RProps {
    var author: Author
}

val RFAuthor =
    functionalComponent<RAuthorProps> {
        +"${it.author.name}"
    }

fun RBuilder.rauthor(author: Author) =
    child(RFAuthor) {
        attrs.author = author
    }