/*
    1. 클라이언트. 빌더 패턴의 시작점
        TourDirector에 빌더 넘기고, 완성된 TourPlan 받음
 */

package designpatterns._01_creational_patterns._04_builder;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

        System.out.println(tourPlan);
        System.out.println(tourPlan1);
    }
}
