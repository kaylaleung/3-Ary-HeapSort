/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestHeapsort3 {
    
    public static void main(String[] args)
    {
    
    
    int[] a = new int[100];
    for(int i = 0; i < a.length; i++)
    {
        a[i] = (int) (Math.random()*1000);
    }
    
    Heapsort3 h = new Heapsort3(a.length);  
    
        for(int i = 0; i < a.length; i++)
        {
            h.insert(a[i]);
        }
    System.out.print("Unsorted Array: ");
    h.print();
    h.sort();
    System.out.println();
    System.out.print("HeapsortedArray: ");
    h.print();
    
    
    }
}

/*OUTPUT

Unsorted Array: 2 4 34 27 18 8 2 5 9 10 3 
HeapsortedArray: 2 2 3 4 5 8 9 10 18 27 34 
BUILD SUCCESSFUL (total time: 0 seconds)

//100 random elements
Unsorted Array: 741 358 452 518 900 187 723 782 132 810 714 726 110 835 503 858 848 967 237 325 7 100 712 199 207 304 495 254 734 240 33 260 987 631 909 238 725 467 403 99 662 711 763 563 259 446 149 306 609 517 44 804 171 966 31 462 723 755 230 211 316 536 356 929 196 536 329 682 641 913 571 56 400 323 690 521 951 808 991 105 127 524 382 424 728 286 581 463 635 379 164 377 588 598 943 965 233 2 
HeapsortedArray: 2 31 33 44 56 99 100 105 110 127 132 145 149 164 171 187 196 199 207 211 230 233 237 238 240 254 259 260 286 304 306 316 323 325 329 356 358 377 379 382 400 403 424 446 452 462 463 467 495 503 517 518 521 524 536 536 563 571 581 588 598 609 631 635 641 662 682 690 711 712 714 723 723 725 726 728 734 741 755 763 782 804 808 810 835 848 858 900 909 913 929 943 951 965 966 967 987 991 
BUILD SUCCESSFUL (total time: 0 seconds)

*/