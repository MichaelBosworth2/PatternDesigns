package controller;

public class ControllerPatternDemo {

    public static void main(String[] args) {

        //fetch student record based on id from the database
        Course model  = retrieveCourseFromDatabase();

        //Create a view : to write course details on console
        CourseView view = new CourseView();

        CourseController controller = new CourseController(model, view);

        controller.updateView();

        //update model data
        controller.setCourseName("Kotlin");
        System.out.println("\nAfter updating, Course Details are as follows\n");

        controller.updateView();
    }

    private static Course retrieveCourseFromDatabase(){
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        return course;
    }

}
