package otherpatterns.unitofwork;

import java.util.*;
import java.util.logging.Level;

public class ApplicationRunner {
    public static void main(String[] args) {

        MyLogger.LOGGER.log(Level.INFO, "Starting operations ...");

        //creat new student
        StudentEntity johnDou = new StudentEntity(1, "John Dou", "San-Francisco, California, USA");

        //create all environment
        Map<String, Set<StudentEntity>> context = new HashMap<>();
        Set<StudentEntity> studentDB = new HashSet<>();
        StudentRepository studentRepository = new StudentRepository(context, studentDB);

        //add new student
        studentRepository.registerNew(johnDou);

        //modify
        johnDou.setAddress("LA, California, USA");
        studentRepository.registerModified(johnDou);

        //commit operation
        studentRepository.commit();

        //creating new students
        StudentEntity Vasil = new StudentEntity(2, "Vasil Ermakov", "Minsk, Belarus");
        StudentEntity Maria = new StudentEntity(3, "Maria Ermakova", "Minsk, Belarus");
        StudentEntity Emily = new StudentEntity(4, "Emily Ermakova", "Minsk, Belarus");

        //add new students to context
        studentRepository.registerNew(Vasil);
        studentRepository.registerNew(Maria);
        studentRepository.registerNew(Emily);

        //delete John Dou
        studentRepository.registerDelete(johnDou);

        //commit operation
        studentRepository.commit();

        //print student DB
        studentRepository.getStudentDB().stream().forEach(System.out::print);
        System.out.println("\n");

        MyLogger.LOGGER.log(Level.INFO, "Finished operations successful");
    }
}
