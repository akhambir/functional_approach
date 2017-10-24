package com.akhambir.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorRef {

    public List<Person> namesToPersonViaVarargConstructor(List<String> names) {
        return names.stream()
                .map(name -> name.split(" "))
                .map(Person::new)
                .collect(Collectors.toList());
    }



    public List<Person> namesToPersonViaLambda(List<String> names) {
        return names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());
    }

    public List<Person> namesToPersonViaMethodRef(List<String> names) {
        return names.stream()
                .map(Person::new)
                .collect(Collectors.toList());
    }



    /*
     *   Copy constructor, same as
     *   public Person(Person p) {
     *       this.name = p.name;
     *   }
     */
    public List<Person> copyListValues(List<String> names) {
        return names.stream()
                .map(Person::new)
                .collect(Collectors.toList());
    }

    public Person[] namesToArrayOfPersons(List<String> names) {
        return names.stream()
                .map(Person::new)
                .toArray(Person[]::new);
    }

    class Person {
        private String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public Person(String ... names) {
            this.name = Arrays.stream(names)
                    .collect(Collectors.joining(" "));
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
