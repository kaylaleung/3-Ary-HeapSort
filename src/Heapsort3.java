/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class Heapsort3<Key extends Comparable<Key>> {
    
    private Key[] pq;
    private int n = 0;
    
    public Heapsort3(int maxN)
    {
        pq = (Key[]) new Comparable[maxN];
    }
    private boolean less(int i, int j)
    {
        return (pq[i].compareTo(pq[j])) < 0;
    }
    
    public void insert(Key v)
    {
        pq[n++] = v;
        //swim(N);
        //System.out.println(n);
    }
    
    private void exch(int i, int j)
    {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
    private void swim(int k)
    {
        while (k > 1 && less(k/3,k))
        {
            exch(k/3,k);
            k = k/3;
        }
    }
    
    private void sink (int k, int N)
    {
        while(3*k <= N)
        {
           int j = 3*k;
           if(j < N && less(j,j+1) && less(j-1, j+1))
           {
               j++;
           }
           else if(j < N && less(j,j-1) && less(j+1, j-1))
           {
               j--;
           }
           if(!less(k,j)) 
           {
               break;
           }
           exch(k,j);
           k = j;
        }
    }
    
    public void sort()
    {
        int N = pq.length-1;
        for(int k = N/3; k >=1; k--)
        {
            sink(k, N);
        }
        while(N > 1)
        {
            exch(1, N--);
            sink(1, N);
        }
    }
    
    public void print()
    {
        for(int i = 2; i < pq.length; i++)
        {
            System.out.print(pq[i] + " ");
        }
    }
}
