package com.software;

import com.software.entity.Library;
import com.software.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    @Test
    void libraryXMLTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        School school = context.getBean(School.class);
        Library library = context.getBean(Library.class);

        System.out.println("school = " + school);
        System.out.println("library = " + library);
        library.borrowBook();

        /*
            school = School(name=HEBNU, location=SJZ, phoneNumber=10086, isOpening=true)
            library = Library(bookNumber=99999999999, startTime=07:30, endTime=20:30,
                    school=School(name=HEBNU, location=SJZ, phoneNumber=10086, isOpening=true))
            借了一本书
         */
    }
}
