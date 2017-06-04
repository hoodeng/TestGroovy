package com.test.dsl

/**
 * Created by wudeng on 17/6/4.
 */
//move forward and then turn left
def (forward, left, then, fast, right) = ['forward', 'left', '', 'fast', 'right']

public def move(dir) {
    println("moving $dir")
    this
}

def and(then) {
    println("and $then")
    this
}

def turn(dir) {
    println("turning $dir")
    this
}

def jump(speed, dir) {
    println("jumping $speed and $dir")
    this
}

def jump (dir){
    println("jumping $dir")
    this
}

move forward
turn left
jump fast and forward

