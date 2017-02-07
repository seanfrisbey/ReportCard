package com.example.java;

/**
 *	The course class contains the pertinent information for a course to be added to a reportCard.
 */
public class Course {

	private String mCourseName;
	private String mTeacherName;
	private float mGradePercentage;
	private String mGradeLetter; //Letter grades should only be A+, A, A-, B+, B, B-, C+, C, C-, D+, D, D-, or F

	//Default empty constructor
	public Course() {}

	//Constructor with just a course name
	public Course(String courseName) {
		mCourseName = courseName;
	}

	//Constructor with all the available details
	public Course(String courseName, String teacherName, float gradePercentage, String gradeLetter) {
		mCourseName = courseName;
		mTeacherName = teacherName;
		mGradePercentage = gradePercentage;
		mGradeLetter = gradeLetter;
	}

	public String getCourseName() {
		return mCourseName;
	}

	public String getTeacherName() {
		return mTeacherName;
	}

	public float getGradePercentage() {
		return mGradePercentage;
	}

	public String getGradeLetter() {
		return mGradeLetter;
	}

	public void setCourseName(String courseName) {
		mCourseName = courseName;
	}

	public void setTeacherName(String teacherName) {
		mTeacherName = teacherName;
	}

	public void setGradePercentage(float gradePercentage) {
		mGradePercentage = gradePercentage;
	}

	public void setGradeLetter(String gradeLetter) {
		mGradeLetter = gradeLetter;
	}
}
