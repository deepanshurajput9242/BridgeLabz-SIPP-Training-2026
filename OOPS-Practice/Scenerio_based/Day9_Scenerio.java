package oops_practice.Scenerio_based;

    import java.io.*;
import java.util.*;

    class Student {
        String name;
        int[] marks = new int[5];
        int total;
        double average;
        String grade;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
            calculateResult();
        }

        void calculateResult() {
            total = 0;

            for (int mark : marks) {
                total += mark;
            }

            average = total / 5.0;

            // Nested Conditions
            if (average >= 90) {
                grade = "A+";
            } else {
                if (average >= 80) {
                    grade = "A";
                } else {
                    if (average >= 70) {
                        grade = "B";
                    } else {
                        if (average >= 60) {
                            grade = "C";
                        } else {
                            if (average >= 50) {
                                grade = "D";
                            } else {
                                grade = "F";
                            }
                        }
                    }
                }
            }
        }
    }

    public class Day9_Scenerio {

        static Student[] students = new Student[100];
        static int count = 0;

        public static void readFromFile(String fileName) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

                String line;

                while ((line = br.readLine()) != null) {

                    String[] data = line.split(" ");

                    String name = data[0];
                    int[] marks = new int[5];

                    for (int i = 0; i < 5; i++) {
                        marks[i] = Integer.parseInt(data[i + 1]);
                    }

                    students[count++] = new Student(name, marks);
                }

                System.out.println("Student data loaded successfully.");

            } catch (FileNotFoundException e) {
                System.out.println("Input file not found.");
            } catch (IOException e) {
                System.out.println("Error while reading file.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid marks format in file.");
            }
        }

        public static void searchStudent(String name) {

            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (students[i].name.equalsIgnoreCase(name)) {

                    System.out.println("\nStudent Found");
                    System.out.println("Name: " + students[i].name);
                    System.out.println("Total: " + students[i].total);
                    System.out.println("Average: " + students[i].average);
                    System.out.println("Grade: " + students[i].grade);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }

        public static void sortStudents() {

            for (int i = 0; i < count - 1; i++) {

                for (int j = 0; j < count - i - 1; j++) {

                    if (students[j].total < students[j + 1].total) {

                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }

            System.out.println("Students sorted by total marks.");
        }

        public static void writeReport(String fileName) {

            try (BufferedWriter bw =
                         new BufferedWriter(new FileWriter(fileName))) {

                bw.write("Name\tTotal\tAverage\tGrade\n");
                bw.write("------------------------------------\n");

                for (int i = 0; i < count; i++) {

                    bw.write(students[i].name + "\t" +
                            students[i].total + "\t" +
                            students[i].average + "\t" +
                            students[i].grade);

                    bw.newLine();
                }

                System.out.println("Report written to " + fileName);

            } catch (IOException e) {
                System.out.println("Error writing report file.");
            }
        }

        public static void displayAll() {

            System.out.println("\nStudent Records");

            for (int i = 0; i < count; i++) {
                System.out.println(
                        students[i].name + " | Total: " +
                                students[i].total + " | Grade: " +
                                students[i].grade);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            readFromFile("students.txt");

            displayAll();

            System.out.print("\nEnter student name to search: ");
            String name = sc.nextLine();

            searchStudent(name);

            sortStudents();

            System.out.println("\nAfter Sorting:");
            displayAll();

            writeReport("report.txt");

            sc.close();
        }
    }

