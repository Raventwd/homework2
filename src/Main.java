public class Main {
    public static void main(String[] args) {
        //Homework 1
        //Task 1
        var dog = 8.0;
        System.out.println(dog);
        dog += 4;
        System.out.println(dog);
        dog -= 3.5;
        System.out.println(dog);
        //Task 2
        var cat = 3.6;
        System.out.println(cat);
        cat += 4;
        System.out.println(cat);
        cat -= 1.6;
        System.out.println(cat);
        //Task 3
        var paper = 763789;
        System.out.println(paper);
        paper += 4;
        System.out.println(paper);
        paper -= 7639;
        System.out.println(paper);

        //Homework 2
        //Task 1
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        //Task 2
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        //Homework 3
        //Task 1
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var weightSummary = firstFighterWeight + secondFighterWeight;
        var firstWeightDifference = (secondFighterWeight - firstFighterWeight);
        System.out.println(weightSummary);
        System.out.println(firstWeightDifference);
        //Task 2
        var secondWeightDifference = (secondFighterWeight % firstFighterWeight);
        System.out.println(secondWeightDifference);
        //Task 3
        var scheduleHours = 640;
        var oneEmployeeHours = 8;
        var totalEmployeesNumber = scheduleHours / oneEmployeeHours;
        System.out.println("Всего работников в компании - " + totalEmployeesNumber + " человек");
        var newTotalEmployeesNumber = totalEmployeesNumber + 94;
        var newScheduleHours = newTotalEmployeesNumber * oneEmployeeHours;
        System.out.println("Если в компании работает " + newTotalEmployeesNumber + " человек, то всего " + newScheduleHours + " часов работы может быть поделено между сотрудниками");
    }
}