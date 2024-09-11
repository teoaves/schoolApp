package gr.aueb.cf.schoolapp.service.exception;

import gr.aueb.cf.schoolapp.model.Teacher;

public class TeacherNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public TeacherNotFoundException(Teacher teacher) {
        super("Teacher with id " + teacher.getId() + " not found");
    }

    public TeacherNotFoundException(String s) {
        super(s);

    }
}
