//groovy高效特性

//1. 可选的类型定义
def num1 = 100

//2 assert
assert num1 == 100

//3 括号是可选的
//println num1

//4 字符串
def s1 = 'hello'
def s2 = "hello hello ${num1}"
def s3 = '''hello
    this
    world
'''
/*
println '-----------------------------------'
println s1
println s2
println s3
*/

//5 集合API
//a. List
def language = ['Java', 'C', 'Python']  //对应的Java类型是java.util.ArrayList
language << 'HTML' //向集合之中添加元素
assert language.getClass() == ArrayList
//println language.getClass()
assert language.size() == 4
//println language

//b. map
def ninjia = ['naruto': 20, 'sasuke': 21, "sakura": 19]//对应的Java类型是java.util.LinkedHashMap
ninjia.kakaxi = 26 //向map中添加元素
//println ninjia
//println  ninjia.naruto  //取map中的元素
//println  ninjia['kakaxi']   //取map中的元素
//println ninjia.getClass()//对应的Java类型是java.util.LinkedHashMap

//6 闭包，在Gradle中通常作为参数使用
def c1 = {
    v ->
        println "hello" + "..." + v
}

def c2={
    println "haha"
}

def func01(Closure closure){
    closure("xiaoming")
}

def func02(Closure closure){
    closure()
}

func01(c1)
func02(c2)
















