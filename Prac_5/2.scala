case class Book(title: String, author: String, isbn: String)

object lib_mana {
  
  var books: Set[Book] = Set(
    Book("Dark Matter", "Blake Crouch", "10010"),
    Book("The Tattooist of Auschwitz", "Heather Morris", "10011"),
    Book("2001: A Space Odyssey", "Arthur C. Clarke", "10012")
  )

  def add_book(): Unit = {
    println("Enter book title:")
    val book_title = scala.io.StdIn.readLine()
    println("Enter book author:")
    val book_author = scala.io.StdIn.readLine()
    println("Enter book ISBN:")
    val book_isbn = scala.io.StdIn.readLine()
    books += Book(book_title, book_author, book_isbn)
    println("Book added successfully")
  }

  def check_book(): Unit = {
    println("Enter book ISBN:")
    val book_isbn = scala.io.StdIn.readLine()
    if (books.exists(_.isbn == book_isbn)) println("Book found")
    else println("Book not found")
  }

  def remove_book(): Unit = {
    println("Enter book ISBN:")
    val book_isbn = scala.io.StdIn.readLine()
    val bookOption = books.find(_.isbn == book_isbn)
    bookOption match {
      case Some(book) => 
        books -= book
        println("Book removed successfully")
      case None => println("Book not found")
    }
  }

  def display_books(): Unit = {
    println("Books available:")
    books.foreach(println)
  }

  def search_by_title(): Unit = {
    println("Enter book title:")
    val book_title = scala.io.StdIn.readLine()
    val bookOption = books.find(_.title.equalsIgnoreCase(book_title))
    bookOption match {
      case Some(book) => println(s"Book found: $book")
      case None => println("Book not found")
    }
  }
  
  def all_books_by_author(): Unit = {
    println("Enter book author:")
    val book_author = scala.io.StdIn.readLine()
    val booksByAuthor = books.filter(_.author.equalsIgnoreCase(book_author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $book_author:")
      booksByAuthor.foreach(println)
    } else {
      println("No books found by this author")
    }
  }

  def main(args: Array[String]): Unit = {
    while (true) {
      println("1-add book, 2-check book, 3-remove book, 4-display books, 5-search by title, 6-all books by author, 7-exit")
      val choice = scala.io.StdIn.readInt()
      choice match {
        case 1 => add_book()
        case 2 => check_book()
        case 3 => remove_book()
        case 4 => display_books()
        case 5 => search_by_title()
        case 6 => all_books_by_author()
        case 7 => sys.exit(0)
        case _ => println("Invalid choice, please try again")
      }
    }
  }
}
