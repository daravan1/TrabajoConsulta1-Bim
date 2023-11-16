/* Ejercicio 1
1. Devolvera un dato de tipo Double
2. Recibe una funcion y dos Doubles
*/
def integracion (f : Double => Double, a: Double, b: Double ) = {
  val x: Double = (a + b) / 2
  ( a -b) * ( f(a) + 4*f(x) + f(b) ) / 6
}

//Ejercicio 2

val f1 = (x: Double) => -Math.pow(x,2) + (8 * x) - 12
integracion(f1, 5,3)
val f2 = (x: Double) => 3 * Math.pow(x, 2)
integracion(f2, 2, 0)
val f3 = (x: Double) => x + 2 * Math.pow(x,2) - Math.pow(x, 3) + 5*Math.pow(x,4)
integracion(f3, 1, -1)
val f4 = (x: Double) => (2*x +1) / (Math.pow(x,2) + x)
integracion(f4, 2, 1)
val f5 = (x: Double) => Math.exp(x)
integracion(f5, 1, 0)
val f6 = (x: Double) => 1 / Math.pow(x-1, 1.0/2)
integracion(f6, 3, 2)
val f7 = (x: Double) => 1 / (1 + Math.pow(x,2))
integracion(f7, 1, 0)

//Ejercicio 3

def diferencia (x : Double, y : Double ) = {
  Math.abs(x - y)
}

diferencia(7.33, integracion(f1, 5,3))
diferencia(8, integracion(f2, 2, 0))
diferencia(3.333, integracion(f3, 1, -1))
diferencia(1.09861, integracion(f4, 2, 1))
diferencia(1.71828, integracion(f5, 1, 0))
diferencia(0.828427, integracion(f6, 3, 2))
diferencia(0.7853398, integracion(f7, 1, 0))
