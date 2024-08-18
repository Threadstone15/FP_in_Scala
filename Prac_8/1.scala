import scala.io.StdIn.readLine

object caesar_cipher {

    def encrypt(text: String, shift: Int): String = {
        text.map {
            case c if c.isLower => ((c - 'a' + shift) % 26 + 'a').toChar
            case c if c.isUpper => ((c - 'A' + shift) % 26 + 'A').toChar
            case c => c
        }.mkString
    }

    def decrypt(text: String, shift: Int): String = {
        text.map {
            case c if c.isLower => ((c - 'a' - shift + 26) % 26 + 'a').toChar
            case c if c.isUpper => ((c - 'A' - shift + 26) % 26 + 'A').toChar
            case c => c
        }.mkString
    }

    def main(args: Array[String]): Unit = {
        println("Enter a text to dencrypt:")
        val text = readLine()
        println("Enter the shift value:")
        val shift = readLine().toInt


        val decrypted = decrypt(text, shift)
        println(s"Decrypted text: $decrypted")
    }
}
