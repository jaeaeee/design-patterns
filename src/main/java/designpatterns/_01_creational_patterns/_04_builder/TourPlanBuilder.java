/*
    3. 빌더 역할 명세 정의
        메서드 체이닝을 위해 return 타입 규정
 */

package designpatterns._01_creational_patterns._04_builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
