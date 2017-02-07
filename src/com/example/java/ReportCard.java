package com.example.java;

import java.util.ArrayList;

/**
 *	The reportCard class contains an ArrayList of Course objects containing the course information for the student.
 */
public class ReportCard {

	private String mStudentName = "No Name";
	private ArrayList<Course> mCourseList = new ArrayList<>();

	//Default, empty constructor
	public ReportCard() {}

	//Constructor with just a student name
	public ReportCard(String studentName) {
		mStudentName = studentName;
	}

	//Constructor with a student name and a courses array
	public ReportCard(String studentName, ArrayList<Course> courseList) {
		mStudentName = studentName;
		mCourseList = courseList;
	}

	public void addCourse(Course course) {
		mCourseList.add(course);
	}

	public Course getCourse(int courseNumber) {
		return mCourseList.get(courseNumber);
	}

	public void removeCourse(int index) {
		mCourseList.remove(index);
	}

	public void setStudentName(String studentName) {
		mStudentName = studentName;
	}

	public void setCourseList (ArrayList<Course> courseList) {
		mCourseList = courseList;
	}

	public String getStudentName() {
		return mStudentName;
	}

	public int getNumberOfCourses() {
		return mCourseList.size();
	}

	public ArrayList<Course> getCourseList() {
		return mCourseList;
	}
}
