@main def main(): Unit = print(filterEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

def filterEvenNumbers(numbers: List[Int]): List[Int] = numbers.filter(num => num%2 == 0)