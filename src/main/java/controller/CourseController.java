package controller;

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view){
        this.model = model;
        this.view = view;
    }

    public void setCourseName(String name){
        model.setName(name);
    }

    public String getCourseName(){
        return model.getName();
    }

    public void setCourseId(String id){
        model.setId(id);
    }

    public String getCourseId(){
        return model.getId();
    }

    public void updateView(){
        view.printCourseDetails(model.getName(), model.getId());
    }
}