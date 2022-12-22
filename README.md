# Archimedes
program for approximate calculation of Pi with the algorithm by Archimedes

based on the task:

Instructions - Method of Archimedes
Archimedes2 calculated the circumference of an n-corner, which circumscribes a circle with the diameter
d = 1, and that of an n-corner circumscribed by the circle. The larger n becomes,
the closer the arithmetic mean of these two values is to the true value of .
The iteration method presented here is a variant optimized for n =
6 2i - corners (ai - perimeter of the outer n-corner, bi - perimeter of the inner n-corner):
Iteration start a0 = 2
p
3 b0 = 3
Iteration step ai+1 = 2aibi
ai+bi
bi+1 =
p
ai+1bi
Archimedes ng with a 6-corner. He doubled this value four times up to the 96-corner and
thus nested the value of on the interval (310
71 ; 31
7 ). He received (handwritten!)
the estimated value of 3, 141635. Until the middle of the 17th century, nearly all attempts to
 to calculate the value of the interval were based on this method. Ludolf van Ceulen calculated as approximation  
3, 141 592 653 589 793 238 462 643 383 279 502 88.
a) Develop a program Archimedes.java for the computation of an approximate value
of by means of the algorithm of Archimedes. Determine the necessary number of steps
and calculate the absolute error of the calculated value to the value of the Java-
class constant Math.PI. Redirect the output to a file Archimedes.out.
Note: The procedure terminates when ai and bi are computationally indistinguishable.
b) Analyze the method of Archimedes in comparison with the Monte Carlo method:
How reliable are the expected results?

based on the task in german language:

Anweisungen - Methode von Archimedes
Archimedes2 berechnete den Umfang eines n-Ecks, welches einen Kreis mit dem Durchmesser
d = 1 umschreibt, und den eines n-Ecks, welches vom Kreis umschrieben wird. Je gröÿer n wird,
desto näher liegt das arithmetische Mittel dieser beiden Werte am wahren Wert von .
Bei dem hier vorgestellten Iterationsverfahren handelt es sich um eine Variante, die für n =
6  2i - Ecken optimiert ist (ai - Umfang des äuÿeren n-Eck, bi - Umfang des inneren n-Eck):
Iterationsanfang a0 = 2
p
3 b0 = 3
Iterationsschritt ai+1 = 2aibi
ai+bi
bi+1 =
p
ai+1bi
Archimedes ng mit einem 6-Eck an. Er verdoppelte diesen Wert viermal bis zum 96-Eck und
schachtelte damit den Wert von  auf das Intervall (310
71 ; 31
7 ) ein. Er erhielt (handschriftlich!)
den Schätzwert von   3, 141635. Bis Mitte des 17. Jahrhunderts grien fast alle Versuche
 zu berechnen auf diese Methode zurück. Ludolf van Ceulen berechnete als Näherung  
3, 141 592 653 589 793 238 462 643 383 279 502 88.
a) Entwickeln Sie ein Programm Archimedes.java zur Berechnung eines Näherungswertes
von  mittels des Algorithmus von Archimedes. Ermitteln Sie die notwendige Schrittanzahl
und berechnen Sie den absoluten Fehler des berechneten Wertes zu dem Wert der Java-
Klassenkonstanten Math.PI. Leiten Sie die Ausgaben in eine Datei Archimedes.out um.
Hinweis: Das Verfahren bricht ab, wenn sich ai und bi rechentechnisch nicht mehr unterscheiden.
b) Analysieren Sie die Methode von Archimedes im Vergleich mit dem Monte Carlo Verfahren:
Wie verläÿlich sind die zu erwartenden Ergebnisse?
