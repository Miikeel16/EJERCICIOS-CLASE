        # Escribe un programa que solicite al usuario una lista de 10 números enteros.
        # Luego, el programa debe calcular el número impar más alto, el número impar
        # más bajo y la media de los números impares.
# print("Ejercicio 1")

# max = -99999999 
# min = 99999999   
# suma = 0
# cont = 0
# contimp=0

# while cont<=9: 
#     num = int(input("Dame un número: "))
    
#     if num % 2 != 0:
#         if num > max:
#             max = num
#         if num < min:
#             min = num
#         contimp=contimp+1
#         suma = suma+num
#     cont =cont+ 1
    
# if contimp>0:
#     print(f"El impar más alto es: {max}")
#     print(f"El impar más bajo es: {min}")
#     print(f"Media impares: {suma / contimp}")
# else:
#     print("No hay impares")

        # Escribe un programa que solicite al usuario ingresar la temperatura diaria de
        # una semana (7 días). El programa debe calcular la temperatura máxima, la
        # mínima y la temperatura media de la semana.
# print("Ejercicio 2")
# cont=1
# max= -99999999
# min= 99999999
# suma=0

# while cont<=7:
#     temp=int(input("Dame la temperatura del dia: "))
#     suma=suma + temp
#     if temp>max:
#         max=temp
#     elif temp<min:
#         min=temp
#     cont=cont+1
# print(f"Max temperatura: {max}")
# print(f"Min temperatura: {min}")
# print(f"Media temperatura: {suma/7}")
  
#         Escribe un programa que pida al usuario ingresar una serie de números
#         hasta que se ingrese un cero. El programa debe calcular la media de los
#         números ingresados y luego determinar cuál es el número máximo, el mínimo
#         y la diferencia entre los dos.

# print("Ejercicio 3")

# max=-99999999
# min=99999999
        
# num=int(input("Dame un numero, si escribes 0 termina: "))

# while (num!=0):
#     if (num>max):
#         max=num
#     elif (num<min):
#         min=num
            
#     num=int(input("Dame un numero, si escribes 0 termina: "))
#     diferencia=max-min

# print(f"Max num: {max}")
# print(f"Min num: {min}")
# print(f"Diferencia: {diferencia}")


        
        # Escribe un programa que solicite las alturas (en cm) de un grupo de
        # estudiantes. El número de estudiantes no es conocido de antemano, pero el
        # ingreso se detiene cuando el usuario ingresa una altura negativa. El
        # programa debe calcular la altura máxima, mínima y la media de las alturas
        # ingresadas.


# print("Ejercicio 4")
        
# max=-999999
# min=999999
# suma=0
# cont=0

# alt=int(input("Dame una altura en cm, si es negativa termina: "))

# while (alt>0):
    
#     if (alt>max):
#         max=alt
            
#     if (alt<min):
#         min=alt
#     suma =suma+alt
            
#     alt=int(input("Dame una altura en cm, si es negativa termina: "))
#     cont=cont+1
        
        
# print(f"Max altura: {max}")
# print(f"Min altura {min}")
# print(f"Media altura: {suma/cont}")

        
#         Escribe un programa que solicite al usuario ingresar las ventas mensuales de
#         una empresa durante un año (12 meses). El programa debe dividir las ventas
#         en 4 trimestres y calcular lo siguiente:
#             ■ La venta máxima y mínima de cada trimestre.
#             ■ La media de ventas por trimestre.
#             ■ El trimestre con la mayor venta media.

print("Ejercicio 5")
        
cont=1
maxpri= -9999999
minpri= 9999999
medpri= 0
sumapri=0
maxsec= -9999999
minsec= 9999999
medsec= 0
sumasec=0
maxter= -9999999
minter= 9999999
medter= 0
sumater=0
maxcua= -9999999
mincua= 9999999
medcua=0
sumacua=0

while (cont<=12):
    venta=int(input("Dame la venta de los 12 meses: "))
    if (cont>=1 and cont<=3):
            
        if (venta<minpri):
            minpri=venta
            
        if (venta>maxpri):
            maxpri=venta
            
        sumapri= sumapri+venta
        medpri= sumapri/cont
        
    if (cont>=4 and cont<=6):
            
        if (venta<minsec):
            minsec=venta
        if (venta>maxsec):
            maxsec=venta

        sumasec= sumasec+venta
        medsec= sumasec/cont

    if (cont>=7 and cont<=9):
        
        if (venta<minter):
            minter=venta
        if (venta>maxter):
            maxter=venta

        sumater= sumater+venta
        medter= sumater/cont
        
    if (cont>=10 and cont<=12):
            
        if (venta<mincua):
            mincua=venta
            
        if (venta>maxcua):
            maxcua=venta
            
        sumacua= sumacua+venta
        medcua= sumacua/cont
        
    cont=cont+1
       
print("Primer Trimestre: ")
print(f"Max venta: {maxpri} Min venta : {minpri} Media ventas: {medpri}")
print("Segundo Trimestre: ")
print(f"Max venta: {maxsec} Min venta: {minsec} Media ventas: {medsec}")
print("Tercer Trimestre: ")
print(f"Max venta: {maxter} Min venta: {minter} Media ventas: {medter}")
print("Cuarto Trimestre: ")
print(f"Max venta: {maxcua} Min venta: {mincua} Media ventas: {medcua}")

print("Trimestre con mayor venta media: ")
if (medpri>medsec and medpri>medter and medpri>medcua):
    print(f"Primer Trimestre: {medpri}")
elif (medsec>medpri and medsec>medter and medsec>medcua):
    print(f"Segundo Trimestre: {medsec}")
elif (medter>medpri and medter>medsec and medter>medcua):
    print(f"Tercer Trimestre: {medter}")
else:
    print(f"Cuarto Trimestre: {medcua}")
       

