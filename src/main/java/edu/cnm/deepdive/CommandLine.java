package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
    System.out.println(args.length);
    for (String arg : args) {
      System.out.println(arg);
    }
  }

}
