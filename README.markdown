# Basic Clock

Single Responsability Principle 

Problema: En la clase Clock y en CounterCollector se hacía funcionar el reloj para que inicie y se actualice el contenido de los counter elementos que poseían mediante el método work() y un while infinito. El reloj debería dejarle a otro módulo hacer ese trabajo. 


Solución: La creación de una clase Thread llamada CronometerThread que va a ser la encargada de llevar a cabo el avance del tiempo de cualquier reloj con un Formato de hora antes fijado. Por lo tanto, el método work() de Clock solo lleva a cabo la vida del hilo del tipo antes mencionado 


Interface Segregation Principle 

Problema: En la clase Counter y Countercollector existían métodos repetidos que se sobreescribían y la varible step siempre va a ser 1 y se tenía que de igual manera ingresar su valor. 


Solucion: Encapsulamos en la Interfaz Timed todos los métodos principales que debe tener una clase que sea cronometrada que son incrementar, decrementar y reset; también una variable estática step que será el paso que siempre dé un elemento de reloj. 


Open Closed Principle 

Problema: En la clase Clock se tenía un arreglo de longitud fija de los elementos dijados que solo eran: Horas, minutos, segundos. Por lo tanto, era muy rígida. 


Solucion: De TimeElement pueden heredar varios elementos que en un futuro se desea que posea el reloj (horas, minutos, segundos, incluso milisegundos) sin dañar el programa. Pero queda cerrado para que se realice cambios que dañen el resto del proyecto. 


Dependency Inversion Principle 

Problema: La clase Clock antigua extendía de CounterCollector y éste a su vez contenía un arreglos de Counter, era una jerarquía muy rígida y obsoleta. Si Counter no existía tampoco lo hacía CounterCollector peor aún Clock. Existía mucho nivel de acoplamiento en la antigua jerarquía. 

Solucion:  TimeElement es abstracto, lo vuelve independiente de lo detalles que implementen los modulos, como horas, minutos y segundos. Pero cada nueva clase que se agregue deberá implementar el método initializeEnd() que fija la variable end.


Liskov Substitution Principle 

Problema: En la clase clock se tenían variables estáticas que representaban valores fijos de start, end, step y el formato. Pero nos damos cuenta de que el valor de end va a ser diferente para cada tipo de dato de tiempo. Ej: Para hora es 24, para minutos y segundos va a ser 60.  
