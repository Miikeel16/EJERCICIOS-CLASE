import math

def ejercicio1():
    print("Inicio ejercicio 1")

    A = 42
    B = 21

    if A > B:
        print(f"El numero {A} es mayor que el numero {B}")
    elif B > A:
        print(f"El numero {B} es mayor que el numero {A}")
    else:
        print("Ambos numeros son iguales")
    
    print ("Fin ejercicio 1")
def ejercicio2():
    print("Inicio ejercicio 2")
    
    A = 25
    B = 5
    divi = 0

    if B != 0:
        divi = A / B
        print(f"El resultado de la division es {divi}")
    else:
        print("Has introducido el numero 0, vuelve a probar introduciendo otro numero")

    print ("Fin ejercicio 2")
def ejercicio3():
    print("Inicio ejercicio 3")

    lado1 = 90
    lado2 = 60
    lado3 = 90

    if lado1 == lado2 != lado3 or lado1 == lado3 != lado2 or lado3 == lado2 != lado1:
        print("El triangulo es isoscele")
    elif lado1**2 + lado2**2 == lado3**2 or lado1**2 + lado3**2 == lado2**2 or lado2**2 + lado3**2 == lado1**2:
        print("El triangulo es rectangulo")
    elif lado1 == lado2 and lado1 == lado3:
        print("El triangulo es equilatero")
    elif lado1 != lado2 and lado1 != lado3:
        print("El triangulo es escaleno")

    print ("Fin ejercicio 3")
def ejercicio4():
    print("Inicio ejercicio 4")

    a単o = 1996

    if a単o % 4 == 0:
        print("El a単o es bisiesto")
    else:
        print("El a単o no es bisiesto")

    print ("Fin ejercicio 4")
def ejercicio5():
    print("Inicio ejercicio 5")

    dia = 3

    if dia > 0 and dia < 8:
        if dia == 1:
            print("Lunes")
        elif dia == 2:
            print("Martes")
        elif dia == 3:
            print("Miercoles")
        elif dia == 4:
            print("Jueves")
        elif dia == 5:
            print("Viernes")
        elif dia == 6:
            print("Sabado")
        else:
            print("Domingo")
    else:
        print("Has introducido un numero incorrecto prueba con uno del 1 al 7")

    print ("Fin ejercicio 5")
def ejercicio6():
    print("Inicio ejercicio 6")

    mes = 4
    dias = 0

    if mes in [1,3,5,7,8,10,12]:
        print("Mes tiene 31 dias")
    elif mes in[4,6,9,11]:
        print("Tiene 30 dias")
    elif mes==2:
        print("Tiene 28 o 29 dias")
    else:
        print("No es un mes")
        
    print ("Fin ejercicio 6")
def ejercicio7():
    print("Inicio ejercicio 7")


    print ("Fin ejercicio 7")
def ejercicio8():
    print("Inicio ejercicio 8")


    print ("Fin ejercicio 8")
def ejercicio9():
    print("Inicio ejercicio 9")


    print ("Fin ejercicio 9")
