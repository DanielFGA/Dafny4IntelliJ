/**
In der Main wird gezeigt, das der Alogorithmus, aus einem unsortierten Array mit Integers, ein sortiertes Array macht.
 */
method Main() {
    var b : array<int> := new int[5];
    b[0], b[1], b[2], b[3], b[4] := 4, 2, 3, 5, 1; //Array wird mit Integers in nicht korrekter Reihenfolge befüllt
    print "\nArray b:\n";
    print b[..];
    print "\tSorted(b): ";
    print sorted(b[..]);
    selectionSort_(b);
    print "\n\nArray b nach selectionSort:\n";
    print b[..];
    assert sorted(b[..]);
    print "\tSorted(b): ";
    print(sorted(b[..]));
    print "\n ";
}
/**
SelectionSort macht aus einem unsortierten Array mit Integers, ein sortiertes Array mit Integers.
Als Parameter kommt das unsortierte Array rein, welches verändert wird und mindestens ein Element beinhalten muss.
Es wird sichergestellt, dass das Array sortiert ist und das die Werte nach dem Algorithmus nicht verändert wurden,
nur die Reihenfolge wurde geändert.
 */
method selectionSort_(unsorted:array<int>)
modifies unsorted
requires unsorted.Length > 1
ensures sorted(unsorted[..])
ensures equals(unsorted[..], old (unsorted[..]))
{
    var i := 0; //Zählervariable für die äußere Schleife
    var minIndex := 0; //Speichervariable für den Index im Array, mit dem kleinsten Wert
    
    //Die äußere Schleife repräsentiert den sortierten Teil des Arrays.
    while (i + 1 < unsorted.Length) //Die Schleife läuft solange, bis der sortierte Teil des Arrays genau so groß ist, wie das urspüngliche Array
    decreases unsorted.Length - i
    invariant 0 <= i <= unsorted.Length
    invariant sorted(unsorted[0..i])
    invariant equals(unsorted[..], old (unsorted[..])) 
    invariant sortedSmallerUnsorted(unsorted[0..i], unsorted[i..])
    {
        //Die Zählervariabe j für die innere Schleife, wird immer mit i initalisiert, da j
        //den unsortierten Teil des Array darstellt und immer am Ende des sortierten Arrays beginnt
        var j := i; 
        minIndex := i; //Der niedrigste Index ist am Anfang immer das erste Element in dem unsortierten Teil des Arrays.

        while (j < unsorted.Length) //Die Schleife läuft solange, bis der komplette unsortierte Teil einmal durchgegangen wurde.
        decreases unsorted.Length - j
        invariant i <= minIndex < unsorted.Length
        invariant 0 <= j <= unsorted.Length
        invariant forall k :: i  <= k < j ==> unsorted[k] >= unsorted[minIndex] // Prüft, ob der Integer (minIndex) immer kleiner ist als seine rechten Nachbarn im durchsuchten Bereich.
        invariant sorted(unsorted[0..i])
        invariant equals(unsorted[..], old (unsorted[..]))
        invariant sortedSmallerUnsorted(unsorted[0..i], unsorted[i..])
        {
            if (unsorted[j] < unsorted[minIndex]) //Wenn das aktuelle Element kleiner ist, als das Minimum, dann
            {
                minIndex := j; //Wird j (Index von dem aktuellen Element) der neue minIndex.
            }
            j := j + 1;
        }
        
        unsorted[minIndex], unsorted[i] := unsorted[i], unsorted[minIndex]; //Hier werden die Elemente in dem Array getauscht.
        
        assert forall k :: i < k < unsorted.Length ==> unsorted[k] >= unsorted[i];  // Prüft, ob alle noch nicht berücksichtigten Integer >= dem zu letzt berücksichtigtem Integer sind
    
        i := i + 1;
    }
}      

/*  Prüft ob die Sequenz sortiert ist.
*   @param a  -  zu prüfende Sequenz
*/
function method sorted(a:seq<int>):bool
{
    forall j,k :: 0 <= j < k < |a| ==> a[j] <= a[k]
}

/*  Prüft ob zwei Sequenzen die gleichen Integer Werte besitzen.
*   @param a  -  Sequenz 1
*   @param b  -  Sequenz 2
*/
function equals(a:seq<int>, b:seq<int>):bool 
{
    multiset(a) == multiset(b)
}

/*  Prüft ob der sortierte Teil des Arrays mit jedem Element <= der 
*   Elemente des unsortierten Teils des Arrays ist.
*   @param a  -  Teilsequenz 1
*   @param b  -  Teilsequenz 2
*/
function sortedSmallerUnsorted(sorted:seq<int>, unsorted:seq<int>): bool
{
    forall k,j :: (0 <= k < |sorted|) && (0 <= j < |unsorted|) ==> sorted[k] <= unsorted[j]
}