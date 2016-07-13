package service.newFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by guogen.lgg on 2016/7/7.
 */
public class AlgorithmDiscovery {
    public static <E> E getArrayMax(Iterator<E> e ){
        E max = e.next();
        while(e.hasNext()){
            E temp = e.next();
            if( temp.hashCode() > max.hashCode()){
                max  = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println("max:"+getArrayMax(integers.iterator()));
    }
}
