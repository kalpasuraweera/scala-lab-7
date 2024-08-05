@main def main():Unit = print(calculateSquare(List(1, 2, 3, 4, 5)))

def calculateSquare(numbers:List[Int]):List[Int] = numbers.map(num=> num*num)