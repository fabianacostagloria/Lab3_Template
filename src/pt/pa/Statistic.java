package pt.pa;

import pt.pa.model.StudentGrade;

import java.util.List;

/**
 * Interface Statistic define the method that will be implemented concrete statistic
 */
public interface Statistic {
    /**
     * @param grades - list of student grades
     * @return grades ?
     */
    double compute(List<StudentGrade> grades);
}
