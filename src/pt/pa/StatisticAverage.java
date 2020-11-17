package pt.pa;

import pt.pa.model.StudentGrade;

import java.util.List;

public class StatisticAverage implements Statistic {

    @Override
    public double compute(List<StudentGrade> grades) {
        return grades.stream().mapToDouble(val -> (double) val.getGrade()).average().orElse(-1.0);
    }
}
