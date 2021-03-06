package com.plcoding.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.plcoding.multipleroomtables.entities.School
import com.plcoding.multipleroomtables.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(parentColumn = "schoolName", entityColumn = "schoolName"
    )
    val students: List<Student>
)
/*
public class SchoolWithStudents {
   @Embedded
   public school School;

   @Relation(parentColumn = ""schoolName"", entityColumn = "schoolName", entity = Student.class)
   public List<Book> books;
}
 */