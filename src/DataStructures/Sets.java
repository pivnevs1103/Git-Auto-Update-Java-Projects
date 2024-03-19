package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
         // 1. Define the collection
        // Sets is random order and does not take duplicates. So if you add multiple of the same animal in this case
        // it will only save it once
        Set<String> animals = new HashSet<>();

        // 2. Adding animals
        animals.add("dog");
        animals.add("pig");
        animals.add("cat");
        animals.add("snake");
        animals.add("pig");
        animals.add("snake");

        System.out.println(animals);

        // Create a new set that we use for comparison
        Set<String> farmAnimals = new HashSet<>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");
        System.out.println(farmAnimals);

        // What is the INTERSECTION between animals and farm animals
        // 1. Copy existing set into a new set
        Set<String> interscetionSet = new HashSet<>(animals);

        // 2. Retain ONLY the elements that are also in the other set ("AND")
        interscetionSet.retainAll(farmAnimals);
        System.out.println("The intersection is " + interscetionSet);

        // 3. What is the UNION  between the set (in BOTH animals and farmAnimals "OR")
        Set<String> unionSet = new HashSet<>(animals);
        unionSet.addAll(farmAnimals);
        System.out.println("The union is: " + unionSet);

        // 4. What is difference (animals but NOT farm animals "NOT")
        Set<String> differenceSet = new HashSet<>(animals);
        differenceSet.remove(farmAnimals);
        System.out.println("The difference is " + differenceSet);

        // LinkedHash - in order that they were entered, more like a stack
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // Adding animals now
        linkedHashSet.add("dog");
        linkedHashSet.add("cat");
        linkedHashSet.add("rabbit");
        // Notice that they are now in the same order that we added them. Hash set on the other hand was random
        System.out.println(linkedHashSet);

        // TreeSet rearranges it to be in alphabetical order(natural order)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("cow");
        treeSet.add("zebra");
        treeSet.add("horse");
        treeSet.add("dog");
        // This will be in alphabetical order
        System.out.println(treeSet);

    }
}
