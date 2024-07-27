import scala.collection.mutable.ListBuffer

object student_record {

  def cal_grade(percentage: Double): Char = {
    if (percentage >= 90) 'A'
    else if (percentage >= 75) 'B'
    else if (percentage >= 50) 'C'
    else 'D'
  }

  def get_std_info(): (String, Int, Int, Double, Char) = {
    println("Enter name:")
    val name = scala.io.StdIn.readLine()
    println("Enter student marks:")
    val marks = scala.io.StdIn.readInt()
    println("Enter total possible marks:")
    val total_marks = scala.io.StdIn.readInt()

    val percentage = (marks.toDouble / total_marks.toDouble) * 100
    val grade = cal_grade(percentage)

    (name, marks, total_marks, percentage, grade)
  }

  def display_std_info(std_info: (String, Int, Int, Double, Char)): Unit = {
    println("Name: " + std_info._1)
    println("Marks: " + std_info._2)
    println("Total marks: " + std_info._3)
    println("Percentage: " + std_info._4)
    println("Grade: " + std_info._5)
  }

  def display_all_std_info(std_info_list: ListBuffer[(String, Int, Int, Double, Char)]): Unit = {
    if (std_info_list.isEmpty) {
      println("No student records available.")
    } else {
      std_info_list.foreach { std_info =>
        display_std_info(std_info)
        println("-" * 20)
      }
    }
  }

  def validate_input(name: String, marks: Int, total_marks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || total_marks < 0 || marks > total_marks) {
      (false, Some("Marks cannot be negative or greater than total marks"))
    } else {
      (true, None)
    }
  }

  def get_std_info_with_entry(): (String, Int, Int, Double, Char) = {
    var is_valid = false
    var name = ""
    var marks = 0
    var total_marks = 0
    var percentage = 0.0
    var grade = 'D'
    var error_msg: Option[String] = None
    while (!is_valid) {
      val (n, m, t, p, g) = get_std_info()
      name = n
      marks = m
      total_marks = t
      percentage = p
      grade = g

      val validation = validate_input(name, marks, total_marks)
      is_valid = validation._1
      error_msg = validation._2

      if (!is_valid) {
        println(s"Error: ${error_msg.get}")
      }
    }
    (name, marks, total_marks, percentage, grade)
  }

  def main(args: Array[String]): Unit = {
    val std_info_list = ListBuffer[(String, Int, Int, Double, Char)]()
    var continue = true
    while (continue) {
      println("Options:\n1. Enter student information\n2. Display all student records\n3. Quit")
      val input = scala.io.StdIn.readLine().trim
      input match {
        case "1" =>
          val std_info = get_std_info_with_entry()
          std_info_list += std_info
        case "2" =>
          display_all_std_info(std_info_list)
        case "3" =>
          continue = false
        case _ =>
          println("Invalid input. Please enter 1, 2, or 3.")
      }
    }
    println("Program terminated.")
  }
}
