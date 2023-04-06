package com.interview.toptal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToptalTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ToptalTest test = new ToptalTest();
    
    List<String> rule = Arrays.asList("U>N", "G>A", "R>Y", "H>U", "N>G", "A>R");
    String result = test.getString(rule, new ArrayList<>(), new ArrayList<>());
    System.out.println(rule + ":" + result);
    rule = Arrays.asList("I>F", "W>I", "S>W", "F>T"); // SWIFT
    result = test.getString(rule, new ArrayList<>(), new ArrayList<>());
    System.out.println(rule + ":" + result);
    rule = Arrays.asList("R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"); // PORTUGAL
    result = test.getString(rule, new ArrayList<>(), new ArrayList<>());
    System.out.println(rule + ":" + result);
    rule = Arrays.asList("W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"); // SWITZERLAND
    result = test.getString(rule, new ArrayList<>(), new ArrayList<>());
    System.out.println(rule + ":" + result);
  }
  
  private String getString(List<String> rule, List<String> pendingRule, List<String> result) {
    boolean added = false;
    for (String s : rule) {
      added = false;
      String[] str = s.split(">");
      if (result.isEmpty()) {
        result.add(str[0]);
        result.add(str[1]);
        added = true;
      } else {
        if (result.contains(str[0])) {
          result.add(result.indexOf(str[0])+1, str[1]);
          added = true;
        }
        else if (result.contains(str[1])) {
          result.add(result.indexOf(str[1]), str[0]);
          added = true;
        }
      }
      if (!added) {
        pendingRule.add(s);
      }
    }
    if (!pendingRule.isEmpty()) {
      getString(pendingRule, new ArrayList<>(), result);
    }
    return String.join("", result);
  }
}
