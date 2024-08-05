@main def main():Unit = print(filterPrime(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

def filterPrime(numbers:List[Int]):List[Int] = numbers.filter(num =>isPrime(num))

def isPrime(number:Int, i:Int = 2):Boolean = i.match{
    case i if i == number => true
    case i if number % i == 0 => false
    case _ => isPrime(number, i+1 )
}