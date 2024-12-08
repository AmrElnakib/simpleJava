package com.company;

import java.util.ArrayList;

public class JavaConcepts {

    public static void main(String[] args) {
        // Object reference
        Person person1 = new Person("Alice", 30);
        changeName(person1); // if we commented/deleted this line, will return 'Alice' as we didn't apply changeName Method
        System.out.println(person1.name); // Output: Bob

        // Passing by value (primitive)
        int y = 10;
        System.out.println(y); // Output: 10

        System.out.println("Numbers and its different increments:::");

        int number = 5;
        int postIncrementedNum = number++; // post increment
        System.out.println("number++ = " + number +  "  Number after post increment: " + postIncrementedNum);

        int secondNumber = 5;
        int preIncrementedNum = ++secondNumber; // pre increment
        System.out.println("++number = " + secondNumber + "  Number after pre increment: " + preIncrementedNum);



        // Increment using the += operator
        number += 2; // Add 2 to number
        System.out.println("Number after adding 2: " + number); // Output: 9


        // Method overloading
        int sum1 = add(2, 3);
        double sum2 = add(2.5, 3.7);
        System.out.println(sum1 + " , " + sum2);


        // Two-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //prints 1 2 3
        }                            //    4 5 6

        // For loop
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i); // prints from 0 to 4
        }

        // While loop
        int i = 0;
        while (i < 4)
        {
            System.out.println(i); // prints from 0 to 3
            i++;
        }

        // Do-while loop
        int j = 0;
        do
        {
            System.out.println(j);  // prints from 0 to 2
            j++;
        }
        while (j < 3);

        // Continue
        for (int k = 0; k < 10; k++)
        {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println(k);
        }

        // Nested loops
        for (int m = 1; m <= 3; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names)
        {
            System.out.println(name);
        }

        // Encapsulation
        Person person2 = new Person("David", 25);
        System.out.println(person2.getName());
        person2.setAge(30);
        System.out.println(person2.getAge());

        // If/else
        int age = 20;

        if (age >= 18)
        {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }


    }

    public static void changeName(Person person)  // method changes the name to the value: "Bob"
    {
        person.name = "Bob";
    }



    public static int add(int a, int b)
    {
        return a + b;
    }

    public static double add(double a, double b)
    {
        return a + b;
    }
}

    class Person {

    public String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

        public String getName()
        {
            return name;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public int getAge()
        {

        return age;

        }

}