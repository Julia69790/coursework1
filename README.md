# coursework1
Созданы функциональные компоненты, содержащие название книг, авторов и жанров.<br>
Пример:<br>
    
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
    
![](/coursework1/компонент.png)
Каждый такой компонент входит в состав компонента высокого уровня, где содержится список всех книг, авторов и жанров.<br>
Пример:<br>
    
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
  
 ![](/coursework1/список.png)
Каждый из данных компонентов содержится в компоненте более высокого уровня, который включает в себя заголовки, список книг, список авторов и список жанров.<br>
Компонент RCatalog:<br>
    
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
    
 ![](/coursework1/компоненты.png)
