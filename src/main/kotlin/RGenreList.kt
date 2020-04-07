import data.Genre
import react.RBuilder
import react.RProps
import react.child
import react.dom.h2
import react.dom.ol
import react.functionalComponent

interface RGenreListProps : RProps {
    var genres: Array<Genre>
}

val RFGenreList =
    functionalComponent<RGenreListProps> {
        h2{
            +"Genre"
        }
        ol {
            it.genres.map {
                ol {
                    rgenre(it)
                }
            }
        }
    }
fun RBuilder.rgenreList(genres: Array<Genre>) =
    child(RFGenreList){
        attrs.genres = genres
    }