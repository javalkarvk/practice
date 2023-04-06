package com.learning.practice.java_8_features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentNameOccurence {
  public static void main(String[] args) {
    List<Student> ls = Arrays.asList(new Student(1,"ABC",9),new Student(3,"DEF",8),new Student(2,"GHI",10),new Student(2,"GHI",10),new Student(2,"GHI",10));
    Map<Integer, Long> m = ls.stream().collect(Collectors.groupingBy(Student::getRollNo,Collectors.counting()));
    for(Integer s : m.keySet()) {
      System.out.println(s+" : "+m.get(s));
    }
    List<Student> l2 = ls.stream().distinct().collect(Collectors.toList());
    System.out.println(l2);
    
    List<Integer> intList = Arrays.asList(1,4,5,6,1,2,4);
    List<Integer> intListResult = intList.stream().distinct().collect(Collectors.toList());
    System.out.println(intListResult);
    List<Integer> intListResultSort = intList.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(intListResultSort);
    List<Integer> intListResultSortReverse = intList.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    System.out.println(intListResultSortReverse);
    Map<Integer, Long> listOccurence = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    for (Integer i : listOccurence.keySet()) {
      System.out.println(i+":"+listOccurence.get(i));
    }
    List<Integer> intList2 = Arrays.asList(10,20,3,4,60);
    List<Integer> intList3 = Stream.concat(intList.stream().distinct(), intList2.stream().distinct()).distinct().collect(Collectors.toList());
    System.out.println(intList3);
    
//  List<Integer> intList4 = new ArrayList<>(intList);
//  intList4.retainAll(intList2);
    List<Integer> intList4 = intList.stream().filter(i->!intList2.contains(i)).collect(Collectors.toList());
    System.out.println(intList4);
    
    List<Student> studentList = List.of(new Student(2,"ABC",9),new Student(1,"ABC",10),new Student(4,"ABC",8),new Student(3,"ABC",9));
    List<Student> studentList2 = List.of(new Student(5,"ABC",9),new Student(6,"ABC",7),new Student(7,"ABC",6),new Student(6,"ABC",5));
    List<Student> sl3 = studentList.stream().sorted((s1,s2)->{return s1.getRollNo() < s2.getRollNo()?-1:s1.getRollNo()==s2.getRollNo()?0:-1;}).collect(Collectors.toList());
    List<Student> sl4 = studentList.stream().sorted(Comparator.comparing(Student::getRollNo).reversed()).collect(Collectors.toList());
    System.out.println(sl4);
    Student s2 = sl4.get(1);
    System.out.println(s2);
    List<Student> sl5 = studentList2.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
    System.out.println(sl5);
    Map<Integer, Long> map = studentList.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));
    map.forEach((k,v)->System.out.println(k+":"+v));
    List<Student> sl6 = studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRollNo).reversed()).collect(Collectors.toList());
    System.out.println(sl6);
    Map<String, Long> m1 = studentList.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
    m1.forEach((k,v)->System.out.println(k+":"+v));
  }
}
