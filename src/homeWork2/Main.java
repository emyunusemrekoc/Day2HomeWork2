package homeWork2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giriþ için Temel Kurs", 0, "Engin Demirog");

		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 0, "Selim Kutluay");

		Course course3 = new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 0, "Ahmet Dönence");

		Course[] courses = { course1, course2, course3 };

		System.out.println("KURSLAR " + "\n---------------");

		for (Course course : courses) {

			System.out.println("Kurs Id :" + course.id);
			System.out.println("Kurs Ýsmi :" + course.name + " // Kurs Ücreti :" + course.coursePrice + " // Eðitmen :"
					+ course.instructor);
		}

		Instructor instructor1 = new Instructor(1, "Engin Demirog", "engindemirog@gmail.com");

		Instructor instructor2 = new Instructor(2, "Selim Kutluay", "selimkutluay@gmail.com");

		Instructor instructor3 = new Instructor(3, "Ahmet Dönence", "ahmetdonence@gmail.com");

		Instructor[] instructors = { instructor1, instructor2, instructor3 };

		System.out.println("\nEÐÝTÝMCÝLER " + "\n---------------");

		for (Instructor instructor : instructors) {

			System.out.println("Eðitimci Id :" + instructor.id);
			System.out.println("Eðitimci :" + instructor.name + " // Eðitimci Mail :" + instructor.mail);

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
