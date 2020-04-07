import data.Genre
import react.RBuilder
import react.RProps
import react.child
import react.functionalComponent

interface RGenreProps : RProps {
    var genre: Genre
}

val RFGenre =
    functionalComponent<RGenreProps> {
        +"${it.genre.style}"
    }

fun RBuilder.rgenre(genre: Genre) =
    child(RFGenre) {
        attrs.genre = genre
    }