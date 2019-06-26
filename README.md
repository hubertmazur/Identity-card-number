Numer „plastikowego” dowodu osobistego składa się z trzech liter i sześciu cyfr, z których jedna (pierwsza cyfra) to cyfra kontrolna.

Aby sprawdzić poprawność numeru i serii dowodu, należy najpierw zamienić litery na liczby, przypisując literom odpowiednio:

 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35

Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3. Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).

Przykład obliczeń (dla przykładowego dowodu osobistego przedstawionego na ilustracji obok, o numerze ABA300000):

Numer dowodu:  A    B    A    3    0    0    0    0    0
Wartość:      10   11   10    3    0    0    0    0    0
Wagi:          7    3    1    9    7    3    1    7    3
Iloczyny:     70   33   10   27    0    0    0    0    0
Sumowanie:    70 + 33 + 10 + 27 +  0 +  0 +  0 +  0 +  0 = 140

Reszta z dzielenia 140 przez 10 wynosi 0 (140 mod 10 = 0), więc jest to numer poprawny. 





Cyfra kontrolna i sprawdzanie poprawności numeru PESEL.

Jedenasta cyfra jest cyfrą kontrolną, służącą do wychwytywania przekłamań numeru. Jest ona generowana na podstawie pierwszych dziesięciu cyfr. Aby sprawdzić czy dany numer PESEL jest prawidłowy, należy, zakładając, że litery a-j to kolejne cyfry numeru od lewej, obliczyć wyrażenie:

9×a + 7×b + 3×c + 1×d + 9×e + 7×f + 3×g + 1×h + 9×i + 7×j

Jeżeli ostatnia cyfra otrzymanego wyniku nie jest równa cyfrze kontrolnej, to znaczy, że numer zawiera błąd.

Przykład dla numeru PESEL 44051401358:

    9×4 + 7×4 + 3×0 + 1×5 + 9×1 + 7×4 + 3×0 + 1×1 + 9×3 + 7×5 = 169

Wyznaczamy resztę z dzielenia sumy przez 10:

    169:10 = 16 reszta = 9

Wynik 9 nie jest równy ostatniej cyfrze numeru PESEL, czyli 8, więc numer jest błędny. 
