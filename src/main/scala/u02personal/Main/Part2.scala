package u02personal.Main

object Part2 extends App :
    // First part
    /*val f = (x: Int) => x match
        case x if x >= 0 => "positive"
        case _ => "negative"
        
    def pos(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"
    
    val n = 1
    
    println(f(n))
    println(pos(n)) */
    
    // Second part
    /*def neg[X](f: X => Boolean): X => Boolean = !f(_)
    
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    println(notEmpty("foo"))
    println(notEmpty(""))
    println(notEmpty("foo") && !notEmpty(""))*/
    
    // Fourth part
    /*val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
    
    val p2 = (x: Int, y: Int, z: Int) => x <= y && y == z
    
    def p3(x: Int)(y: Int)(z: Int) : Boolean =
        x <= y && y == z
        
    def p4(x: Int, y: Int, z: Int): Boolean =
        x <= y && y == z*/
    
    // Fifth part
    /*def compose[A, B, C](f: A => B, g: C => A): C => B =
        f(g(_))
        
    val dec: Int => Int = _ - 1
    val double: Int => Int = _ * 2
    
    val even: Int => Boolean = _ % 2 == 0
    val conv: Boolean => String = _ match
        case true => "pari"
        case _ => "dispari"
    
    println(compose(dec, double)(5))
    println(compose(conv, even)(5))

    // Sixth part
    def composeThree[A,B,C,D](f: C => D, g: B => C, h: A => B): A => D =
        compose(f, compose(g, h))(_)*/
    
    // Seventh part
    /*def power(base: Double, exponent: Int): Double =
        exponent match
            case 0 => 1
            case _ => base * power(base, exponent - 1)
    
    def powerTail(base: Double, exponent: Int): Double =
        @annotation.tailrec
        def _power(acc: Double, exponent: Int): Double =
            exponent match
                case 0 | 1 => acc
                case _ => _power(acc*base, exponent-1)
            
        _power(base, exponent)
    
    println(powerTail(5, 4))*/
    
    //Eight part
    
    /* def reverseNumber(n: Int): Int =
        @annotation.tailrec
        def _reverseNumber(n: Int, acc: Int): Int =
            n match
                case 0 => acc
                case _ => _reverseNumber(n/10, acc*10 + n%10)
        
        _reverseNumber(n, 0)
    
    println(reverseNumber(12345))
     */
    
    // Ninth part
    enum Expr:
        case Literal(n: Int)
        case Add(a: Expr, b: Expr)
        case Multiply(a: Expr, b: Expr)
        
    object Expr:
        def evaluate(expr: Expr): Int = expr match
            case Literal(n) => n
            case Add(a, b) => evaluate(a) + evaluate(b)
            case Multiply(a, b) => evaluate(a) * evaluate(b)
        
        def show(expr: Expr): String = expr match
            case Literal(n) => n.toString
            case Add(a, b) => "(" + show(a) + " + " + show(b) + ")"
            case Multiply(a, b) => show(a) + " * " + show(b)
            
        
    val a: Expr = Expr.Literal(5)
    val b: Expr = Expr.Literal(10)
    val sum: Expr = Expr.Add(a, b)
    val mult: Expr = Expr.Multiply(a, sum)
    
    println(Expr.evaluate(a))
    println(Expr.evaluate(sum))
    println(Expr.evaluate(mult))
    println(Expr.show(mult))
