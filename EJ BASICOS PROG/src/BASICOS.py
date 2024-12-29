import cmath
import math

print("EJERCICIO 1: ")

num1 = int(input("Dame el primer numero entero. "))
num2 = float(input("Dame el segundo numero con comas. "))
print(f"El primer numero: {num1}")
print(f"El primer numero: {num2}")

print("EJERCICIO 2: ")

radio = float(input("Dame el radio del circulo: "))
area = math.pi*(radio**2)
print(f"El area del circulo es: {area}")

print("EJERCICIO 3: ")


a = float(input("Introduce el coeficiente a: "))
b = float(input("Introduce el coeficiente b: "))
c = float(input("Introduce el coeficiente c: "))

raiz1 = (-b + cmath.sqrt((b * b) - 4 * a * c)) / (2 * a)
raiz2 = (-b - cmath.sqrt((b * b) - 4 * a * c)) / (2 * a)

print(f"Las raíces son: {raiz1} y {raiz2}")


print("EJERCICIO 4")

nombre=str(input("Dime tu nombre: "))
apellido=str(input("Dime tu apellido: "))

print("Te llamas "+nombre+" y te apellidas "+apellido)

print("EJERCICIO 5")

cont2 = 0
cont1 = 0
cont50 = 0
cont20 = 0
cont10 = 0
cont05 = 0
cont02 = 0
cont01 = 0

dinero=int(input("Dime tu dinero: "))

cont2 = dinero // 200
dinero = dinero % 200
cont1 = dinero // 100
dinero = dinero % 100
cont50 = dinero // 50
dinero = dinero % 50
cont20 = dinero // 20
dinero = dinero % 20
cont10 = dinero // 10
dinero = dinero % 10
cont05 = dinero // 5
dinero = dinero % 5
cont02 = dinero // 2
dinero = dinero % 2
cont01 = dinero // 1
dinero = dinero % 1

print(f"Tienes de vuelta {cont2} monedas de 2 euros, {cont1} de 1 euro, {cont50} monedas de 50 centimos, {cont20} monedas de 20 centimos, {cont10} monedas de 10 centimos, {cont05} monedas de 5 centimos, {cont02} monedas de 2 centimos {cont01} monedas de 1 centimo.")