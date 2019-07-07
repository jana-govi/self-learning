package com.example.demo.stream_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String args[]){
        new StreamTest().matchName();
    }



    private void matchName() {
        List<Student> testList = prepareTestData();

        List<Student> result = testList
                .stream()
                .filter(student -> student.getName().equalsIgnoreCase("Jana"))
                .collect(Collectors.toList());

        for(Student s : result){
            if(null != s && null != s.getName()){
                System.out.println(s.getName() +":"+ s.toString());
            }
        }
    }

    private static List<Student> prepareTestData() {

        Student s1 = new Student("Jana",31,new Address("London"), Arrays.asList(new MobileNumber("123456")) );
        Student s2 = new Student("Guna",41,new Address("London"), Arrays.asList(new MobileNumber("456789")) );
        Student s3 = new Student("Fana",45,new Address("London"), Arrays.asList(new MobileNumber("012345")) );

        return Arrays.asList(s1,s2,s3);

    }
}
