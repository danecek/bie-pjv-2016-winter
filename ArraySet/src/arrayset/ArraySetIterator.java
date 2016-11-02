/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayset;

import java.util.Iterator;

public class ArraySetIterator implements Iterator<Integer> {

    int actual;
    Integer[] data;
    int size;

    public ArraySetIterator(Integer[] data, int size) {
        this.data = data;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return actual < size;
    }

    @Override
    public Integer next() {
        return data[actual++];
    }

}
