package homeWork2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs", 0, "Engin Demirog");

		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 0, "Selim Kutluay");

		Course course3 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 0, "Ahmet D�nence");

		Course[] courses = { course1, course2, course3 };

		System.out.println("KURSLAR " + "\n---------------");

		for (Course course : courses) {

			System.out.println("Kurs Id :" + course.id);
			System.out.println("Kurs �smi :" + course.name + " // Kurs �creti :" + course.coursePrice + " // E�itmen :"
					+ course.instructor);
		}

		Instructor instructor1 = new Instructor(1, "Engin Demirog", "engindemirog@gmail.com");

		Instructor instructor2 = new Instructor(2, "Selim Kutluay", "selimkutluay@gmail.com");

		Instructor instructor3 = new Instructor(3, "Ahmet D�nence", "ahmetdonence@gmail.com");

		Instructor[] instructors = { instructor1, instructor2, instructor3 };

		System.out.println("\nE��T�MC�LER " + "\n---------------");

		for (Instructor instructor : instructors) {

			System.out.println("E�itimci Id :" + instructor.id);
			System.out.println("E�itimci :" + instructor.name + " // E�itimci Mail :" + instructor.mail);

		}
		
		System.out.println();

		CourseManager courseManager = new CourseManager();

		courseManager.addCourse(course1);

		courseManager.addCourse(course2);

		courseManager.addCourse(course3);
		
		System.out.println();

		InstructorManager instructorManager = new InstructorManager();

		instructorManager.addInstructor(instructor1);
		
		instructorManager.addInstructor(instructor2);
		
		instructorManager.addInstructor(instructor3);

	
	}

}
