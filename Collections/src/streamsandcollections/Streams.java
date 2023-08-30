package streamsandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    //Write a Java 8 program to concatenate two Streams?
        public static void main(String[] args) {
            //Stream<String> stream1 = Stream.of("Ramya", "B");
           // Stream<String> stream2 = Stream.of("Seema", "c");

            List<String> list = new ArrayList<String>();
            list.add("Ramya");
            list.add("pR");
            List<String> list2 = new ArrayList<String>();
            list.add("Ramya1");
            list.add("seema2");
            System.out.println("ArrayList : " + list.toString());

            Stream.concat(list.stream(),list2.stream())
                    .forEach(element -> {System.out.println(element);
                    });
        }
    }

