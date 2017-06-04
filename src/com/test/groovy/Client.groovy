package com.test.groovy


def test(int n, closure) {
    closure n
}

def sum = { n ->
    def total = 0;
    for(i in 0..n){
        total += i;
    }
    total;
}

def factorial = {
    def total = 1;
    for(i in 1..it){
        total *= i;
    }

    total
}

//println(test(5, sum));
//println(test(4,factorial))


MetaClassTest test = new MetaClassTest();
test.func1();
test.metaClass.func2 = {def f ->
    println("this is func2 $f")
}

test.func2(10)

//test.func3(100)

test.metaClass{
    func4(){ i ->
        println("this is func4 $i")
    }

    func5 = {
        println("this is func5")
    }
}

test.func5();
test.func4(10000)
System.out.println("");