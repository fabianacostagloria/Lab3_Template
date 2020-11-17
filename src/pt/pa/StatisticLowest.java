package pt.pa;

import pt.pa.model.StudentGrade;

import java.util.List;

public class StatisticLowest implements Statistic {
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()) return -1;
        return grades.stream().mapToDouble(val -> (double) val.getGrade()).min().orElse(-1.0);
    }
}
