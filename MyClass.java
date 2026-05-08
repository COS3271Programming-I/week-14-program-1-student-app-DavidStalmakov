package projectPerson;

import java.util.Scanner;

///// Person Class
class Person {

	String firstName;
	String lastName;
	String gender;
	int age;
	double weight;
	double height;
	String ethnicGroup;
	String religion;
	
	void sayGreeting() {
	    System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
	}
	
	void sayPrayer() {
	    System.out.println(firstName + " is saying a " + religion + " prayer.");
	}
	
	void takeNap() {
	    System.out.println(firstName + " is taking a nap.");
	}
	
	void eatSomething() {
	    System.out.println(firstName + " is eating something.");
	}
	
	String getName() {
	    return firstName + " " + lastName;
	}
	
	void setReligion(String newReligion) {
	    religion = newReligion;
	}
	}
	
	///// Student Class
	class Student extends Person {
	
	String major;
	String classRank;
	String studentEmail;
	
	void goToClass() {
	    System.out.println(firstName + " is going to " + major + " class.");
	}
	
	void eatSomething() {
	    System.out.println(firstName + " is eating ramen noodles and pizza.");
	}
	
	String getMajor() {
	    return major;
	}
	
	String getClassRank() {
	    return classRank;
	}
	
	String getStudentEmail() {
	    return studentEmail;
	}

	void setMajor(String newMajor) {
	    major = newMajor;
	}
	
	void setClassRank(String newRank) {
	    classRank = newRank;
	}
	
	void setStudentEmail(String newEmail) {
	    studentEmail = newEmail;
	}
}

public class MyClass {
	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println("Enter first name: ");
        student1.firstName = input.nextLine();

        System.out.println("Enter last name:");
        student1.lastName = input.nextLine();

        System.out.println("Enter gender:");
        student1.gender = input.nextLine();

        System.out.println("Enter age:");
        student1.age = input.nextInt();

        System.out.println("Enter weight (lbs):");
        student1.weight = input.nextDouble();

        System.out.println("Enter height (inches):");
        student1.height = input.nextDouble();
        input.nextLine();

        System.out.println("Enter ethnic group:");
        student1.ethnicGroup = input.nextLine();

        System.out.println("Enter religion:");
        student1.religion = input.nextLine();

        // Student Attributes
        System.out.println("Enter major:");
        student1.major = input.nextLine();

        System.out.println("Enter class rank (Freshman, Sophomore, Junior, Senior):");
        student1.classRank = input.nextLine();

        System.out.println("Enter student email:");
        student1.studentEmail = input.nextLine();

        // Output
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + student1.firstName + " " + student1.lastName);
        System.out.println("Gender: " + student1.gender);
        System.out.println("Age: " + student1.age);
        System.out.println("Weight: " + student1.weight + " lbs");
        System.out.println("Height: " + student1.height + " inches");
        System.out.println("Ethnic Group: " + student1.ethnicGroup);
        System.out.println("Religion: " + student1.religion);
        System.out.println("Major: " + student1.major);
        System.out.println("Class Rank: " + student1.classRank);
        System.out.println("Student Email: " + student1.studentEmail);

        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Greeting");
            System.out.println("2. Say Prayer");
            System.out.println("3. Take a Nap");
            System.out.println("4. Eat Something");
            System.out.println("5. Print Name");
            System.out.println("6. Change Religion");
            System.out.println("7. Go To Class");
            System.out.println("8. Change Major");
            System.out.println("9. Print Student Email");
            System.out.println("10. Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    student1.sayGreeting();
                    break;

                case 2:
                    student1.sayPrayer();
                    break;

                case 3:
                    student1.takeNap();
                    break;

                case 4:
                    student1.eatSomething();
                    break;

                case 5:
                    System.out.println("Name: " + student1.getName());
                    break;

                case 6:
                    System.out.println("Enter new religion:");
                    String newReligion = input.nextLine();
                    student1.setReligion(newReligion);
                    System.out.println("Religion updated.");
                    break;

                case 7:
                    student1.goToClass();
                    break;

                case 8:
                    System.out.println("Enter new major:");
                    String newMajor = input.nextLine();
                    student1.setMajor(newMajor);
                    System.out.println("Major updated.");
                    break;

                case 9:
                    System.out.println("Student Email: " + student1.getStudentEmail());
                    break;

                case 10:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);
    }
}
