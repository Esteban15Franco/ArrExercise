# ArrExercise
Este repositorio contiene una serie de ejercicios básicos usando arreglos en Java.
El objetivo es reforzar habilidades clave como la manipulación de arreglos, control
de flujo, lógica condicional y operaciones comunes como conteos o cálculos de promedios.

Además de funcionar como un recorderis personal, este proyecto también busca ser un recurso
útil para quienes están empezando a programar 💻✨.

## 📋 Contenido
Cada ejercicio incluye:

- Lectura de datos desde teclado.
- Uso de estructuras como for y if.
- Cálculo de promedios, conteos y selección de valores.
- Entradas y salidas esperadas para comparar resultados.

 

## Ejercicios:
### 1.  Mostrar elementos en orden alternado (último, primero, penúltimo...)

**Descripcion:**  
Leer 10 números enteros desde el teclado para
llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden:
el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así
sucesivamente

**Entrada:**  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

**Salida:**  {10, 1, 9, 2, 8, 3, 7, 4, 8, 6, 5}

- Se crea un arreglo de diez elementos.
- Se lee los 10 numeros desde la entrada con un bucle for.
- Se usa otro bucle for para mostrar e imprimir el arreglo en el orden requerido.

### 2. Numero mas alto en arreglo (11-99)  
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor 
considerar uno solo.

**Entrada:** {14, 33, 15, 36, 78, 21, 43}

**Salida:** 78

- Se crea el arreglo de siete elementos, la entrada de datos y el auxiliar para el 
maximo.
- Hacemos una condicion dentro del bucle para verificar el minimo y el maximo requeridos.
- Creamos otro for para recorrer el arreglo, y usamos un operador ternario para verificar
el numero mayor.

### 3. Promedios y conteo
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de
los números positivos, el promedio de los negativos y contar el número de ceros.

**Entrada:** {4, -3, 0, 7, -1, 0, 2}

**Salida:** 
Promedio positivos: 4,33  
Promedio negativos: -2,00  
Promedio ceros: 2,00

- Se acumulan sumas y cantidades por tipo de número.
- Se evita división por cero.

### 4. Mayor ocurrencia en el arreglo
se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa
que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad
de veces que aparece en el arreglo.  

**Entrada:** {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

**Salida:**  
La mayor ocurrencia es: 3  
El elemento que más se repite es: 5

- Se crea un segundo arreglo que almacenara la cantidad de veces que se repite un numero
- Se usa un condicional para hallar el numero con mayor concurrencia y su indice








